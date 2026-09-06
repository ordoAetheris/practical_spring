package com.practice.task07_content_negotiation;

/**
 * Задача 33 — Content Negotiation: JSON + XML + CSV.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Один endpoint, разные форматы: Accept: application/json, application/xml, text/csv</li>
 *   <li>JSON: Jackson (default). XML: jackson-dataformat-xml. CSV: custom HttpMessageConverter.</li>
 *   <li>URL extension: /api/products.json, /api/products.csv (deprecated но встречается)</li>
 *   <li>Custom CsvHttpMessageConverter extends AbstractHttpMessageConverter</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * ContentNegotiationManager выбирает MediaType по: 1) Accept header, 2) URL extension, 3) parameter (?format=xml).
 * HttpMessageConverter chain: Spring пробует каждый converter пока один не подойдёт.
 *
 * Сложность: Medium
 */
public class ContentNegotiationConfig {
    // TODO: WebMvcConfigurer + configureContentNegotiation
    // TODO: CsvHttpMessageConverter extends AbstractHttpMessageConverter<List<?>>
    // TODO: ProductController: один endpoint, три формата
}
