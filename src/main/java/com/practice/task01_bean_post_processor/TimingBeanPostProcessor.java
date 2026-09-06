package com.practice.task01_bean_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Задача 01 — Custom BeanPostProcessor: замер времени инициализации бинов.
 *
 * <h2>Что такое BeanPostProcessor</h2>
 * BPP — хук в жизненный цикл Spring-контейнера. Вызывается для КАЖДОГО бина:
 * <ol>
 *   <li>Конструктор бина</li>
 *   <li>{@code postProcessBeforeInitialization} ← ты здесь</li>
 *   <li>{@code @PostConstruct} / InitializingBean</li>
 *   <li>{@code postProcessAfterInitialization} ← и здесь</li>
 * </ol>
 *
 * Это механизм, через который работают {@code @Autowired}, {@code @Transactional},
 * {@code @Async}, {@code @Cacheable} — Spring подменяет бин на прокси в after-стадии.
 *
 * <h2>Задание</h2>
 * Реализовать BPP, который:
 * <ul>
 *   <li>Замеряет время между before и after initialization для каждого бина</li>
 *   <li>Логирует бины, инициализация которых заняла дольше {@code thresholdMs}</li>
 *   <li>Собирает статистику: общее количество бинов, самый медленный, средне время</li>
 *   <li>Предоставляет метод {@code getStats()} для доступа к статистике</li>
 * </ul>
 *
 * <h2>Что под капотом</h2>
 * Spring вызывает BPP через {@code AbstractAutowireCapableBeanFactory#applyBeanPostProcessorsBeforeInitialization}.
 * BPP сам должен быть бином (зарегистрирован через {@code @Component} или {@code @Bean}).
 * BPP обрабатывает ВСЕ бины, включая infrastructure — фильтруй по имени/аннотации если нужно.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Не ломать нормальный lifecycle бинов (всегда возвращать bean, не null)</li>
 *   <li>Thread-safe: Spring может создавать бины из разных потоков</li>
 *   <li>{@code getStats()} возвращает immutable snapshot</li>
 * </ul>
 *
 * Сложность: Medium
 */
public class TimingBeanPostProcessor implements BeanPostProcessor {

    // TODO: поле для хранения start times (ConcurrentHashMap<String, Long>)
    // TODO: поле для хранения результатов (ConcurrentHashMap<String, Long>)
    // TODO: thresholdMs

    /**
     * @param thresholdMs — порог в мс. Бины медленнее этого будут залогированы.
     */
    public TimingBeanPostProcessor(long thresholdMs) {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // TODO: запомнить System.nanoTime() для beanName
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // TODO: вычислить duration, если > thresholdMs — залогировать
        // TODO: сохранить в результаты
        // ВАЖНО: вернуть bean (не null!)
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    /**
     * Статистика инициализации бинов.
     */
    public record BeanInitStats(
            int totalBeans,
            long slowestMs,
            String slowestBeanName,
            double averageMs
    ) {}

    /**
     * Возвращает immutable snapshot статистики.
     */
    public BeanInitStats getStats() {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    /**
     * Возвращает время инициализации конкретного бина в мс (или -1 если не найден).
     */
    public long getInitTimeMs(String beanName) {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }
}
