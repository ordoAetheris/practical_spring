package com.practice.task22_oauth2_resource;

/**
 * Задача 22 — OAuth2 Resource Server: валидация JWT токенов от внешнего IdP.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Resource Server конфигурация: spring.security.oauth2.resourceserver.jwt.issuer-uri</li>
 *   <li>Custom JwtAuthenticationConverter: извлечение ролей из claims (realm_access.roles для Keycloak)</li>
 *   <li>Scope-based authorization: @PreAuthorize("hasAuthority('SCOPE_read')")</li>
 *   <li>JwtDecoder customization: добавление custom validator (audience check)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Resource Server валидирует JWT через JWK Set URI (публичные ключи IdP).
 * BearerTokenAuthenticationFilter извлекает token из Authorization header.
 * JwtDecoder верифицирует signature через JWKS, проверяет exp/iss/aud.
 *
 * Сложность: Medium
 */
public class OAuth2ResourceConfig {
    // TODO: SecurityFilterChain с oauth2ResourceServer(jwt -> ...)
    // TODO: JwtAuthenticationConverter (roles extraction)
    // TODO: Custom JwtValidator (audience check)
}
