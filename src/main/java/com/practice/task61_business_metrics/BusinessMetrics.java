package com.practice.task61_business_metrics;
/**
 * Задача 61 — Custom Business Metrics: orders, revenue, bounded cardinality.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>orders_created_total{status="paid|pending|cancelled"} — Counter с bounded tags</li>
 *   <li>order_value_distribution — DistributionSummary + percentiles (p50, p95, p99)</li>
 *   <li>active_sessions — Gauge привязанный к ConcurrentHashMap.size()</li>
 *   <li>Grafana dashboard JSON для этих метрик (опционально)</li>
 * </ol>
 *
 * <h2>ВАЖНО: Cardinality</h2>
 * НЕ делать: Counter("orders", "user_id", userId) → миллионы серий → Prometheus OOM.
 * Делать: Counter("orders", "status", status) → 3 серии.
 * Правило: tags = low cardinality only (status, region, method, endpoint).
 *
 * Сложность: Medium
 */
public class BusinessMetrics {
    // TODO: OrderMetricsService с Counter, DistributionSummary, Gauge
    // TODO: Правильные tag names (bounded cardinality!)
}
