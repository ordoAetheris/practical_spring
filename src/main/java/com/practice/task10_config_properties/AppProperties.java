package com.practice.task10_config_properties;

/**
 * Задача 10 — @ConfigurationProperties с валидацией.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>{@code AppProperties} — @ConfigurationProperties("app")</li>
 *   <li>Nested properties: app.server.host, app.server.port, app.cache.ttl, app.cache.max-size</li>
 *   <li>Validation: @NotBlank host, @Min(1) port, @Positive ttl</li>
 *   <li>Default values через конструктор или @DefaultValue</li>
 *   <li>Immutable: @ConstructorBinding (record-based)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * {@code @EnableConfigurationProperties} регистрирует {@code ConfigurationPropertiesBindingPostProcessor}.
 * Binding через Binder API: relaxed binding (app.max-size = app.maxSize = APP_MAX_SIZE).
 * Validation через JSR-380 ({@code @Valid} + hibernate-validator).
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Record-based (immutable)</li>
 *   <li>Nested: ServerProperties, CacheProperties</li>
 *   <li>Validation: невалидные значения → BindValidationException при старте</li>
 *   <li>application.yml / application-test.yml для тестов</li>
 * </ul>
 *
 * Сложность: Easy
 */
public class AppProperties {
    // TODO: record AppProperties(ServerProperties server, CacheProperties cache)
    // TODO: record ServerProperties(@NotBlank String host, @Min(1) int port)
    // TODO: record CacheProperties(@Positive long ttl, @Positive int maxSize)
    // TODO: @ConfigurationProperties("app") на record
}
