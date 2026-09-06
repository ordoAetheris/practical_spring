package com.practice.task23_multi_datasource;

/**
 * Задача 18 — Multi-Datasource: два PostgreSQL в одном приложении.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>Primary: "orders" database (OrderEntity)</li>
 *   <li>Secondary: "analytics" database (ReportEntity)</li>
 *   <li>Разные EntityManagerFactory, TransactionManager, DataSource</li>
 *   <li>@EnableJpaRepositories(basePackages, entityManagerFactoryRef, transactionManagerRef)</li>
 *   <li>Cross-datasource operation: read from orders, write to analytics</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * Spring Boot auto-configures один DataSource. Для двух — manual configuration.
 * Каждый DataSource → свой LocalContainerEntityManagerFactoryBean → свой PlatformTransactionManager.
 * @Primary на одном из них (default).
 *
 * Сложность: Hard
 */
public class MultiDatasourceConfig {
    // TODO: @Configuration для primary DataSource + EntityManager + TransactionManager
    // TODO: @Configuration для secondary
    // TODO: Entities в разных пакетах (basePackages)
}
