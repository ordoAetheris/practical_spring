# Подсказки: JPA Auditing
## Обязательно
- Save entity → createdDate/createdBy заполнены автоматически.
- Update entity → lastModifiedDate/lastModifiedBy обновлены, createdDate не изменился.
- AuditorAware возвращает текущего user.
## Продвинутые
- AuditLog: запись при каждом update с before/after значениями.
