# Подсказки: Multi-Datasource
## Обязательно
- OrderEntity в primary DB. ReportEntity в secondary DB.
- Repository для каждого использует свой EntityManager.
- @Transactional на правильном TransactionManager.
## Продвинутые
- Cross-datasource: read from primary, write to secondary. НЕ в одной транзакции (distributed tx нужен XA или saga).
