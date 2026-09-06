package com.practice.task82_request_id_filter;

/**
 * Задача 56 — Servlet Filter: Request ID + MDC.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>OncePerRequestFilter: генерация UUID request ID</li>
 *   <li>MDC.put("requestId", id) → автоматически во всех логах этого request</li>
 *   <li>Response header: X-Request-Id</li>
 *   <li>Если клиент прислал X-Request-Id → использовать его (correlation)</li>
 *   <li>MDC.clear() в finally (предотвращение ThreadLocal leak!)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * OncePerRequestFilter: гарантирует один вызов per request (даже при forward/include).
 * MDC (Mapped Diagnostic Context): ThreadLocal в Logback. Очистка обязательна на thread pool.
 *
 * Сложность: Easy
 */
public class RequestIdFilter {
    // TODO: extends OncePerRequestFilter
    // TODO: doFilterInternal: generate/extract ID, MDC.put, try { chain.doFilter } finally { MDC.remove }
    // TODO: response.setHeader("X-Request-Id", id)
}
