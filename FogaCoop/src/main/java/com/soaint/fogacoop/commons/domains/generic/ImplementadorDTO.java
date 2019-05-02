package com.soaint.fogacoop.commons.domains.generic;

import java.io.Serializable;
import java.time.LocalDate;

public class ImplementadorDTO extends PersonaDTO implements Serializable {

    private LocalDate fechaInicioContrato;
    private LocalDate fechaFinContrato;

    public ImplementadorDTO() {
    }


}
