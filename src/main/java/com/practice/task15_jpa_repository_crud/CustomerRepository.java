package com.practice.task15_jpa_repository_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * Репозиторий Customer — CRUD «бесплатно» от Spring Data + derived-query.
 * <p>Реализацию Spring генерит сам; тебе — объявить методы и протестить (@DataJpaTest).</p>
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // TODO: derived query — найти по email
    Optional<Customer> findByEmail(String email);
}
