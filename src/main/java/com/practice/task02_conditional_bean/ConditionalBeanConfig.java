package com.practice.task02_conditional_bean;

/**
 * Задача 02 — Conditional Bean Registration: свои @Conditional аннотации.
 *
 * <h2>Что такое @Conditional</h2>
 * Механизм Spring для условной регистрации бинов. Бин создаётся только если
 * {@code Condition.matches()} вернул true. Это основа всей auto-configuration
 * в Spring Boot: {@code @ConditionalOnClass}, {@code @ConditionalOnProperty},
 * {@code @ConditionalOnMissingBean} — все реализованы через этот механизм.
 *
 * <h2>Задание</h2>
 * Реализовать три кастомных условия:
 * <ol>
 *   <li>{@code @ConditionalOnEnv("prod")} — бин регистрируется только если
 *       системная переменная {@code APP_ENV} == значению аннотации</li>
 *   <li>{@code @ConditionalOnFeatureFlag("new-api")} — бин регистрируется если
 *       property {@code features.new-api=true} в application.properties</li>
 *   <li>{@code @ConditionalOnWeekday} — бин регистрируется только в рабочие дни
 *       (пн-пт). Демонстрация runtime condition.</li>
 * </ol>
 *
 * <h2>Как это работает под капотом</h2>
 * Spring читает {@code @Conditional(MyCondition.class)} через
 * {@code ConditionEvaluator} в фазе BeanDefinition registration.
 * Condition получает {@code ConditionContext} (доступ к Environment, BeanFactory,
 * ClassLoader) и {@code AnnotatedTypeMetadata} (доступ к аннотациям на бине).
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Каждый Condition — отдельный класс, implements {@code Condition}</li>
 *   <li>Каждая аннотация — {@code @Target(TYPE, METHOD)}, {@code @Retention(RUNTIME)}</li>
 *   <li>Аннотации мета-аннотированы {@code @Conditional(XxxCondition.class)}</li>
 *   <li>Тестируемость: можно подменить Environment/System property в тесте</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class ConditionalBeanConfig {

    // TODO: создать аннотацию @ConditionalOnEnv(String value) в отдельном файле
    // TODO: создать EnvCondition implements Condition
    //       - matches(): System.getenv("APP_ENV").equals(annotationValue)

    // TODO: создать аннотацию @ConditionalOnFeatureFlag(String value)
    // TODO: создать FeatureFlagCondition implements Condition
    //       - matches(): environment.getProperty("features." + flag, Boolean.class, false)

    // TODO: создать аннотацию @ConditionalOnWeekday
    // TODO: создать WeekdayCondition implements Condition
    //       - matches(): DayOfWeek.of(today) <= FRIDAY

    // TODO: Configuration class с @Bean методами, помеченными кастомными условиями
}
