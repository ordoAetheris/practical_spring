package com.practice.task57_handler_interceptor;

/**
 * Задача 57 — HandlerInterceptor: preHandle + postHandle + afterCompletion.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>AuthInterceptor.preHandle: проверка API key, return false → 401</li>
 *   <li>MetricsInterceptor.preHandle: старт таймера. afterCompletion: запись duration</li>
 *   <li>AuditInterceptor.postHandle: логирование handler + model attributes</li>
 *   <li>Регистрация через WebMvcConfigurer.addInterceptors() с pathPatterns</li>
 *   <li>Порядок: Auth → Metrics → Audit (interceptor ordering)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * HandlerInterceptor vs Filter: interceptor знает о Spring MVC (handler method),
 * Filter знает только о Servlet API (request/response). Interceptor ПОСЛЕ DispatcherServlet.
 *
 * Сложность: Medium
 */
public class MetricsInterceptor {
    // TODO: AuthInterceptor implements HandlerInterceptor (preHandle)
    // TODO: MetricsInterceptor (preHandle + afterCompletion)
    // TODO: WebMvcConfigurer: addInterceptors с order + pathPatterns
}
