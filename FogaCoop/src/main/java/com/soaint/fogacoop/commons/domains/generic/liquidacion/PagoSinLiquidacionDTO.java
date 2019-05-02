package com.soaint.fogacoop.commons.domains.generic.liquidacion;

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
public class PagoSinLiquidacionDTO implements Serializable {

    private LocalDate fechaPagoL;
    private Double valorPagado;
}
