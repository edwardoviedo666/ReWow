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
public class ConsultaMovimientosDTO extends DescripcionMovimientosDTO implements Serializable {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Integer primasPagadas;

}
