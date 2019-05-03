package com.soaint.fogacoop.commons.domains.request.pages;
import com.soaint.fogacoop.commons.domains.generic.pagos.ConfirmacionPagoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ConfirmacionPagoPortalDTO implements Serializable {

    private ConfirmacionPagoDTO confirmacionPago;
}
