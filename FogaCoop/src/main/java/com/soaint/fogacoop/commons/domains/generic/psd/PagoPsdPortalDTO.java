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
public class PagoPsdPortalDTO implements Serializable {

    private String banco;
    private String nombreTitular;
    private String tipoPersona;
    private Integer documentoPersona;
    private Integer telefonoPersona;
}
