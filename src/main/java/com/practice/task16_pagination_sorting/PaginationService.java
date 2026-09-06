package com.practice.task16_pagination_sorting;

/**
 * Задача 12 — Pagination + Dynamic Sorting.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Entity: Employee(id, name, department, salary, hireDate)</li>
 *   <li>Endpoint: GET /employees?page=0&size=10&sort=salary,desc&sort=name,asc</li>
 *   <li>Динамическая сортировка: несколько полей, направление (asc/desc)</li>
 *   <li>PageResponse DTO: content, totalElements, totalPages, currentPage, hasNext</li>
 *   <li>Cursor-based pagination: GET /employees?after=lastId&limit=10 (альтернатива offset)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring Data Pageable через HandlerMethodArgumentResolver.
 * Sort.by(Direction, property) → ORDER BY в SQL.
 * Offset pagination: OFFSET 10000 при большом offset — медленно (пересканирует строки).
 * Cursor pagination: WHERE id > :lastId LIMIT 10 — O(1) по index.
 *
 * Сложность: Medium
 */
public class PaginationService {
    // TODO: Entity, Repository, Service, Controller, PageResponse DTO
    // TODO: cursor-based pagination method
}
