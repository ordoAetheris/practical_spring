# Подсказки: Password Encoding
## Обязательно
- encode("password") → hash starts with {bcrypt}. matches("password", hash) → true.
- Один plaintext → разные hashes каждый раз (salt).
- Migration: login с {bcrypt} hash → re-encode как {argon2}.
- Policy: "abc" → rejected (too short), "Abc123!@" → accepted.
