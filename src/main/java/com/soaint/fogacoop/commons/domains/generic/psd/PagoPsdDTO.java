package com.soaint.fogacoop.commons.domains.generic.psd;

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

public class PagoPsdDTO implements Serializable {

    private String novedad;
    private LocalDate fecha;
    private Double valorPagado;


}
