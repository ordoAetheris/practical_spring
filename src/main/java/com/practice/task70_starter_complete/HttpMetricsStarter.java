package com.practice.task70_starter_complete;
/**
 * Задача 70 — Complete Real-World Starter: http-metrics-starter.
 *
 * <h2>CAPSTONE задача — всё вместе</h2>
 *
 * <h2>Задание</h2>
 * Starter который автоматически измеряет ВСЕ @RestController методы:
 * <ol>
 *   <li>BeanPostProcessor сканирует бины с @RestController</li>
 *   <li>ProxyFactory оборачивает каждый метод в TimerInterceptor</li>
 *   <li>Micrometer Timer: http_server_duration{method, uri, status}</li>
 *   <li>Auto-configuration с @ConditionalOnClass(MeterRegistry.class)</li>
 *   <li>Properties: http-metrics.enabled, http-metrics.percentiles</li>
 *   <li>Custom Actuator endpoint: /actuator/http-metrics → top-10 slowest endpoints</li>
 * </ol>
 *
 * <h2>Результат</h2>
 * Подключаешь starter → ВСЕ endpoints измеряются без единой строчки кода в приложении.
 * Как ServerHttpObservationFilter, но реализованный ТОБОЙ.
 *
 * Сложность: Hard (capstone)
 */
public class HttpMetricsStarter {
    // TODO: HttpMetricsBeanPostProcessor
    // TODO: HttpMetricsInterceptor (Micrometer Timer)
    // TODO: HttpMetricsAutoConfiguration (@ConditionalOn*)
    // TODO: HttpMetricsProperties (@ConfigurationProperties)
    // TODO: HttpMetricsEndpoint (@Endpoint)
    // TODO: META-INF/spring/...imports
}
