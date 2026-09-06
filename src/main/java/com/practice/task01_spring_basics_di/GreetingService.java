package com.practice.task01_spring_basics_di;

import org.springframework.stereotype.Service;

/**
 * АЗЫ SPRING — DI И КОНТЕКСТ (что вообще даёт Spring)
 *
 * <p><b>Проблема / что даёт Spring:</b> без Spring ты руками создаёшь объекты и связываешь их
 * (new Service(new Repo(...))). Spring-контейнер делает это за тебя: помечаешь классы бинами
 * (@Service/@Component/@Bean), объявляешь зависимости — контейнер их внедряет (Dependency Injection).
 * Это и есть «облегчалка»: меньше связывания руками, проще подменять реализации/тестировать.</p>
 *
 * <p><b>Реализуй:</b> сделай {@code GreetingService} бином, внедри зависимость {@link GreetingRepository}
 * ЧЕРЕЗ КОНСТРУКТОР (предпочтительный DI), метод greet(name) возвращает приветствие с текстом из репозитория.</p>
 *
 * <p><b>Как протестить:</b> {@code @SpringBootTest} поднимает контекст — проверь, что бин
 * GreetingService не null и внедрён (контекст загрузился); либо юнитом без Spring — передать заглушку репозитория в конструктор.</p>
 */
@Service
public class GreetingService {

    /** Зависимость, которую внедряет контейнер (реализацию напишешь/замокаешь). */
    public interface GreetingRepository {
        String template(); // напр. "Привет, %s!"
    }

    // TODO: поле-зависимость + конструктор (constructor injection)

    public String greet(String name) {
        // TODO: подставить name в шаблон из репозитория
        throw new UnsupportedOperationException("TODO: DI + greet");
    }
}
