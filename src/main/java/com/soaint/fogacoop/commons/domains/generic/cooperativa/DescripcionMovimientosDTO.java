package com.soaint.fogacoop.commons.domains.generic.cooperativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class DescripcionMovimientosDTO implements Serializable {

    private LocalDate fecha;
    private String descripcion;
    private Double valor;
    private Double saldoAfavor;
    private Double saldoPendientePagar;
}
