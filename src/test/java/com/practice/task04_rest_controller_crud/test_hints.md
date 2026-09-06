# task04 rest_controller_crud
- @WebMvcTest + MockMvc: коды 200/201/404, JSON-поля (jsonPath), Content-Type.
- POST с телом → 201 + объект; GET несуществующего → 404; DELETE → 204/200 и его больше нет.
- Позже: сюда же ложатся validation (05) и exception_handler (06) — это «тюны» этого же слоя.
