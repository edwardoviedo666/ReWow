package com.soaint.fogacoop.service.persona.impl;

import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import com.soaint.fogacoop.domain.model.entities.Persona;
import com.soaint.fogacoop.repository.persona.impl.PersonaRepositoryFacade;
import com.soaint.fogacoop.service.persona.IGestionPersona;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@Log4j2
public class GestionPersonaImpl implements IGestionPersona {

    private final PersonaRepositoryFacade repository;

    @Autowired
    public GestionPersonaImpl(PersonaRepositoryFacade repository) {
        this.repository = repository;
    }

    /**
     * Creando registro para la tabla persona
     * @param persona objeto con los datos necesarios para crear el registro
     * @return Objeto opcional con la informacion de la persona creada
     */
    @Override
    public Optional<Persona> registerPersona(PersonaDTORequest persona) {
        log.info("GestionPersonaImpl. creando registro de persona : ", persona);
        return repository.registerPersona(persona);
    }

    /**
     * Consultando lista de personas
     * @return Lista opcional de personas consultadas
     */
    @Override
    public Optional<Collection<Persona>> findPersonas() {
        log.info("GestionPersonaImpl. buscando personas. ");
        return repository.findPersonas();
    }

    /**
     * Consultando registro de la persona por el identificador
     * @param id identificador del registro a consultar
     * @return objeto opcional del registro consultado
     */
    @Override
    public Optional<Persona> getPersonaById(String id) {
        log.info("GestionPersonaImpl. buscando personas segun el id : ", id);
        return repository.getPersonaById(id);
    }
}
