package com.practice.task03_profile_config;

/**
 * Задача 06 — Profile-based Configuration: переключение datasource по профилю.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>{@code @Profile("dev")} — H2 in-memory datasource</li>
 *   <li>{@code @Profile("prod")} — PostgreSQL datasource (connection string из properties)</li>
 *   <li>{@code @Profile("test")} — Testcontainers PostgreSQL</li>
 *   <li>DataSourceInfo — бин возвращающий текущий профиль и URL для диагностики</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * {@code @Profile} реализован через {@code @Conditional(ProfileCondition.class)}.
 * Активный профиль: {@code spring.profiles.active} в properties или {@code -Dspring.profiles.active=dev}.
 * {@code @ActiveProfiles("test")} в тестах.
 *
 * Сложность: Easy
 */
public class DataSourceConfig {
    // TODO: @Configuration + @Profile бины
}
