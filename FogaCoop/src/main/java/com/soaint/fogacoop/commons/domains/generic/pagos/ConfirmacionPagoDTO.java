package com.soaint.fogacoop.commons.domains.generic.pagos;
import com.soaint.fogacoop.commons.domains.generic.lists.BancoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class ConfirmacionPagoDTO implements Serializable {

   private String entidad;
    private String NIT;
    private LocalDate fechaPago;
    private String estadoPago;
    private Integer numTransaccion;
    private List<BancoDTO> banco;
    private Double valorPagado;
    private String descripcion;
}
