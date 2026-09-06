package com.practice.task42_retry_fallback;

/**
 * Задача 42 — Retry + Fallback: Spring Retry.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@Retryable(maxAttempts=3, backoff=@Backoff(delay=1000, multiplier=2))</li>
 *   <li>@Recover: fallback если все retries исчерпаны</li>
 *   <li>Retryable exceptions: IOException → retry, IllegalArgumentException → no retry</li>
 *   <li>RetryTemplate: программный retry (не аннотации)</li>
 *   <li>Custom RetryPolicy: retry только для HTTP 5xx, не 4xx</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * @EnableRetry включает RetryOperationsInterceptor (AOP).
 * Backoff: fixed, exponential, random. Multiplier: delay * multiplier^attempt.
 * @Recover: метод с тем же return type + exception parameter.
 *
 * Сложность: Medium
 */
public class RetryService {
    // TODO: @EnableRetry configuration
    // TODO: PaymentService с @Retryable + @Recover
    // TODO: RetryTemplate programmatic usage
}
