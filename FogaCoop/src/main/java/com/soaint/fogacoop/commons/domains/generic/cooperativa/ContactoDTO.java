package com.soaint.fogacoop.commons.domains.generic.cooperativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ContactoDTO implements Serializable {

    private String nombreContact;
    private String cargoCont;
    private String correoElectronico;
    private String ciudadContac;
    private Integer indicativoContac;
    private Integer telefonosContact;

}
