package com.practice.task24_flyway_migrations;

/**
 * Задача 19 — Flyway: сложная миграция с данными.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>V1: создание таблиц users, orders</li>
 *   <li>V2: добавление колонки email в users (без NOT NULL — обратная совместимость)</li>
 *   <li>V3: data migration — заполнение email из legacy таблицы (Java-based migration)</li>
 *   <li>V4: ALTER ADD NOT NULL после заполнения</li>
 *   <li>V5: создание index CONCURRENTLY (PostgreSQL)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Flyway: SQL files в classpath:db/migration/. Naming: V1__description.sql.
 * Java migration: extends BaseJavaMigration → для сложной логики.
 * Checksums: Flyway проверяет что миграция не изменилась после применения.
 *
 * <h2>Zero-downtime migration pattern</h2>
 * Нельзя ADD NOT NULL сразу на заполненную таблицу: new code деплоится ДО миграции.
 * Поэтому: V2 (add nullable) → deploy new code → V3 (fill data) → V4 (add constraint).
 *
 * Сложность: Hard
 */
public class FlywayMigrationTask {
    // TODO: SQL migrations в src/main/resources/db/migration/
    // TODO: Java migration (V3) extends BaseJavaMigration
    // TODO: Тест: Flyway applied all migrations, data correct
}
