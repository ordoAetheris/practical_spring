package com.practice.task14_request_logging;

/**
 * Задача 38 — Request/Response Logging: фильтр с MDC.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Logging filter: method, URI, status, duration для каждого request</li>
 *   <li>MDC: requestId, userId → автоматически в каждой log-строке</li>
 *   <li>Body logging: request/response body (с лимитом размера!)</li>
 *   <li>ContentCachingRequestWrapper: перечитать body (InputStream одноразовый)</li>
 *   <li>Exclude: /actuator/**, /health → не логировать</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Servlet InputStream можно прочитать ОДИН раз. ContentCachingRequestWrapper кэширует body.
 * MDC (Mapped Diagnostic Context): ThreadLocal в Logback/Log4j2. MDC.put("requestId", uuid).
 * Cleanup: MDC.clear() в finally (иначе ThreadLocal leak на thread pool).
 *
 * Сложность: Medium
 */
public class RequestLoggingFilter {
    // TODO: extends OncePerRequestFilter
    // TODO: ContentCachingRequestWrapper + ContentCachingResponseWrapper
    // TODO: MDC.put/clear в try/finally
    // TODO: Exclude patterns configuration
}
