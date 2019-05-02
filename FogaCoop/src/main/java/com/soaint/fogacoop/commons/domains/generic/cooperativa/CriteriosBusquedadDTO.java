package com.soaint.fogacoop.commons.domains.generic.cooperativa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CriteriosBusquedadDTO {

    private List<String> NIT;
    private List<String> sigla;
    private List<String> codSIAF;
    private List<String> nombreCoop;
}
