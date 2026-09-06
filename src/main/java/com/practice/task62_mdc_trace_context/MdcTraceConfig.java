package com.practice.task62_mdc_trace_context;
/**
 * Задача 62 — MDC + Trace Context в логах.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Logback pattern: {@code [traceId=%X{traceId} spanId=%X{spanId}] %msg}</li>
 *   <li>Micrometer Tracing автоматически заполняет MDC (traceId, spanId)</li>
 *   <li>Корреляция: один traceId во всех логах одного request</li>
 *   <li>Async: @Async → MDC propagation через TaskDecorator</li>
 *   <li>Structured logging: JSON format (logstash-logback-encoder)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Micrometer → SLF4J MDC bridge. Brave/OTel заполняют MDC при каждом span.
 * @Async: новый thread → MDC пустой! TaskDecorator копирует MDC в новый поток.
 *
 * Сложность: Medium
 */
public class MdcTraceConfig {
    // TODO: logback-spring.xml с traceId/spanId в pattern
    // TODO: TaskDecorator для @Async MDC propagation
    // TODO: AsyncConfigurer + @EnableAsync
}
