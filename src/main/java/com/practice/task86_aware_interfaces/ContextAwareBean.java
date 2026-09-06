package com.practice.task86_aware_interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.BeansException;

/**
 * ПОД КАПОТОМ — AWARE-ИНТЕРФЕЙСЫ (для любопытных, не нужно на старте)
 *
 * <p><b>Что это:</b> Aware-интерфейсы дают бину доступ к «служебным» объектам контейнера:
 * ApplicationContextAware → сам контекст, BeanNameAware → своё имя, EnvironmentAware → Environment и т.п.
 * Контейнер вызывает setter до готовности бина.</p>
 *
 * <p><b>Реализуй:</b> реализуй ApplicationContextAware, сохрани контекст, добавь метод, который
 * достаёт другой бин программно (context.getBean(...)).</p>
 *
 * <p><b>Когда (НЕ) нужно:</b> почти НИКОГДА в прикладном коде — это связывает тебя с самим Spring
 * (анти-паттерн). Норма — обычная инъекция. Aware — для инфраструктурных/библиотечных бинов.</p>
 *
 * <p><b>Как протестить:</b> @SpringBootTest — бин получил не-null контекст; getBean возвращает ожидаемый бин.</p>
 */
public class ContextAwareBean implements ApplicationContextAware {

    // TODO: поле ApplicationContext

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // TODO: сохранить контекст
        throw new UnsupportedOperationException("TODO");
    }

    public <T> T lookup(Class<T> type) {
        // TODO: достать бин из контекста программно
        throw new UnsupportedOperationException("TODO");
    }
}
