package com.soaint.fogacoop.domain.model.entities.base.audit;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class AuditListener {

    @PrePersist
    public void setCreateOn(Auditable auditable) {

        AuditBaseEntity audit = auditable.getAudit();

        if(audit == null){
            audit = new AuditBaseEntity();
            auditable.setAudit(audit);
        }
        audit.setProcesoInsertar("I");
        audit.setTiempoInsercion(LocalDateTime.now());
    }

    public void setUpdateOn(Auditable auditable){
        AuditBaseEntity audit = auditable.getAudit();
        audit.setProcesoActualizar("U");
        audit.setTiempoActualizacion(LocalDateTime.now());

    }

}
