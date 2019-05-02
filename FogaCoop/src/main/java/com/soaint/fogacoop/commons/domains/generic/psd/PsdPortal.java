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

public class PsdPortal implements Serializable {

    private Double valorLiquidacion;
    private Double saldoFavor;
    private Double salgoPendiente;
    private Double interesMora;
    private Double valorTotal;
    private String periodoCancelar;
    private int diasMora;
}
