package com.practice.task07_spel_config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Задача 07 — SpEL: динамические значения в конфигурации.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>{@code @Value("#{systemProperties['user.home']}")} — системные свойства через SpEL</li>
 *   <li>{@code @Value("#{T(java.lang.Math).random()}")} — вызов static метода</li>
 *   <li>{@code @Value("#{@someBean.getConfig()}")} — ссылка на другой бин</li>
 *   <li>SpEL в @ConditionalOnExpression — условная регистрация через SpEL</li>
 *   <li>SpEL Evaluator: программный парсинг SpEL выражений через ExpressionParser</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * SpEL парсится через {@code SpelExpressionParser} и evaluates в контексте
 * {@code StandardEvaluationContext}. {@code @Value} SpEL обрабатывается
 * {@code AutowiredAnnotationBeanPostProcessor}.
 *
 * Сложность: Medium
 */
public class SpelConfigService {
    // TODO: поля с @Value и SpEL выражениями
    // TODO: метод evaluate(String expression) — программный SpEL парсинг
}
