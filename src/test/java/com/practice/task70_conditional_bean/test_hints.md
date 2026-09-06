# Подсказки: Conditional Bean Registration

## Обязательно протестировать
- @ConditionalOnEnv("prod"): бин создаётся при APP_ENV=prod, не создаётся при APP_ENV=dev
- @ConditionalOnFeatureFlag("x"): бин создаётся при features.x=true, не при false/отсутствии
- @ConditionalOnWeekday: зависит от дня — замокать или принять как есть

## Продвинутые кейсы
- Condition без аннотации (programmatic): AnnotationConfigApplicationContext + register
- Несколько @Conditional на одном бине — все должны быть true (AND семантика)
- Подмена System.getenv в тесте: через EnvironmentVariables (JUnit Pioneer) или рефлексию

## Как тестировать Condition
- Unit: создать mock ConditionContext + AnnotatedTypeMetadata, вызвать matches()
- Интеграционно: ApplicationContextRunner — Spring Boot Test утилита для тестирования auto-config
