# Подсказки: HATEOAS
## Обязательно
- GET /users/1 → JSON с _links.self.href = "/users/1".
- GET /users → _embedded.users + _links.next/prev.
- POST /users → 201 + Location header + _links.self.
