package com.practice.task03_custom_scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Задача 03 — Custom Scope: один бин на поток (thread-scoped).
 *
 * <h2>Что такое Scope в Spring</h2>
 * Scope определяет lifecycle и visibility бина: singleton (один на контейнер),
 * prototype (новый каждый раз), request (один на HTTP request), session.
 * Можно создать свой scope через {@code Scope} interface.
 *
 * <h2>Задание</h2>
 * Реализовать thread scope: один экземпляр бина на каждый Thread.
 * Как ThreadLocal, но управляемый Spring-контейнером.
 *
 * <ul>
 *   <li>{@code get(name, objectFactory)} — вернуть бин для текущего потока (создать если нет)</li>
 *   <li>{@code remove(name)} — удалить бин текущего потока</li>
 *   <li>{@code registerDestructionCallback(name, callback)} — вызвать при remove</li>
 * </ul>
 *
 * <h2>Под капотом</h2>
 * Spring вызывает {@code scope.get()} каждый раз когда кто-то запрашивает бин с этим scope.
 * Scope хранит экземпляры и решает создавать новый или вернуть существующий.
 * {@code ConfigurableBeanFactory.registerScope("thread", new ThreadScope())} — регистрация.
 *
 * <h2>Требования</h2>
 * <ul>
 *   <li>Thread-safe (разные потоки не видят бины друг друга)</li>
 *   <li>Destruction callbacks вызываются при remove</li>
 *   <li>Memory leak prevention: cleanup при завершении потока (ThreadLocal.remove)</li>
 * </ul>
 *
 * Сложность: Hard
 */
public class ThreadScope implements Scope {

    // TODO: ThreadLocal<Map<String, Object>> для хранения бинов per thread
    // TODO: ThreadLocal<Map<String, Runnable>> для destruction callbacks

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    @Override
    public Object remove(String name) {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }

    @Override
    public Object resolveContextualObject(String key) { return null; }

    @Override
    public String getConversationId() {
        return String.valueOf(Thread.currentThread().getId());
    }

    /**
     * Вызвать при завершении потока — очистка всех бинов и вызов callbacks.
     */
    public void cleanup() {
        throw new UnsupportedOperationException("TODO: реализуйте");
    }
}
