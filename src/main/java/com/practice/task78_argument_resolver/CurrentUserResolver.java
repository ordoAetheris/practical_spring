package com.practice.task78_argument_resolver;

/**
 * Задача 52 — Custom Argument Resolver: @CurrentUser на параметрах контроллера.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>@CurrentUser аннотация для параметров метода контроллера</li>
 *   <li>CurrentUserArgumentResolver implements HandlerMethodArgumentResolver</li>
 *   <li>supportsParameter: параметр аннотирован @CurrentUser</li>
 *   <li>resolveArgument: извлечь user из SecurityContext / JWT / Header</li>
 *   <li>Регистрация через WebMvcConfigurer.addArgumentResolvers()</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring MVC вызывает resolvers для каждого параметра handler-метода.
 * Цепочка: @RequestBody → RequestResponseBodyMethodProcessor,
 * @PathVariable → PathVariableMethodArgumentResolver, @CurrentUser → наш resolver.
 *
 * Сложность: Medium
 */
public class CurrentUserResolver {
    // TODO: @CurrentUser annotation (@Target(PARAMETER), @Retention(RUNTIME))
    // TODO: UserInfo record (id, username, roles)
    // TODO: CurrentUserArgumentResolver implements HandlerMethodArgumentResolver
    // TODO: WebMvcConfigurer registration
    // TODO: DemoController: getProfile(@CurrentUser UserInfo user)
}
