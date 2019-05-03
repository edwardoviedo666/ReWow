package com.soaint.fogacoop.domain.model.entities.base.audit;

public interface Auditable {

    void setAudit(AuditBaseEntity audit);

    AuditBaseEntity getAudit();

}
