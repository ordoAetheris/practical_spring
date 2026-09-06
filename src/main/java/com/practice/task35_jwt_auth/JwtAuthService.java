package com.practice.task35_jwt_auth;

/**
 * Задача 21 — JWT Authentication: issue + validate + refresh (без Spring Security OAuth2 starter).
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>JwtTokenProvider: generateAccessToken(username, roles), generateRefreshToken(username)</li>
 *   <li>Validate: parseToken(token) → Claims. Проверка expiration, signature</li>
 *   <li>Refresh flow: refreshToken → новый accessToken (если refresh не expired)</li>
 *   <li>JwtAuthenticationFilter extends OncePerRequestFilter: извлекает token из header,
 *       валидирует, устанавливает Authentication в SecurityContext</li>
 *   <li>SecurityFilterChain: stateless session, JWT filter перед UsernamePasswordFilter</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * JWT = Header.Payload.Signature (base64). Signature через HMAC-SHA256 или RSA.
 * SecurityContextHolder.getContext().setAuthentication() — устанавливает текущего пользователя.
 * Stateless: сервер НЕ хранит сессию. Каждый request несёт token.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Библиотека: io.jsonwebtoken:jjwt-api (или nimbus-jose-jwt)</li>
 *   <li>Access token TTL: 15 мин. Refresh token TTL: 7 дней.</li>
 *   <li>Secret key из application.properties (не хардкод!)</li>
 *   <li>Roles в claims: "roles": ["ADMIN", "USER"]</li>
 * </ul>
 *
 * Сложность: Hard
 */
public class JwtAuthService {
    // TODO: JwtTokenProvider (generate, validate, parse)
    // TODO: JwtAuthenticationFilter extends OncePerRequestFilter
    // TODO: SecurityConfig с SecurityFilterChain
    // TODO: AuthController: POST /auth/login → tokens, POST /auth/refresh → new access token
}
