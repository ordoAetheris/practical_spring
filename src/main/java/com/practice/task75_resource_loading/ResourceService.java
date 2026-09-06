package com.practice.task75_resource_loading;

import org.springframework.core.io.ResourceLoader;

/**
 * Задача 08 — Resource Loading: загрузка файлов из classpath/filesystem/URL.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Загрузка из classpath: {@code classpath:templates/welcome.txt}</li>
 *   <li>Загрузка из filesystem: {@code file:/etc/app/config.yml}</li>
 *   <li>Pattern matching: {@code classpath*:META-INF/*.properties} — все matching ресурсы</li>
 *   <li>ResourceService: loadAsString(location), loadAsBytes(location), exists(location)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * {@code ResourceLoader} / {@code ResourcePatternResolver} абстрагирует доступ к ресурсам.
 * Classpath ресурсы через ClassLoader.getResource(). Filesystem через File/Path.
 *
 * Сложность: Easy
 */
public class ResourceService {
    // TODO: inject ResourceLoader
    // TODO: loadAsString(String location) throws IOException
    // TODO: loadAsBytes(String location) throws IOException
    // TODO: exists(String location) → boolean
    // TODO: findAll(String pattern) → List<String> (file names matching pattern)
}
