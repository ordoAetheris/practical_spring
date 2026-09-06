# Подсказки: Micrometer Basics
## Обязательно
- Counter: после 5 orders → orders_created_total == 5.
- Timer: после processing → order_processing_duration count=1, mean > 0.
- Gauge: register gauge → value отражает текущее состояние.
- /actuator/prometheus → text output содержит наши метрики.
## Gotcha
- Tag cardinality: user_id как tag → OOM. status как tag → ok (bounded).
