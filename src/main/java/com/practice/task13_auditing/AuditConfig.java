package com.practice.task13_auditing;

/**
 * Задача 13 — JPA Auditing: @CreatedDate, @LastModifiedBy, AuditorAware.
 *
 * <h2>Задание</h2>
 * <ol>
 *   <li>BaseEntity: @CreatedDate, @CreatedBy, @LastModifiedDate, @LastModifiedBy</li>
 *   <li>AuditorAware impl: достаёт username из SecurityContext (или mock)</li>
 *   <li>@EntityListeners(AuditingEntityListener.class) на BaseEntity</li>
 *   <li>@EnableJpaAuditing в конфигурации</li>
 *   <li>AuditLog entity: сохраняет кто, когда, что изменил (через @PreUpdate listener)</li>
 * </ol>
 *
 * <h2>Под капотом</h2>
 * AuditingEntityListener — JPA entity listener.
 * Spring инжектит AuditorAware через AuditingHandler.
 * @CreatedDate/By заполняются при persist, @LastModified при merge.
 *
 * Сложность: Medium
 */
public class AuditConfig {
    // TODO: BaseEntity (@MappedSuperclass + audit fields)
    // TODO: AuditorAware<String> implementation
    // TODO: @EnableJpaAuditing configuration
    // TODO: AuditLog entity + @PreUpdate listener
}
