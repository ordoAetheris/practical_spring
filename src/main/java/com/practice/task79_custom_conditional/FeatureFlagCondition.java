package com.practice.task79_custom_conditional;

/**
 * Задача 53 — Custom @Conditional: @ConditionalOnEnv + @ConditionalOnFeatureFlag.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@ConditionalOnEnv("prod") → бин создаётся если APP_ENV=prod</li>
 *   <li>@ConditionalOnFeatureFlag("new-checkout") → features.new-checkout=true</li>
 *   <li>Комбинирование: @ConditionalOnEnv("prod") + @ConditionalOnFeatureFlag("x") на одном бине → AND</li>
 *   <li>Негативный: @ConditionalOnMissingEnv — бин если env var НЕ установлена</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Condition.matches(ConditionContext, AnnotatedTypeMetadata).
 * ConditionContext: доступ к Environment, BeanFactory, ResourceLoader.
 * AnnotatedTypeMetadata: доступ к атрибутам аннотации (getAllAnnotationAttributes).
 * Все @ConditionalOn* из Spring Boot реализованы через этот механизм.
 *
 * Сложность: Medium
 */
public class FeatureFlagCondition {
    // TODO: @ConditionalOnEnv annotation + EnvCondition
    // TODO: @ConditionalOnFeatureFlag annotation + FeatureFlagCondition
    // TODO: Configuration с @Bean + @ConditionalOnEnv/@ConditionalOnFeatureFlag
}
