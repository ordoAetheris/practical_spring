# Подсказки: Custom Repository (Specification)
## Обязательно
- byCategory("electronics"): только electronics. Комбинация: byCategory AND byPriceRange(10,100).
- NULL filter field → specification не добавляется.
- Pagination: findAll(spec, PageRequest.of(0, 10)).
## Продвинутые
- Пустой filter → все записи. Все поля заполнены → максимально узкий фильтр.
