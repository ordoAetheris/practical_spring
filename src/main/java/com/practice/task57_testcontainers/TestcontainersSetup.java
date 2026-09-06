package com.practice.task57_testcontainers;

/**
 * Задача 48 — Testcontainers: интеграционные тесты с PostgreSQL + Kafka.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@Testcontainers + @Container: PostgreSQL в Docker для тестов</li>
 *   <li>@DynamicPropertySource: подстановка URL/credentials из container</li>
 *   <li>Reusable containers: testcontainers.reuse.enable=true (быстрее)</li>
 *   <li>Kafka container: KafkaContainer для integration тестов messaging</li>
 *   <li>@ServiceConnection (Spring Boot 3.1+): автоматическая конфигурация без @DynamicPropertySource</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Testcontainers запускает Docker container перед тестами, останавливает после.
 * @DynamicPropertySource: override properties в runtime (после container start).
 * @ServiceConnection: Spring Boot auto-detects container и конфигурирует DataSource/KafkaTemplate.
 *
 * Сложность: Medium
 */
public class TestcontainersSetup {
    // TODO: @Testcontainers тест с PostgreSQLContainer
    // TODO: @ServiceConnection variant
    // TODO: KafkaContainer + KafkaTemplate integration test
    // TODO: AbstractIntegrationTest base class (reuse container)
}
