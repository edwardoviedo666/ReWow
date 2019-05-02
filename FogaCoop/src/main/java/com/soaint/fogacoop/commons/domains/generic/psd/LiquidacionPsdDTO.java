package com.soaint.fogacoop.commons.domains.generic.psd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LiquidacionPsdDTO implements Serializable {

    private Double valorPrima;
    private Double valPosNeta;
    private Double totalBaseCalPri;
    private Double valDep;
    private Double saldoCargo;
    private Double saldoFavor;
    private Double InteresMora;
    private Double diasMora;
    private Double totalPagar;
}
