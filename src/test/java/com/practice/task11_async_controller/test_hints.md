# Подсказки: Async Controller
## Обязательно
- CompletableFuture: MockMvc .andExpect(request().asyncStarted()).andExpect(status().isOk())
- DeferredResult: timeout → 503. Result set → 200.
- StreamingResponseBody: response body корректен.
