package com.practice.task18_custom_sql;

/**
 * Задача 15 — Custom SQL: @Query с native + JPQL + named params.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>JPQL: {@code @Query("SELECT u FROM User u WHERE u.email LIKE %:domain")}</li>
 *   <li>Native: {@code @Query(value = "SELECT * FROM users WHERE ...", nativeQuery = true)}</li>
 *   <li>@Modifying + @Query: bulk UPDATE/DELETE</li>
 *   <li>Pagination в native query: countQuery parameter</li>
 *   <li>Named parameters: @Param("domain") vs positional ?1</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * JPQL → SQL через JPA provider (Hibernate). Entity names, не table names.
 * Native → прямой SQL к БД. Нет entity abstraction — привязка к schema.
 * @Modifying обязателен для UPDATE/DELETE (clearAutomatically = true для flush).
 *
 * Сложность: Easy
 */
public class CustomQueryRepository {
    // TODO: Entity User(id, name, email, department, active, createdAt)
    // TODO: Repository с @Query JPQL + Native + @Modifying
}
