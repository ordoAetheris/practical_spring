package com.practice.task44_circuit_breaker;

/**
 * Задача 41 — Circuit Breaker: Resilience4j интеграция.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@CircuitBreaker(name="externalApi", fallbackMethod="fallback")</li>
 *   <li>Конфигурация: slidingWindowSize, failureRateThreshold, waitDurationInOpenState</li>
 *   <li>Мониторинг: CircuitBreakerRegistry → state, metrics, events</li>
 *   <li>Комбинирование: @CircuitBreaker + @Retry + @RateLimiter (порядок!)</li>
 *   <li>Health indicator: /actuator/health → circuit breaker state</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Resilience4j: lightweight, no thread pool overhead (в отличие от Hystrix).
 * Декораторы через AOP. Порядок: Retry → CircuitBreaker → RateLimiter → Bulkhead.
 * Sliding window: count-based или time-based. State machine: CLOSED → OPEN → HALF_OPEN.
 *
 * Сложность: Medium
 */
public class CircuitBreakerService {
    // TODO: ExternalApiClient с @CircuitBreaker
    // TODO: Fallback method (same signature + Throwable)
    // TODO: application.yml конфигурация resilience4j
    // TODO: CircuitBreakerEventListener для логирования state transitions
}
