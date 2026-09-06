package com.practice.task46_health_indicators;

/**
 * Задача 46 — Health Indicators: кастомные health checks.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Custom HealthIndicator: проверка внешнего API (ping)</li>
 *   <li>Custom HealthIndicator: проверка disk space threshold</li>
 *   <li>Composite: несколько indicators, общий status = worst</li>
 *   <li>Readiness vs Liveness: readiness=false → K8s не шлёт трафик, liveness=false → restart</li>
 *   <li>Groups: management.endpoint.health.group.readiness.include=db,custom</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * HealthIndicator.health() → Health.up()/down() + details.
 * /actuator/health собирает все indicators. Status: UP, DOWN, OUT_OF_SERVICE, UNKNOWN.
 * K8s probes: /actuator/health/readiness, /actuator/health/liveness.
 *
 * Сложность: Easy
 */
public class CustomHealthIndicator {
    // TODO: ExternalApiHealthIndicator implements HealthIndicator
    // TODO: DiskSpaceHealthIndicator
    // TODO: Readiness/Liveness группы в application.yml
}
