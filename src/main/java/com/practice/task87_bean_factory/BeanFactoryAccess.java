package com.practice.task87_bean_factory;

/**
 * ПОД КАПОТОМ — BeanFactory vs ApplicationContext (для любопытных)
 *
 * <p><b>Что это:</b> BeanFactory — базовый контейнер (ленивое создание бинов по запросу).
 * ApplicationContext — надстройка над ним (eager-инициализация синглтонов, события, i18n, ресурсы,
 * авто-регистрация BeanPostProcessor'ов). В приложениях используешь ApplicationContext.</p>
 *
 * <p><b>Реализуй:</b> продемонстрируй программное получение бина и ЛЕНИВОСТЬ: бин с @Lazy создаётся
 * только при первом getBean; сравни eager (обычный синглтон создаётся на старте) vs lazy.</p>
 *
 * <p><b>Когда (НЕ) нужно:</b> прямой доступ к фабрике/контейнеру — редко (тесты, фреймворочный код).
 * Обычно — инъекция.</p>
 *
 * <p><b>Как протестить:</b> @SpringBootTest + ApplicationContext: getBean(тип) возвращает синглтон
 * (два вызова — тот же объект); @Lazy-бин не создан до первого обращения (флаг в конструкторе).</p>
 */
public class BeanFactoryAccess {

    // TODO: получить бин программно (через ApplicationContext/BeanFactory), показать singleton-семантику
    public Object lookup(String beanName) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: продемонстрировать @Lazy (создание при первом обращении)
}
