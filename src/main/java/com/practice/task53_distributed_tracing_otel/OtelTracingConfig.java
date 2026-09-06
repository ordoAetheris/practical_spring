package com.practice.task53_distributed_tracing_otel;
/**
 * Задача 63 — Distributed Tracing: OpenTelemetry между двумя сервисами.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Service A (order-service) → HTTP call → Service B (payment-service)</li>
 *   <li>Trace propagation через W3C traceparent header</li>
 *   <li>Оба сервиса отправляют spans в Zipkin/Jaeger</li>
 *   <li>Полный trace tree: A.handleOrder → A.callPayment → B.processPayment</li>
 *   <li>docker-compose: app-a + app-b + zipkin</li>
 * </ol>
 *
 * Сложность: Hard
 */
public class OtelTracingConfig {
    // TODO: Два Spring Boot приложения (или два profiles в одном)
    // TODO: RestClient с auto-instrumented tracing headers
    // TODO: docker-compose.yml с Zipkin
}
