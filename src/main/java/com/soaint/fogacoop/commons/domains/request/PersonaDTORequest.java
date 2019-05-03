package com.soaint.fogacoop.commons.domains.request;

import com.soaint.fogacoop.commons.domains.generic.PersonaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonaDTORequest extends PersonaDTO {
    private String nombre;
    private String numIdentificacion;
    private String tipoId;
    private int estado;
}
