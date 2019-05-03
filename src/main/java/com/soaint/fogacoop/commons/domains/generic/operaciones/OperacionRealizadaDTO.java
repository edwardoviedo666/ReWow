package com.soaint.fogacoop.commons.domains.generic.operaciones;

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
public class OperacionRealizadaDTO implements Serializable {

    private String operacionRealizada;
    private LocalDate fechaOperacion;
    private String observaciones;
}
