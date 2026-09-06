package com.practice.task09_file_upload;

/**
 * Задача 34 — File Upload/Download: multipart + streaming.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Upload: POST /files (multipart/form-data) → сохранение на диск</li>
 *   <li>Download: GET /files/{id} → streaming response (не грузить весь файл в память)</li>
 *   <li>Validation: max size (10MB), allowed types (jpg, png, pdf)</li>
 *   <li>Multiple files: POST /files/batch</li>
 *   <li>Progress: upload progress через StreamingResponseBody</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * MultipartResolver парсит multipart request. StandardServletMultipartResolver (default).
 * StreamingResponseBody: запись в OutputStream напрямую (не копирование в byte[]).
 * spring.servlet.multipart.max-file-size=10MB в properties.
 *
 * Сложность: Medium
 */
public class FileUploadService {
    // TODO: FileController: upload, download, batch upload
    // TODO: FileStorageService: save to disk, generate unique name
    // TODO: File validation (size, type)
}
