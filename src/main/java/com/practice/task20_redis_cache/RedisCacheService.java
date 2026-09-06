package com.practice.task20_redis_cache;

/**
 * Задача 20 — Redis Cache: @Cacheable + TTL + eviction.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@Cacheable("products") на findById — cache hit без DB query</li>
 *   <li>@CacheEvict на update/delete</li>
 *   <li>@CachePut на save (обновить кэш без eviction)</li>
 *   <li>TTL: 10 минут через RedisCacheConfiguration</li>
 *   <li>Custom key: @Cacheable(key = "#category + ':' + #page")</li>
 *   <li>Cache-aside pattern: if cached → return; else → DB → put in cache → return</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * @Cacheable обрабатывается через CacheInterceptor (AOP proxy!).
 * Self-invocation: this.findById() внутри того же класса → cache bypass.
 * Serialization: Java serialization по умолчанию (медленно). JSON serializer лучше.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Testcontainers Redis для интеграционных тестов (или embedded Redis)</li>
 *   <li>Или mock CacheManager для unit тестов</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class RedisCacheService {
    // TODO: @EnableCaching configuration
    // TODO: RedisCacheConfiguration с TTL и JSON serializer
    // TODO: ProductService с @Cacheable/@CacheEvict/@CachePut
}
