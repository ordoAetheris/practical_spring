package com.practice.task55_annotation_proxy;

/**
 * Задача 55 — Annotation-Driven Proxy: свой @Retry через BeanPostProcessor.
 *
 * <h2>Это КЛЮЧЕВАЯ задача — понимание как работает @Transactional, @Cacheable, @Async</h2>
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@Retry(times=3, delay=1000) — кастомная аннотация на методах</li>
 *   <li>RetryBeanPostProcessor: в postProcessAfterInitialization проверяет наличие @Retry</li>
 *   <li>Если есть → оборачивает бин в proxy (ProxyFactory / CGLIB)</li>
 *   <li>Proxy: при вызове метода с @Retry → try/catch + retry loop</li>
 *   <li>Бонус: @Retry + @Transactional на одном методе → порядок proxy важен!</li>
 * </ol>
 *
 * <h2>Под капотом — ГЛАВНЫЙ УРОК</h2>
 * Это РОВНО тот механизм, через который работают:
 * <ul>
 *   <li>@Transactional → TransactionInterceptor оборачивает в begin/commit/rollback</li>
 *   <li>@Cacheable → CacheInterceptor оборачивает в cache check/put</li>
 *   <li>@Async → AsyncExecutionInterceptor оборачивает в submit to Executor</li>
 * </ul>
 * BPP → проверка аннотации → ProxyFactory → MethodInterceptor → wrap original method.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>ProxyFactory (Spring) или java.lang.reflect.Proxy (JDK)</li>
 *   <li>MethodInterceptor: retry с delay между попытками</li>
 *   <li>Последняя ошибка пробрасывается если все retries исчерпаны</li>
 *   <li>Self-invocation: this.method() НЕ проходит через proxy (документировать!)</li>
 * </ul>
 *
 * Сложность: Hard (но самая ценная задача в задачнике)
 */
public class RetryAnnotationProcessor {
    // TODO: @Retry(times, delay) annotation
    // TODO: RetryBeanPostProcessor implements BeanPostProcessor
    //   - postProcessAfterInitialization: scan methods for @Retry
    //   - if found → ProxyFactory.addAdvice(new RetryMethodInterceptor(times, delay))
    // TODO: RetryMethodInterceptor implements MethodInterceptor
    //   - invoke(): try { proceed() } catch { if attempts < times → sleep + retry }
    // TODO: DemoService с @Retry методом для тестирования
}
