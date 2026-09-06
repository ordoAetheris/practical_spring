package com.practice.task58_docker_compose;

/**
 * Задача 49 — Docker Compose: Spring Boot Docker Compose support.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>compose.yml рядом с проектом: postgres + redis</li>
 *   <li>spring-boot-docker-compose dependency: auto start/stop при run</li>
 *   <li>Service connections: авто-конфигурация DataSource из compose service</li>
 *   <li>Lifecycle: skip если containers уже running</li>
 *   <li>Profiles: compose-dev.yml, compose-test.yml</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring Boot 3.1+: DockerComposeLifecycleManager запускает `docker compose up` при старте.
 * ConnectionDetails: автоматическое создание DataSource/RedisConnectionFactory из compose labels.
 *
 * Сложность: Easy
 */
public class DockerComposeSupport {
    // TODO: compose.yml с postgres + redis services
    // TODO: spring-boot-docker-compose в pom.xml
    // TODO: Application использующий auto-configured DataSource + RedisTemplate
}
