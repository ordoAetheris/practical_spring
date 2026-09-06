package com.practice.task55_metrics_traces_correlation;
/**
 * Задача 65 — Metrics + Traces Correlation (Exemplars).
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Exemplar: метрика содержит trace_id конкретного request</li>
 *   <li>В Grafana: click на spike → jump to trace в Zipkin/Jaeger</li>
 *   <li>Prometheus exemplars: OpenMetrics format</li>
 *   <li>Timer metric → exemplar с traceId для каждого observed value</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Exemplar = sample + trace context. Prometheus 2.26+ + OpenMetrics.
 * Micrometer: DefaultMeterObservationHandler автоматически добавляет exemplars.
 * Grafana: datasource с exemplar support → кликабельная ссылка на trace.
 *
 * Сложность: Hard
 */
public class ExemplarConfig {
    // TODO: Prometheus + exemplar config
    // TODO: Timer с exemplar
    // TODO: Grafana dashboard query с exemplars
}
