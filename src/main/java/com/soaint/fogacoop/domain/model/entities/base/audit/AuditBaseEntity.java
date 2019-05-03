package com.soaint.fogacoop.domain.model.entities.base.audit;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@NoArgsConstructor
@Embeddable
public class AuditBaseEntity {

    private String procesoInsertar;

    private String procesoActualizar;

    private LocalDateTime tiempoInsercion;

    private LocalDateTime tiempoActualizacion;


}
