# Чек-лист самопроверки: Spring Framework

---

## 0. Базовое
- [ ] `mvn compile` без ошибок
- [ ] `mvn test -Dtest="com.practice.taskNN_name.*"` — зелёный
- [ ] Нет `throw new UnsupportedOperationException("TODO")` в коде

---

## 1. Spring идиоматичность
- [ ] Используется правильный Spring-механизм (не изобретаем велосипед)
- [ ] Бины через @Component/@Service/@Configuration (не new в коде)
- [ ] Dependency injection через конструктор (не @Autowired на поле)
- [ ] @ConfigurationProperties > @Value для группы related properties

---

## 2. AOP & Proxy awareness
- [ ] Нет self-invocation проблем (this.method() с @Transactional/@Cacheable)
- [ ] @Transactional только на public методах
- [ ] Понимаю что аннотация работает через proxy (задокументировано в // NOTE:)

---

## 3. Error Handling
- [ ] Business exceptions кидаются из service layer
- [ ] @ControllerAdvice маппит exceptions → proper HTTP codes
- [ ] Validation errors → 400 с field-level details
- [ ] Неожиданные ошибки → 500 с generic message (не stack trace клиенту!)

---

## 4. Configuration
- [ ] Secrets не в коде (properties/env vars)
- [ ] @ConfigurationProperties для structured config
- [ ] Profile-specific config где нужно (test vs dev vs prod)
- [ ] Validation на properties (@Validated + JSR-380)

---

## 5. Тесты
- [ ] Покрыт happy path
- [ ] Покрыты error cases
- [ ] @SpringBootTest только для интеграционных (не для unit)
- [ ] MockMvc для web layer тестов
- [ ] Testcontainers для DB/Redis/Kafka (не H2 для integration)

---

## 6. Production concerns
- [ ] Health indicator если есть внешние зависимости
- [ ] Metrics для бизнес-операций (Counter/Timer)
- [ ] Logging: structured, MDC, не System.out.println
- [ ] Graceful shutdown если long-running operations

---

## Подсчёт

| Результат   | Уровень |
|-------------|---------|
| 19-22 из 22 | Staff — production Spring Boot |
| 15-18 из 22 | Синьор — крепко |
| 10-14 из 22 | Мидл+ — основа есть |
| < 10 из 22  | Нужно подтянуть Spring internals |

---

**Хочешь внешнюю оценку?** → `doc/REVIEW_PROMPT.md`
