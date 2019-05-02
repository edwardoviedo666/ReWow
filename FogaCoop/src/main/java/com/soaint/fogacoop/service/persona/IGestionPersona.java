package com.soaint.fogacoop.service.persona;

import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import com.soaint.fogacoop.domain.model.entities.Persona;

import java.util.Collection;
import java.util.Optional;

public interface IGestionPersona {

    Optional<Persona> registerPersona(final PersonaDTORequest persona);

    Optional<Collection<Persona>> findPersonas();

    Optional<Persona> getPersonaById(String id);

}
