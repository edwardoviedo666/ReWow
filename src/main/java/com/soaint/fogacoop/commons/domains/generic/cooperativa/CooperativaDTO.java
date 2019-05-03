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
public class CooperativaDTO implements Serializable {

    private Integer codigoSiaf;
    private String nombreCoop;
    private String NIT;
    private String tipoCoop;
    private String sigla;
    private LocalDate fechaInscripcion;

}
