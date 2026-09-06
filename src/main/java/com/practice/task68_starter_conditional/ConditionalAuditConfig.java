package com.practice.task68_starter_conditional;
/**
 * Задача 68 — Starter with Conditional Beans.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@ConditionalOnProperty("audit.enabled", havingValue="true")</li>
 *   <li>@ConditionalOnClass(KafkaTemplate.class) → KafkaAuditSink</li>
 *   <li>@ConditionalOnMissingBean → default FileAuditSink</li>
 *   <li>NoopAuditSink если audit.enabled=false</li>
 *   <li>Пользователь может override через свой @Bean AuditSink</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Это РОВНО как работает Spring Boot auto-configuration: DataSourceAutoConfiguration,
 * JacksonAutoConfiguration — всё через @ConditionalOn*.
 * @ConditionalOnMissingBean: если пользователь определил свой — auto-config не создаёт.
 *
 * Сложность: Hard
 */
public class ConditionalAuditConfig {
    // TODO: AuditSink interface
    // TODO: FileAuditSink, KafkaAuditSink, NoopAuditSink implementations
    // TODO: @ConditionalOn* на каждом
}
