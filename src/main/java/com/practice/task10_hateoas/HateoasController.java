package com.practice.task10_hateoas;

/**
 * Задача 40 — HATEOAS: hypermedia-driven REST API.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>EntityModel: обёртка entity + links (self, collection)</li>
 *   <li>CollectionModel: список entities + links (self, next, prev)</li>
 *   <li>RepresentationModelAssembler: конвертация Entity → EntityModel</li>
 *   <li>Affordances: описание доступных операций (GET, POST, PUT, DELETE)</li>
 *   <li>HAL format: _links, _embedded</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring HATEOAS: WebMvcLinkBuilder.linkTo(methodOn(Controller.class).getUser(id)).withSelfRel()
 * HAL (Hypertext Application Language): стандартный формат hypermedia.
 * Affordances (Spring HATEOAS 2.0): описывают не только links, но и HTTP methods + payload.
 *
 * Сложность: Medium
 */
public class HateoasController {
    // TODO: UserModel extends RepresentationModel<UserModel>
    // TODO: UserModelAssembler implements RepresentationModelAssembler
    // TODO: UserController: CRUD с HATEOAS links
}
