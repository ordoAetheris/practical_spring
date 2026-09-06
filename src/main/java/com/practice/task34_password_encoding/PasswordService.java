package com.practice.task34_password_encoding;

/**
 * Задача 27 — Password Encoding: BCrypt + Argon2 + миграция.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>DelegatingPasswordEncoder: поддержка нескольких алгоритмов ({bcrypt}, {argon2})</li>
 *   <li>Миграция: при login проверяем старый hash, перешифровываем новым алгоритмом</li>
 *   <li>Password policy: min length, uppercase, digit, special char</li>
 *   <li>Тест: verify что один plaintext → разные hashes (salt)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * BCrypt: adaptive hash, salt встроен в hash, work factor (cost) = 2^N iterations.
 * Argon2: memory-hard (защита от GPU brute force). Более modern.
 * DelegatingPasswordEncoder: prefix {bcrypt}$2a$... определяет какой декодер использовать.
 *
 * Сложность: Easy
 */
public class PasswordService {
    // TODO: DelegatingPasswordEncoder конфигурация
    // TODO: PasswordMigrationService: check + re-encode при login
    // TODO: PasswordPolicyValidator
}
