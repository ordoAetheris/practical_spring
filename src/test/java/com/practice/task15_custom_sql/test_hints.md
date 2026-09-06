# Подсказки: Custom SQL
## Обязательно
- JPQL: findByEmailDomain("@gmail.com") → users с gmail.
- Native: SQL с JOIN работает.
- @Modifying: bulk deactivateByDepartment("old-dept") → affected rows.
## Продвинутые
- Pagination в native query: countQuery обязателен.
- @Modifying(clearAutomatically=true): flush persistence context после UPDATE.
