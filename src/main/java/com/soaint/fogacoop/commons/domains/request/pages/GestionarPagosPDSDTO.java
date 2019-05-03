package com.soaint.fogacoop.commons.domains.request.pages;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.CooperativaDTO;
import com.soaint.fogacoop.commons.domains.generic.gestiones.GestionNovedadDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.ContactoDTO;
import com.soaint.fogacoop.commons.domains.generic.psd.LiquidacionPsdDTO;
import com.soaint.fogacoop.commons.domains.generic.psd.PagoPsdDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GestionarPagosPDSDTO implements Serializable {

    private CooperativaDTO informacionCooperativa;
    private ContactoDTO contacto;
    private LiquidacionPsdDTO liquidacion;
    private PagoPsdDTO pago;
    private GestionNovedadDTO gestionNovedad;


}
