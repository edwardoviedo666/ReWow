package com.soaint.fogacoop.commons.domains.request.pages;

import com.soaint.fogacoop.commons.domains.generic.cooperativa.ConsultaMovimientosDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.CooperativaDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ConsultaMovimientosCooperativaDTO implements Serializable {

    private CooperativaDTO cooperativa;
    private ConsultaMovimientosDTO consultaMovimientos;
}
