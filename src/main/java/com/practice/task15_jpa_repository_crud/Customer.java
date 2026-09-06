package com.practice.task15_jpa_repository_crud;

import jakarta.persistence.*;

/**
 * DATA — @Entity + JpaRepository (базовый CRUD в БД)
 *
 * <p><b>Проблема / что даёт Spring Data:</b> без него — руками JDBC/SQL, маппинг строк в объекты.
 * Spring Data JPA: помечаешь класс @Entity, объявляешь интерфейс extends JpaRepository — и получаешь
 * save/findById/findAll/deleteById БЕЗ реализации (Spring генерит её сам).</p>
 *
 * <p><b>Реализуй:</b> сущность Customer (@Id + генерация, поля name/email) и интерфейс
 * {@link CustomerRepository} extends JpaRepository&lt;Customer, Long&gt;; добавь derived-query findByEmail.</p>
 *
 * <p><b>Как протестить:</b> {@code @DataJpaTest} (H2/Testcontainers-Postgres) — сохранить,
 * найти по id, findByEmail; проверить генерацию id и что deleteById удаляет.</p>
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // TODO: конструкторы/геттеры (или @Data/record-подход по вкусу)
}
