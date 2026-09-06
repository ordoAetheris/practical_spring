package com.practice.task54_annotation_scanning;

/**
 * Задача 54 — Runtime Annotation Scanning: реестр обработчиков.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@BusinessEvent("order.created") — кастомная аннотация на классах-обработчиках</li>
 *   <li>EventHandlerRegistry: при старте сканирует classpath, находит все @BusinessEvent</li>
 *   <li>dispatch(eventName, payload) → вызывает matching handler</li>
 *   <li>Сканирование через ClassPathScanningCandidateComponentProvider или BeanPostProcessor</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * ClassPathScanningCandidateComponentProvider: сканирует .class файлы без загрузки.
 * Альтернатива: BPP iterate все бины и проверять аннотации через AnnotationUtils.
 * Spring @ComponentScan внутри использует тот же scanner.
 *
 * Сложность: Hard
 */
public class EventHandlerRegistry {
    // TODO: @BusinessEvent(String eventName) annotation
    // TODO: EventHandler interface: handle(Object payload)
    // TODO: EventHandlerRegistry: scan + register + dispatch
    // TODO: Реализации: OrderCreatedHandler, OrderPaidHandler
}
