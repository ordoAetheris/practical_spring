package com.practice.task05_request_validation;

/**
 * Задача 32 — Request Validation: @Valid + кастомный валидатор.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>DTO с @NotBlank, @Email, @Size, @Min, @Pattern</li>
 *   <li>@Valid на @RequestBody → автоматическая валидация</li>
 *   <li>Custom: @UniqueEmail → проверка уникальности через БД</li>
 *   <li>Cross-field: @PasswordsMatch → password == confirmPassword</li>
 *   <li>Validation groups: @Validated(OnCreate.class) vs @Validated(OnUpdate.class)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * JSR-380 (Jakarta Validation). Spring интегрирует через MethodValidationPostProcessor (BPP!).
 * ConstraintValidator<A, T>: isValid() вызывается для каждого поля/класса.
 *
 * Сложность: Medium
 */
public class ValidationConfig {
    // TODO: CreateUserRequest DTO с annotations
    // TODO: @UniqueEmail annotation + UniqueEmailValidator implements ConstraintValidator
    // TODO: @PasswordsMatch class-level annotation + validator
    // TODO: Validation groups: OnCreate, OnUpdate marker interfaces
}
