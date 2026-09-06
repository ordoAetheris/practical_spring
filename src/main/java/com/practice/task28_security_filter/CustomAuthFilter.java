package com.practice.task28_security_filter;

/**
 * Задача 28 — Security Filter Chain: кастомный фильтр аутентификации.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>ApiKeyAuthenticationFilter: проверяет X-API-Key header</li>
 *   <li>Регистрация в SecurityFilterChain: addFilterBefore(UsernamePasswordAuthFilter)</li>
 *   <li>Разные chains для /api/** (API key) и /web/** (form login)</li>
 *   <li>FilterChain ordering: @Order(1) для API, @Order(2) для web</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * SecurityFilterChain — упорядоченный список фильтров.
 * DelegatingFilterProxy → FilterChainProxy → matching SecurityFilterChain.
 * Множественные chains: securityMatcher("/api/**") определяет какая chain для какого URL.
 *
 * Сложность: Hard
 */
public class CustomAuthFilter {
    // TODO: ApiKeyAuthenticationFilter extends OncePerRequestFilter
    // TODO: SecurityConfig с двумя SecurityFilterChain (api + web)
    // TODO: ApiKeyAuthenticationToken extends AbstractAuthenticationToken
}
