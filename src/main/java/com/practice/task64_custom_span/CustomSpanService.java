package com.practice.task64_custom_span;
/**
 * Задача 64 — Custom Span для бизнес-операций.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@WithSpan("processOrder") на service method → автоматический span</li>
 *   <li>Manual: tracer.nextSpan().name("db-query").start() / .end()</li>
 *   <li>Span attributes: order.id, order.amount, user.id</li>
 *   <li>Error: span.setStatus(StatusCode.ERROR) + recordException</li>
 *   <li>Nested spans: processOrder → validateOrder → chargePayment</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class CustomSpanService {
    // TODO: OrderProcessingService с @WithSpan и manual spans
    // TODO: Span attributes + error recording
}
