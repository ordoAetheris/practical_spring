# Подсказки: File Upload/Download
## Обязательно
- Upload: multipart + file → 201 + location. Download: GET → файл, правильный Content-Type.
- Size > 10MB → 413. Wrong type → 400.
- Batch upload: несколько файлов.
