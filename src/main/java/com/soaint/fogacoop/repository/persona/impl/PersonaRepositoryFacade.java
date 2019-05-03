package com.soaint.fogacoop.repository.persona.impl;

import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import com.soaint.fogacoop.domain.model.entities.Persona;

import java.util.Collection;
import java.util.Optional;

public interface PersonaRepositoryFacade {

    Optional<Persona> registerPersona(final PersonaDTORequest persona);

    Optional<Collection<Persona>> findPersonas();

    Optional<Persona> getPersonaById(final String id);

}
