package com.practice.task50_micrometer_basics;

/**
 * Задача 60 — Micrometer Basics: Counter, Gauge, Timer, DistributionSummary.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Counter: orders_created_total — инкрементируется при создании заказа</li>
 *   <li>Gauge: active_users — текущее значение (не накопительное)</li>
 *   <li>Timer: order_processing_duration — замер времени обработки</li>
 *   <li>DistributionSummary: order_amount — распределение сумм заказов</li>
 *   <li>/actuator/prometheus → все метрики в Prometheus формате</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * MeterRegistry: центральный реестр. Auto-configured через spring-boot-starter-actuator.
 * Counter: monotonically increasing. Gauge: current value. Timer: duration distribution.
 * Tags: dimensions для фильтрации (orders_created_total{status="paid"}).
 * ВНИМАНИЕ: tag cardinality! user_id как tag → миллионы серий → OOM.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Bounded cardinality: status=paid/pending/cancelled (не user_id!)</li>
 *   <li>Именование: snake_case, unit suffix (duration_seconds, size_bytes)</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class MicrometerConfig {
    // TODO: OrderMetrics: Counter, Timer, Gauge через MeterRegistry
    // TODO: OrderService использует OrderMetrics
    // TODO: application.yml: management.endpoints.web.exposure.include=prometheus
}
