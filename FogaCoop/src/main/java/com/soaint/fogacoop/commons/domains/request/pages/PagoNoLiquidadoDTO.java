package com.soaint.fogacoop.commons.domains.request.pages;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.ContactoDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.CooperativaDTO;
import com.soaint.fogacoop.commons.domains.generic.liquidacion.PagoSinLiquidacionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PagoNoLiquidadoDTO implements Serializable {

    private CooperativaDTO cooperativa;
    private ContactoDTO contacto;
    private PagoSinLiquidacionDTO pagoSinLiquidacion;

}
