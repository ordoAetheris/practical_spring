package com.practice.task16_batch_insert;

/**
 * Задача 16 — Batch Insert: оптимизация вставки 10K+ записей.
 *
 * <h2>Проблема</h2>
 * repository.saveAll(10000 entities) → 10000 INSERT statements (N+1 на write!).
 * С identity generation (@GeneratedValue IDENTITY) batch невозможен в Hibernate.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Наивный saveAll: замерить время для 10K записей</li>
 *   <li>Batch через spring.jpa.properties.hibernate.jdbc.batch_size=50</li>
 *   <li>SEQUENCE generation вместо IDENTITY (для batch compatibility)</li>
 *   <li>JdbcTemplate.batchUpdate: прямой JDBC batch</li>
 *   <li>Сравнение: saveAll vs batch_size vs JdbcTemplate. Benchmark.</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Hibernate batching: группирует INSERT в batch и отправляет одним round-trip.
 * IDENTITY generation: Hibernate ДОЛЖЕН знать generated ID сразу → flush после каждого INSERT.
 * SEQUENCE: Hibernate забирает IDs пачкой (allocationSize), потом batch INSERT.
 *
 * Сложность: Hard
 */
public class BatchInsertService {
    // TODO: Entity Product с @GeneratedValue(strategy = SEQUENCE)
    // TODO: batchSaveNaive(List<Product>) — saveAll
    // TODO: batchSaveJdbc(List<Product>) — JdbcTemplate.batchUpdate
    // TODO: benchmark() — сравнение timing
}
