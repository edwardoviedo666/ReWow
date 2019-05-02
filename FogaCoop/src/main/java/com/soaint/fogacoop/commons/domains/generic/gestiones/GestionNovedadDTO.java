package com.soaint.fogacoop.commons.domains.generic.gestiones;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GestionNovedadDTO implements Serializable{

    private String decisionCoop;
    private LocalDate fechaCompromisoPago;
    private String desicionJuntaDirectiva;
    private LocalTime tiempoEspera;
    private boolean requEstadosFinancieros;
}
