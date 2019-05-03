package com.soaint.fogacoop.commons.domains.generic.lists;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BancoDTO {

    private Integer id;
    private String nombreBanco;

}
