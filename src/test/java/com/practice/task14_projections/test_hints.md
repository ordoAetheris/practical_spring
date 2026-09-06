# Подсказки: Projections
## Обязательно
- Interface projection: OrderSummary возвращает только нужные поля (не весь entity).
- DTO projection: constructor expression в JPQL.
- Dynamic projection: один метод, разные return types (Class<T> parameter).
## Продвинутые
- Open projection с @Value SpEL: computed field (quantity * price).
- N+1: projection не должна тянуть lazy associations.
