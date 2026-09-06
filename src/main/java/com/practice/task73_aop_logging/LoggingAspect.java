package com.practice.task73_aop_logging;

/**
 * Задача 05 — AOP: логирование + метрики через аспекты.
 *
 * <h2>Как работает AOP в Spring</h2>
 * Spring AOP создаёт proxy-объект (JDK Dynamic Proxy или CGLIB) вокруг бина.
 * Proxy перехватывает вызовы методов и вызывает advice (before, after, around).
 * Это механизм через который работают @Transactional, @Cacheable, @Async.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@Loggable — кастомная аннотация для методов</li>
 *   <li>LoggingAspect — @Around advice: логирует вход, выход, время, исключения</li>
 *   <li>@Timed — кастомная аннотация: замеряет execution time в наносекундах</li>
 *   <li>TimingAspect — собирает метрики: count, totalTime, avgTime per method</li>
 *   <li>Демо-сервис OrderService с @Loggable и @Timed методами</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * {@code @EnableAspectJAutoProxy} включает {@code AnnotationAwareAspectJAutoProxyCreator} (BPP!).
 * Этот BPP проверяет каждый бин на наличие matching pointcut и оборачивает в proxy.
 * Self-invocation: this.method() НЕ проходит через proxy → advice не сработает.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>@Around для полного контроля (before + after + exception + timing)</li>
 *   <li>ProceedingJoinPoint.proceed() обязателен — иначе метод не выполнится</li>
 *   <li>Exception: лог + rethrow (не глотать!)</li>
 *   <li>TimingAspect.getStats() — immutable snapshot метрик</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class LoggingAspect {
    // TODO: @Aspect @Component
    // TODO: @Around("@annotation(Loggable)")
    // TODO: ProceedingJoinPoint → log args, result, timing, exceptions
    // TODO: Создать аннотации @Loggable и @Timed в отдельных файлах
    // TODO: TimingAspect в отдельном файле
}
