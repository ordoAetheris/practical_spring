package com.practice.task26_csrf_protection;

/**
 * Задача 26 — CSRF Protection: SPA + REST API.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>CSRF для server-rendered forms: CsrfTokenRepository (Cookie-based)</li>
 *   <li>CSRF для SPA: X-XSRF-TOKEN header from cookie</li>
 *   <li>Disable CSRF для stateless REST API (JWT) — и объяснить ПОЧЕМУ безопасно</li>
 *   <li>CSRF + CORS interaction: preflight и CSRF token</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * CSRF attack: evil site отправляет request от имени пользователя (browser прикладывает cookies).
 * CSRF token: server генерирует random token, client отправляет обратно в header/form field.
 * Stateless JWT: нет cookies → нет CSRF (browser не отправит JWT автоматически).
 *
 * Сложность: Medium
 */
public class CsrfConfig {
    // TODO: SecurityFilterChain с CookieCsrfTokenRepository.withHttpOnlyFalse()
    // TODO: Объяснение в комментарии: когда CSRF нужен, когда нет
}
