package com.practice.task14_projections;

/**
 * Задача 14 — Projections: интерфейсные и DTO-проекции.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Entity: Order(id, customerName, product, quantity, price, status, createdAt)</li>
 *   <li>Interface projection: OrderSummary (getId, getCustomerName, getTotalPrice = quantity*price)</li>
 *   <li>DTO projection (class-based): OrderReportRow(customerName, totalOrders, totalRevenue)</li>
 *   <li>Dynamic projection: {@code <T> List<T> findByStatus(String status, Class<T> type)}</li>
 *   <li>Native query + projection: @Query(nativeQuery=true) + interface projection</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Interface projection: Spring создаёт proxy, вызывает getter по имени (маппинг на SQL alias).
 * DTO projection: constructor expression в JPQL (SELECT new Dto(field1, field2)).
 * Open projection: @Value("#{target.quantity * target.price}") — SpEL на target entity.
 *
 * Сложность: Medium
 */
public class ProjectionRepository {
    // TODO: Entity Order
    // TODO: interface OrderSummary (closed projection)
    // TODO: interface OrderSummaryOpen (open projection с @Value SpEL)
    // TODO: record OrderReportRow (DTO projection)
    // TODO: Repository с разными projection methods
}
