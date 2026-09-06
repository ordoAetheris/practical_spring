# Подсказки: Pagination + Sorting
## Обязательно
- page=0, size=10: первые 10. sort=salary,desc: по убыванию зарплаты.
- Множественная сортировка: sort=salary,desc&sort=name,asc.
- PageResponse: hasNext true/false на последней странице.
## Продвинутые
- Cursor pagination: after=lastId корректно пропускает. Быстрее offset на больших данных.
