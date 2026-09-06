# Подсказки: Graceful Shutdown
## Обязательно
- Long request + shutdown → request завершается ДО shutdown.
- Timeout: stuck request → force shutdown после timeout.
- SmartLifecycle: stop() вызван перед server shutdown.
