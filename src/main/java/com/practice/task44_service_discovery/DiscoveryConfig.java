package com.practice.task44_service_discovery;

/**
 * Задача 44 — Service Discovery: Eureka/Consul клиент.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@EnableDiscoveryClient: регистрация в Eureka/Consul</li>
 *   <li>DiscoveryClient: программное получение instances сервиса</li>
 *   <li>Load-balanced RestClient: @LoadBalanced → round-robin по instances</li>
 *   <li>Health check: сервис deregistered при unhealthy</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * DiscoveryClient абстрагирует Eureka/Consul/Kubernetes.
 * @LoadBalanced: BeanPostProcessor добавляет LoadBalancerInterceptor к RestTemplate/RestClient.
 * Interceptor заменяет service name в URL на реальный host:port.
 *
 * Сложность: Medium
 */
public class DiscoveryConfig {
    // TODO: @EnableDiscoveryClient
    // TODO: @LoadBalanced RestClient.Builder
    // TODO: ServiceLocator: resolve service name → instances
}
