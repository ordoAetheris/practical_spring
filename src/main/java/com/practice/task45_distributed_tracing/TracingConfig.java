package com.practice.task45_distributed_tracing;

/**
 * Задача 45 — Distributed Tracing: Micrometer Tracing + Zipkin.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Micrometer Tracing auto-configuration: trace ID в каждом request</li>
 *   <li>Propagation: HTTP headers (W3C traceparent или B3)</li>
 *   <li>Два сервиса: A вызывает B → общий trace в Zipkin</li>
 *   <li>Custom span: @NewSpan("processOrder") или manual Tracer.nextSpan()</li>
 *   <li>MDC integration: traceId/spanId в log pattern</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Micrometer Tracing = абстракция (Brave или OpenTelemetry backend).
 * Auto-instrumentation: RestClient, WebClient, JdbcTemplate, @Async — всё трейсится.
 * Zipkin: collector хранит spans, UI показывает trace tree.
 *
 * Сложность: Medium
 */
public class TracingConfig {
    // TODO: application.yml: management.tracing.sampling.probability=1.0
    // TODO: docker-compose с Zipkin
    // TODO: Custom span в бизнес-логике
    // TODO: Log pattern: %X{traceId} %X{spanId}
}
