package com.practice.task38_cors_config;

/**
 * Задача 24 — CORS Configuration: whitelist + preflight.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Global CORS: WebMvcConfigurer.addCorsMappings</li>
 *   <li>Per-endpoint: @CrossOrigin на контроллере</li>
 *   <li>Security CORS: CorsConfigurationSource bean (если Spring Security)</li>
 *   <li>Whitelist: только frontend origins. Credentials: true для cookies.</li>
 *   <li>Preflight: OPTIONS request → 200 с CORS headers</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * CORS — browser enforcement. Сервер отвечает CORS headers, браузер решает пропускать или нет.
 * Preflight (OPTIONS) для "непростых" запросов (custom headers, PUT/DELETE, content-type != form).
 * Spring Security имеет свой CorsFilter — если security включен, нужен CorsConfigurationSource bean.
 *
 * Сложность: Easy
 */
public class CorsConfig {
    // TODO: @Configuration с CorsConfigurationSource bean
    // TODO: Whitelist allowed origins из properties
    // TODO: DemoController для тестирования
}
