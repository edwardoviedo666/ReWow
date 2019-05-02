package com.soaint.fogacoop.repository.persona.impl;

import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import com.soaint.fogacoop.commons.utils.converter.PersonaConverter;
import com.soaint.fogacoop.domain.model.entities.Persona;
import com.soaint.fogacoop.repository.persona.IPersonaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Component
@Log4j2
public class PersonaRepositoryImpl implements PersonaRepositoryFacade {

    private final IPersonaRepository repository;

    @Autowired
    public PersonaRepositoryImpl(IPersonaRepository repository) {
        this.repository = repository;
    }

    /**
     * Implementación de la inserción del registro de la persona
     * @param persona Objeto con los valores necesarios para crear el registro
     * @return objeto persona opcional del registro creado
     */
    @Override
    public Optional<Persona> registerPersona(PersonaDTORequest persona) {
        log.info("PersonaRepositoryImpl. creando registro de persona : ",persona);
        return Optional.of(repository.save(PersonaConverter.converterDtoTOPersona(persona)));
    }

    /**
     * Implementacion de consulta de un registro por el identificador de la persona
     * @param id identificar del registro
     * @return retorna un registro segun el id de la consulta
     */
    @Override
    public Optional<Persona> getPersonaById(String id) {
        log.info("PersonaRepositoryImpl. consultando persona por el id : ",id);
        Optional<Persona> persona = repository.findPersonaByIdPersona(id);
        return persona.isPresent() ? persona : Optional.of(new Persona());
    }

    /**
     * Implementación de una consulta de todos los registros de la tabla personas
     * @return colección de registros de personas
     */
    @Override
    public Optional<Collection<Persona>> findPersonas() {
        log.info("PersonaRepositoryImpl. consultando personas. ");
        Collection<Persona> personas = new ArrayList<>(repository.findAll());
        return Optional.of(personas);
    }
}
