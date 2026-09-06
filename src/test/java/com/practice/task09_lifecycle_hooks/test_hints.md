# Подсказки: Lifecycle Hooks

## Обязательно протестировать
- Порядок вызовов: @PostConstruct ДО SmartLifecycle.start()
- ConnectionManager: isConnected() true после init, false после destroy
- SmartLifecycle: isRunning() отражает реальное состояние
- LifecycleLogger: порядок events = [constructor, postConstruct, start, ..., stop, preDestroy]

## Продвинутые кейсы
- Поднять контекст, закрыть: проверить что все destroy вызваны
- SmartLifecycle phase ordering: phase=0 стартует раньше phase=1
