package com.practice.task11_custom_repository;

/**
 * Задача 11 — Custom Repository: Specification API для динамических запросов.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Entity: Product(id, name, category, price, inStock, createdAt)</li>
 *   <li>ProductRepository extends JpaRepository + JpaSpecificationExecutor</li>
 *   <li>ProductSpecifications: byCategory, byPriceRange, inStockOnly, nameLike — каждый возвращает Specification<Product></li>
 *   <li>Комбинирование: spec1.and(spec2).or(spec3) — динамический фильтр</li>
 *   <li>ProductSearchService: search(ProductFilter filter) → комбинирует Specifications по заполненным полям filter</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Specification = функциональный интерфейс (root, query, criteriaBuilder) → Predicate.
 * Spring Data превращает Specification в JPA Criteria API запрос.
 * Альтернатива QueryDSL, но без кодогенерации.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>NULL-safe: если поле filter пустое — specification не добавляется</li>
 *   <li>Pagination: findAll(spec, Pageable)</li>
 *   <li>H2 для тестов</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class ProductRepository {
    // TODO: Entity Product (@Entity)
    // TODO: interface ProductRepository extends JpaRepository, JpaSpecificationExecutor
    // TODO: class ProductSpecifications (static methods returning Specification<Product>)
    // TODO: record ProductFilter(String category, BigDecimal minPrice, BigDecimal maxPrice, Boolean inStock, String nameLike)
    // TODO: ProductSearchService: search(filter, Pageable) → Page<Product>
}
