package com.practice.task13_rest_client;

/**
 * Задача 36 — RestClient: декларативный HTTP клиент (Spring 6.1+).
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>RestClient (новый в Spring 6.1): замена RestTemplate</li>
 *   <li>GET/POST/PUT/DELETE с типизированным response</li>
 *   <li>Error handling: .onStatus(HttpStatusCode::is4xxClientError, ...)</li>
 *   <li>Timeout configuration: connectTimeout, readTimeout</li>
 *   <li>Retry через Spring Retry integration</li>
 *   <li>@HttpExchange interface (declarative): аналог Feign</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * RestClient — fluent API поверх ClientHttpRequestFactory.
 * @HttpExchange + HttpServiceProxyFactory: создаёт proxy из interface (как JPA Repository).
 *
 * Сложность: Medium
 */
public class RestClientService {
    // TODO: RestClient.builder() configuration
    // TODO: ExternalApiClient: getUser(id), createUser(dto)
    // TODO: @HttpExchange interface variant
    // TODO: WireMock для тестов (mock external API)
}
