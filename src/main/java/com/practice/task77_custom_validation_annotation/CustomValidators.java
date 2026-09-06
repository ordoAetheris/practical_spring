package com.practice.task77_custom_validation_annotation;

/**
 * Задача 51 — Custom Validation Annotations: @ValidAge, @StrongPassword.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@ValidAge(min=18, max=120) → ConstraintValidator проверяет диапазон</li>
 *   <li>@StrongPassword → min 8 chars, uppercase, lowercase, digit, special</li>
 *   <li>@ValidDateRange (class-level) → startDate < endDate (cross-field validation)</li>
 *   <li>Интеграция с @Valid на @RequestBody: автоматическая валидация</li>
 *   <li>Кастомное сообщение через message attribute + ValidationMessages.properties</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * ConstraintValidator<A extends Annotation, T>: initialize() читает параметры аннотации,
 * isValid(value, context) проверяет. Spring регистрирует через LocalValidatorFactoryBean.
 * Class-level validator: T = целый объект, проверяем несколько полей.
 *
 * Сложность: Medium
 */
public class CustomValidators {
    // TODO: @ValidAge annotation + AgeValidator implements ConstraintValidator<ValidAge, Integer>
    // TODO: @StrongPassword annotation + PasswordValidator
    // TODO: @ValidDateRange (class-level) annotation + DateRangeValidator
    // TODO: DTO с этими аннотациями
}
