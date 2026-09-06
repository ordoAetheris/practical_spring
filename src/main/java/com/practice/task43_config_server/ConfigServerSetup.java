package com.practice.task43_config_server;

/**
 * Задача 43 — Config Server: централизованная конфигурация.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Spring Cloud Config Server: git-backed или file-system</li>
 *   <li>Config Client: spring.config.import=configserver:</li>
 *   <li>Profile-specific: application-dev.yml, application-prod.yml на сервере</li>
 *   <li>@RefreshScope: обновление properties без рестарта</li>
 *   <li>Encryption: зашифрованные значения в конфиге ({cipher})</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Config Server = REST API: GET /{application}/{profile}/{label}.
 * Client: bootstrap phase загружает properties ДО создания ApplicationContext.
 * @RefreshScope: бин пересоздаётся при POST /actuator/refresh.
 *
 * Сложность: Medium
 */
public class ConfigServerSetup {
    // TODO: Config Server application (отдельный Spring Boot app)
    // TODO: Config Client (наше приложение)
    // TODO: @RefreshScope на бине с @Value
}
