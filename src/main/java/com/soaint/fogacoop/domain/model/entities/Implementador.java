package com.soaint.fogacoop.domain.model.entities;

import com.soaint.fogacoop.domain.model.entities.base.BaseEntity;
import com.soaint.fogacoop.domain.model.entities.base.audit.AuditBaseEntity;
import com.soaint.fogacoop.domain.model.entities.base.audit.AuditListener;
import com.soaint.fogacoop.domain.model.entities.base.audit.Auditable;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table
@Data
@EntityListeners(AuditListener.class)
public class Implementador extends BaseEntity implements Serializable, Auditable {

    private String cargo;
    private LocalDate fechaUltimoCargo;
    private AuditBaseEntity audit;

    public Implementador() {
        this.fechaUltimoCargo = LocalDate.now().plusDays(1L);
    }

    @Override
    public void setAudit(AuditBaseEntity audit) {

    }

    @Override
    public AuditBaseEntity getAudit() {
        return null;
    }
}
