package com.practice.task65_starter_properties;
/**
 * Задача 67 — Starter with Properties: @ConfigurationProperties.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@ConfigurationProperties("audit"): enabled, logLevel, sinkType</li>
 *   <li>@EnableConfigurationProperties в auto-config</li>
 *   <li>Binding: audit.enabled=true, audit.log-level=INFO, audit.sink-type=file</li>
 *   <li>Validation: @NotBlank sinkType</li>
 *   <li>spring-configuration-metadata.json для IDE autocomplete</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class AuditProperties {
    // TODO: record AuditProperties(@ConfigurationProperties("audit"))
    // TODO: @EnableConfigurationProperties(AuditProperties.class) в auto-config
    // TODO: additional-spring-configuration-metadata.json для IDE hints
}
