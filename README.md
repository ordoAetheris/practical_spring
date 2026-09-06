# Practical Spring — 80 задач

От BeanPostProcessor до Transactional Outbox. Уровень: Mid → Staff.

## Быстрый старт

```bash
cd practical_spring

# Прочитай задание (javadoc в main файле)
cat src/main/java/com/practice/task01_bean_post_processor/TimingBeanPostProcessor.java

# Реализуй (замени throw UnsupportedOperationException на код)
# Напиши тесты (шаблон + test_hints.md)

# Запуск тестов
mvn test -Dtest="com.practice.task01_bean_post_processor.*"

# Все тесты
mvn test
```

## Структура

```
practical_spring/
├── src/main/java/com/practice/
│   ├── task01_bean_post_processor/
│   │   └── TimingBeanPostProcessor.java   # задание (javadoc + TODO)
│   ├── task02_conditional_bean/
│   └── ...                                # 80 задач
├── src/test/java/com/practice/
│   ├── task01_bean_post_processor/
│   │   ├── TimingBeanPostProcessorTest.java  # шаблон теста
│   │   └── test_hints.md                     # подсказки
│   └── ...
├── doc/
│   ├── REVIEW_PROMPT.md
│   ├── HOW_TO_REVIEW.md
│   └── CHECKLIST.md
└── pom.xml                                # Spring Boot 3.3, Java 21
```

## Секции

| Секция | Задачи | Тема | Уровень |
|--------|--------|------|---------|
| Spring Core | 1-10 | BPP, Conditional, Scope, Events, AOP, Lifecycle, ConfigProperties | Medium |
| Spring Data | 11-20 | Specification, Pagination, Projections, Batch Insert, Locking, Flyway, Redis | Medium-Hard |
| Spring Security | 21-30 | JWT, OAuth2, Method Security, CORS, Rate Limiting, CSRF, Filter Chain | Medium-Hard |
| Spring Web | 31-40 | Exception Handler, Validation, Content Negotiation, WebSocket, RestClient, HATEOAS | Medium |
| Cloud / Production | 41-50 | Circuit Breaker, Retry, Config Server, Tracing, Health, Testcontainers, GraalVM | Medium-Hard |
| Reflection & Annotations | 51-55 | Custom Validators, @CurrentUser, @Conditional, Annotation Scanning, **@Retry через BPP** | Hard |
| Filters & Interceptors | 56-59 | Request ID + MDC, HandlerInterceptor, Filter Ordering, Reactive WebFilter | Medium |
| Observability | 60-65 | Micrometer, Business Metrics, MDC+Trace, OpenTelemetry, Custom Spans, Exemplars | Medium-Hard |
| Custom Starter | 66-70 | Minimal → Properties → Conditional → Endpoint → **http-metrics-starter** | Hard |
| Messaging & RPC | 71-80 | gRPC, RabbitMQ, Kafka, **Transactional Outbox + Saga** | Hard |

## Как работать с задачами

1. **Прочитай javadoc** — описание механизма, что под капотом, что реализовать
2. **Реализуй** — замени `throw new UnsupportedOperationException("TODO")` на код
3. **Напиши тесты** — шаблон + `test_hints.md`
4. **Запусти** — `mvn test -Dtest="com.practice.taskNN_name.*"`
5. **Self-review** → `doc/CHECKLIST.md`, AI-ревью → `doc/REVIEW_PROMPT.md`

## Методика таймера

| Секция | Разведка | Боевой | Hard cap |
|--------|----------|--------|----------|
| Core, Web, Filters | без таймера | 60 мин | 69 мин |
| Data, Security, Cloud | без таймера | 75 мин | 86 мин |
| Reflection, Starters, Messaging | без таймера | 90 мин | 103 мин |

## Философия: Spring Framework

### "Как работает под капотом" > "Как пользоваться API"

Это НЕ задачник "научись использовать @Cacheable". Это задачник "реализуй аналог @Cacheable через BeanPostProcessor + AOP, чтобы понять что Spring делает за тебя".

**Почему это важно для Staff:**
- На собесе спросят "как работает @Transactional?" → ты ответишь: AOP proxy, TransactionInterceptor, PlatformTransactionManager, begin/commit/rollback, self-invocation bypass
- В проде: "почему @Cacheable не работает?" → потому что self-invocation, бин вызывает this.method() минуя proxy
- При проектировании: "как сделать свой @Auditable?" → BPP + ProxyFactory + MethodInterceptor (task 55)

### Ключевые концепции Spring (что должен знать Staff)

**IoC Container Lifecycle:**
```
BeanDefinition → Constructor → BPP.before → @PostConstruct → InitializingBean →
BPP.after (proxy creation!) → Bean ready → ... → @PreDestroy → DisposableBean
```

**AOP Proxy — механизм всей "магии":**
- `@Transactional` → TransactionInterceptor
- `@Cacheable` → CacheInterceptor
- `@Async` → AsyncExecutionInterceptor
- `@Retry` → RetryOperationsInterceptor
- Всё через BeanPostProcessor → ProxyFactory → MethodInterceptor chain

**Self-invocation — ловушка #1:**
```java
@Service
public class OrderService {
    @Transactional
    public void createOrder() { ... }

    public void processAll() {
        this.createOrder(); // ← @Transactional НЕ работает! this != proxy
    }
}
```
Решения: inject self, AopContext.currentProxy(), выделить в другой бин.

**Auto-configuration — как Spring Boot "магически" всё настраивает:**
```
spring-boot-starter-web в classpath
  → AutoConfigurationImportSelector находит WebMvcAutoConfiguration
  → @ConditionalOnClass(DispatcherServlet.class) → true
  → @ConditionalOnMissingBean(WebMvcConfigurer.class) → регистрирует default
  → Tomcat embedded container стартует
```
Task 66-70 учат создавать свои starters по тому же механизму.

### Типичные ловушки

**1. @Transactional на private методе — не работает:**
Spring AOP: proxy перехватывает только public/protected. Private → bypass.

**2. @Value без SpEL — просто строка:**
```java
@Value("${app.port}") // property placeholder — ок
@Value("#{@myBean.port}") // SpEL — ок
@Value("app.port") // СТРОКА "app.port", не значение property!
```

**3. Circular dependency — Spring 6 strict:**
```java
@Service class A { @Autowired B b; }
@Service class B { @Autowired A a; }
// Spring 6: BeanCurrentlyInCreationException (no lazy resolution by default)
// Fix: @Lazy на одном из injection points, или redesign
```

**4. @Async без @EnableAsync — просто синхронный вызов:**
Аннотация без включения = декоративный комментарий.

**5. N+1 в JPA — скрытый:**
```java
List<Order> orders = orderRepo.findAll(); // 1 query
orders.forEach(o -> o.getItems().size()); // N queries (lazy loading!)
// Fix: JOIN FETCH, EntityGraph, или Projection
```

### Когда что использовать

| Задача | Решение Spring | Альтернатива |
|--------|---------------|-------------|
| Кэш | @Cacheable + Redis | Caffeine local cache |
| Retry | @Retryable / Resilience4j | Manual retry loop |
| Rate limit | Bucket4j filter | Nginx rate limiting |
| Async | @Async + ThreadPool | CompletableFuture manual |
| Messaging | @RabbitListener / @KafkaListener | Manual consumer loop |
| gRPC | grpc-spring-boot-starter | Plain grpc-java |
| Validation | @Valid + ConstraintValidator | Manual if/throw |
| Auth | Spring Security filter chain | Manual filter |

**Правило:** Spring-way если уже используешь Spring. Manual если нужен полный контроль или нет Spring dependency.

## Ссылки на канон

- **Craig Walls "Spring in Action"** — вход в Spring, актуальное издание для Boot 3
- **Spring Reference Documentation** — spring.io/docs (всегда актуально)
- **Laurentiu Spilca "Spring Security in Action"** — глубокое погружение в Security
- **Spring Boot Auto-configuration Report** — `--debug` или `/actuator/conditions`
- **Baeldung** — практические guides (проверяй версии!)
- **Resilience4j documentation** — resilience4j.readme.io
- **gRPC Java** — grpc.io/docs/languages/java/
- **Kafka documentation** — kafka.apache.org/documentation

## Engineering notes

```java
// NOTE: используем @Retryable вместо ручного retry loop
// потому что Spring Retry интегрирован с @Transactional (retry ВНЕ транзакции).
// Ручной retry внутри @Transactional → retry внутри одной транзакции → бесполезно.
```

## Требования

- Java 21+
- Maven 3.9+
- Spring Boot 3.3+
- Docker (для Testcontainers, Redis, RabbitMQ, Kafka, Zipkin)
