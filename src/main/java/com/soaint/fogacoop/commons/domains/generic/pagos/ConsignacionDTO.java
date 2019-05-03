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
public class ConsignacionDTO implements Serializable {

    private String ciudad;
    private LocalDate fechaConsignacion;
    private List<BancoDTO> banco;
    private Integer numTransferencia;
    private String NIT;
    private String nomCooperativa;
    private Double valorPagado;

}
