package com.soaint.fogacoop.commons.domains.request.pages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RecuperarPassDTO implements Serializable {

    private String nombreUsuario;
}
