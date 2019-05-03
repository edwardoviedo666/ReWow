package com.soaint.fogacoop.commons.domains.request.pages;

import com.soaint.fogacoop.commons.domains.generic.pagos.ConsignacionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RegistrarPagosConsignacionDTO implements Serializable {

    private ConsignacionDTO consignacion;
}
