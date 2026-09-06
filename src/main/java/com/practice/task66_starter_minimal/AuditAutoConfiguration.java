package com.practice.task66_starter_minimal;
/**
 * Задача 66 — Minimal Starter: один auto-configuration, один bean.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>AuditLogger bean: логирует business events</li>
 *   <li>AuditAutoConfiguration: @AutoConfiguration, @Bean AuditLogger</li>
 *   <li>META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports</li>
 *   <li>Подключение: просто добавить dependency → bean доступен</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring Boot auto-config: reads imports file → registers @Configuration classes.
 * @AutoConfiguration заменил spring.factories (deprecated в 3.x).
 *
 * Сложность: Medium
 */
public class AuditAutoConfiguration {
    // TODO: @AutoConfiguration class
    // TODO: @Bean AuditLogger
    // TODO: META-INF/spring/...imports файл
}
