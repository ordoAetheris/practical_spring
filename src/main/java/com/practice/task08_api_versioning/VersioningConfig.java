package com.practice.task08_api_versioning;

/**
 * Задача 39 — API Versioning: URL / Header / MediaType стратегии.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>URL: /api/v1/users, /api/v2/users</li>
 *   <li>Header: X-API-Version: 2 → v2 handler</li>
 *   <li>MediaType: Accept: application/vnd.myapp.v2+json</li>
 *   <li>Custom @ApiVersion annotation: маршрутизация по версии</li>
 *   <li>Deprecation: v1 → response header Sunset + Warning</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * URL versioning: простейшее, разные @RequestMapping paths.
 * Header/MediaType: custom RequestMappingHandlerMapping + RequestCondition.
 * @ApiVersion(1) → custom condition проверяет header/mediatype.
 *
 * Сложность: Hard
 */
public class VersioningConfig {
    // TODO: @ApiVersion annotation
    // TODO: ApiVersionRequestMappingHandlerMapping extends RequestMappingHandlerMapping
    // TODO: ApiVersionRequestCondition implements RequestCondition
    // TODO: v1 и v2 контроллеры
}
