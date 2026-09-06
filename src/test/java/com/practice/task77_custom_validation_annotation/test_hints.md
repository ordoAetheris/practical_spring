# Подсказки: Custom Validation Annotations
## Обязательно
- @ValidAge(min=18): age=17 → violation. age=18 → ok. age=null → ok (nullable).
- @StrongPassword: "abc" → violation. "Abc123!@" → ok.
- @ValidDateRange: start > end → class-level violation.
## Как тестировать
- Validator validator = Validation.buildDefaultValidatorFactory().getValidator()
- Set<ConstraintViolation<?>> violations = validator.validate(dto)
