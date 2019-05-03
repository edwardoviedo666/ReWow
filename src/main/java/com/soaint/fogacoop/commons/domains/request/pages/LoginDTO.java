package com.soaint.fogacoop.commons.domains.request.pages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LoginDTO implements Serializable {

    private String NIT;
    private String cooperativa;
    private String contraseña;
}
