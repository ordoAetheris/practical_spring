package com.practice.task04_rest_controller_crud;

import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * WEB — БАЗОВЫЙ @RestController (CRUD наружу)
 *
 * <p><b>Проблема / что даёт Spring:</b> Spring MVC превращает Java-метод в HTTP-endpoint —
 * маршрутизация, парсинг пути/параметров/тела, сериализация ответа в JSON. Тебе не надо руками
 * разбирать HTTP: аннотации @GetMapping/@PostMapping + @PathVariable/@RequestParam/@RequestBody.</p>
 *
 * <p><b>Реализуй:</b> CRUD по продуктам:
 * GET /products (список), GET /products/{id}, POST /products (тело), PUT /products/{id}, DELETE /products/{id}.
 * Хранилище — in-memory Map (это про web-слой, не про БД).</p>
 *
 * <p><b>Как протестить:</b> {@code @WebMvcTest(ProductController.class)} + MockMvc:
 * mockMvc.perform(get("/products")).andExpect(status().isOk()); проверь коды (200/201/404), JSON-тело,
 * что POST создаёт, DELETE удаляет.</p>
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    public record Product(Long id, String name, double price) {}

    @GetMapping
    public List<Product> list() { throw new UnsupportedOperationException("TODO"); }

    @GetMapping("/{id}")
    public Product get(@PathVariable Long id) { throw new UnsupportedOperationException("TODO"); }

    @PostMapping
    public Product create(@RequestBody Product product) { throw new UnsupportedOperationException("TODO"); }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) { throw new UnsupportedOperationException("TODO"); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { throw new UnsupportedOperationException("TODO"); }
}
