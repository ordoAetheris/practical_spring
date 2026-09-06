# task15 jpa_repository_crud
- @DataJpaTest поднимает ТОЛЬКО JPA-слой (быстро). save → id сгенерён; findById/findByEmail; deleteById.
- Testcontainers-Postgres — если хочешь «настоящую» БД, а не H2 (пригодится в 57 testcontainers).
- Понять: derived queries (findByEmail) Spring парсит из имени метода.
