# Подсказки: RestClient
## Обязательно
- GET → десериализация response. POST → serialization request body.
- 404 от external API → custom exception.
- Timeout → exception.
## Как тестировать
- WireMock: stubFor(get("/users/1").willReturn(jsonResponse(...))).
