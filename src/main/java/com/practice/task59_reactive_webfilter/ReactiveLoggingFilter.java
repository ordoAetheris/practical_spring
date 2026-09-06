package com.practice.task59_reactive_webfilter;

/**
 * Задача 59 — Reactive WebFilter: фильтр для WebFlux.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>WebFilter: аналог Servlet Filter для реактивного стека</li>
 *   <li>Non-blocking: через Mono<Void>, не блокирующие операции</li>
 *   <li>Request ID + MDC: через Context (не ThreadLocal! Reactive не гарантирует один Thread)</li>
 *   <li>Timing: замер через Mono.transformDeferred + elapsed()</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * WebFlux: event loop модель, threads переиспользуются. MDC (ThreadLocal) НЕ работает!
 * Reactor Context: immutable context per subscription, передаётся через chain.
 * contextWrite() + deferContextual() для доступа к request-scoped данным.
 *
 * Сложность: Hard
 */
public class ReactiveLoggingFilter {
    // TODO: implements WebFilter
    // TODO: filter(exchange, chain): add requestId to Context, NOT MDC
    // TODO: Mono.deferContextual для чтения requestId downstream
}
