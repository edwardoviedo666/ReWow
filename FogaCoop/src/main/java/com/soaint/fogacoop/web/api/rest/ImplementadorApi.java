package com.soaint.fogacoop.web.api.rest;

import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import org.springframework.http.ResponseEntity;

public interface ImplementadorApi {

    ResponseEntity<?> createPersona(final PersonaDTORequest persona);

    ResponseEntity<?> findPersonas();

    ResponseEntity<?> findPersonById(final String id);

}
