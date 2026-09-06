package com.practice.task76_lifecycle_hooks;

import org.springframework.context.SmartLifecycle;

/**
 * Задача 09 — Lifecycle Hooks: @PostConstruct, DisposableBean, SmartLifecycle.
 *
 * <h2>Порядок lifecycle в Spring</h2>
 * <ol>
 *   <li>Конструктор</li>
 *   <li>Setter injection / field injection</li>
 *   <li>BeanPostProcessor.postProcessBeforeInitialization</li>
 *   <li>{@code @PostConstruct}</li>
 *   <li>{@code InitializingBean.afterPropertiesSet()}</li>
 *   <li>{@code @Bean(initMethod = "init")}</li>
 *   <li>BeanPostProcessor.postProcessAfterInitialization</li>
 *   <li>... бин живёт ...</li>
 *   <li>{@code @PreDestroy}</li>
 *   <li>{@code DisposableBean.destroy()}</li>
 *   <li>{@code @Bean(destroyMethod = "cleanup")}</li>
 * </ol>
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>ConnectionManager: @PostConstruct открывает "соединение", @PreDestroy закрывает</li>
 *   <li>CacheWarmer implements SmartLifecycle: start() заполняет кэш, stop() очищает</li>
 *   <li>LifecycleLogger: логирует ВСЕ lifecycle events в List для тестирования порядка</li>
 * </ol>
 *
 * Сложность: Medium
 */
public class LifecycleService {
    // TODO: ConnectionManager с @PostConstruct/@PreDestroy
    // TODO: CacheWarmer implements SmartLifecycle (getPhase, isRunning, start, stop)
    // TODO: LifecycleLogger для verification порядка вызовов
}
