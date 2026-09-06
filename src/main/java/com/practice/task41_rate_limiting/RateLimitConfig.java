package com.practice.task41_rate_limiting;

/**
 * Задача 25 — Rate Limiting: per-user с Bucket4j.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Bucket4j integration: per-IP или per-user rate limit</li>
 *   <li>Servlet Filter: проверка лимита ДО controller'а</li>
 *   <li>429 Too Many Requests + Retry-After header</li>
 *   <li>Конфигурируемый rate: 100 req/min per IP</li>
 *   <li>Different limits per endpoint: /api/search = 10/min, /api/orders = 100/min</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Token bucket algorithm: bucket заполняется токенами с фиксированной скоростью.
 * Каждый request потребляет 1 токен. Если пусто → reject.
 * Per-user: ConcurrentHashMap<userId, Bucket>. Cleanup через TTL.
 *
 * Сложность: Medium
 */
public class RateLimitConfig {
    // TODO: RateLimitFilter extends OncePerRequestFilter
    // TODO: Bucket4j Bucket per IP/user (ConcurrentHashMap)
    // TODO: @RateLimit(requests=100, period=60) — кастомная аннотация на endpoint
}
