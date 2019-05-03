package com.soaint.fogacoop.commons.domains.request.pages;

import com.soaint.fogacoop.commons.domains.generic.cooperativa.ContactoDTO;
import com.soaint.fogacoop.commons.domains.generic.cooperativa.CooperativaDTO;
import com.soaint.fogacoop.commons.domains.generic.operaciones.OperacionRealizadaDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ConfirmarAbonoDevolucionDTO {

    private CooperativaDTO cooperativa;
    private ContactoDTO contacto;
    private OperacionRealizadaDTO operacionRealizada;
}

