package com.practice.task50_graalvm_native;

/**
 * Задача 50 — GraalVM Native: нативная компиляция Spring Boot.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>mvn -Pnative native:compile → native executable</li>
 *   <li>RuntimeHints: регистрация reflection/resources для native image</li>
 *   <li>@RegisterReflectionForBinding: для DTO/JSON deserialization</li>
 *   <li>Тест: mvn -PnativeTest test → тесты в native image</li>
 *   <li>Startup time: сравнение JVM vs Native</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * GraalVM AOT: компиляция в native binary. Нет JIT. Startup ~50ms vs ~2sec.
 * Ограничения: reflection/proxy/resources должны быть зарегистрированы AOT.
 * Spring Boot AOT: BeanFactoryInitializationAotProcessor генерирует код при compile.
 *
 * Сложность: Hard
 */
public class NativeImageConfig {
    // TODO: RuntimeHintsRegistrar implementation
    // TODO: @ImportRuntimeHints на configuration class
    // TODO: @RegisterReflectionForBinding на DTOs
    // TODO: native-image.properties если нужно
}
