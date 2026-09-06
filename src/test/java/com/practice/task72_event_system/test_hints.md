# Подсказки: Spring Event System

## Обязательно протестировать
- createOrder → AuditEventListener получил OrderCreatedEvent
- payOrder → AuditEventListener получил OrderPaidEvent
- Ordering: audit записан ПЕРЕД notification
- VipListener: amount > 1000 → вызван, amount < 1000 → не вызван

## Продвинутые кейсы
- @Async: NotificationListener выполняется в другом потоке (Thread.currentThread().getName())
- @Async не блокирует publisher (timing: publisher быстрее чем async listener)
- @SpringBootTest + @EnableAsync для интеграционного теста
- Несколько events подряд: audit log содержит все в порядке
