package com.soaint.fogacoop.commons.domains.request.pages;

import com.soaint.fogacoop.commons.domains.generic.psd.PagoPsdPortalDTO;
import com.soaint.fogacoop.commons.domains.generic.psd.PsdPortal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class PagoPortalDTO implements Serializable {

    private PsdPortal psdPortal;
    private PagoPsdPortalDTO pagoPortal;
}
