package com.soaint.fogacoop.service.implementador;

import com.soaint.fogacoop.commons.domains.request.ImplementadorDTORequest;
import com.soaint.fogacoop.commons.domains.response.ImplementadorDTOResponse;

public interface ImplementadorService {

    ImplementadorDTOResponse crearImplementador (final ImplementadorDTORequest implementador);

}
