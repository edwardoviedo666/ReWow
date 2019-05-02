package com.soaint.fogacoop.commons.domains.request.pages;

import com.soaint.fogacoop.commons.domains.generic.cooperativa.ConsultaMovimientosDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.ContactoDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.CooperativaDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.CriteriosBusquedadDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class ConsultaMovimientosCoopDTO implements Serializable {

    private CriteriosBusquedadDTO busquedad;
    private CooperativaDTO cooperativa;
    private ContactoDTO contacto;
    private ConsultaMovimientosDTO movimientosCooperativa;

}
