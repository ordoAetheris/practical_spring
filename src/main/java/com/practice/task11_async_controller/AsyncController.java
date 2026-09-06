package com.practice.task11_async_controller;

/**
 * Задача 37 — Async Controller: CompletableFuture + DeferredResult.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>CompletableFuture return: контроллер возвращает CompletableFuture → Servlet thread освобождён</li>
 *   <li>DeferredResult: set result из другого потока (event-driven)</li>
 *   <li>Timeout handling: DeferredResult.onTimeout()</li>
 *   <li>StreamingResponseBody: потоковая запись в response</li>
 *   <li>@Async + CompletableFuture в service layer</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Servlet 3.0 async: request.startAsync(). Spring MVC: если return type async → startAsync автоматически.
 * Tomcat thread возвращается в pool, response отправится когда CompletableFuture/DeferredResult complete.
 *
 * Сложность: Medium
 */
public class AsyncController {
    // TODO: GET /async/cf → CompletableFuture<Response>
    // TODO: GET /async/deferred → DeferredResult<Response> (set from event)
    // TODO: GET /async/stream → StreamingResponseBody
}
