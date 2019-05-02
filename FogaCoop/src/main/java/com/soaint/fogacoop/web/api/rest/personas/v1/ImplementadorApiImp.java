package com.soaint.fogacoop.web.api.rest.personas.v1;

import com.soaint.fogacoop.commons.constants.api.persona.EndpointPersonaApi;
import com.soaint.fogacoop.commons.domains.request.ImplementadorDTORequest;
import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import com.soaint.fogacoop.commons.domains.response.builder.ResponseBuilder;
import com.soaint.fogacoop.domain.model.entities.Persona;
import com.soaint.fogacoop.service.implementador.ImplementadorService;
import com.soaint.fogacoop.service.persona.IGestionPersona;
import com.soaint.fogacoop.web.api.rest.ImplementadorApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = EndpointPersonaApi.PERSONA_API_V1)
@Log4j2
public class ImplementadorApiImp implements ImplementadorApi {

    private final IGestionPersona gestionPersona;

    private final ImplementadorService implementadorService;

    @Autowired
    public ImplementadorApiImp(IGestionPersona gestionPersona, ImplementadorService implementadorService) {
        this.gestionPersona = gestionPersona;
        this.implementadorService = implementadorService;
    }

    /**
     * Exposición de servicio para crear un registro en la tabla persona
     * @param persona variable de tipo PersonaDTORequest con los valores necesarios para crear el registro
     * @return ResponseEntity. clase generica para responder en todos los servicios
     */
    @PostMapping(EndpointPersonaApi.CREATE_PERSONA)
    public ResponseEntity createPersona(final PersonaDTORequest persona) {
        log.info("ImplementadorApiImp. Ejecutando servicio para crear personas : ", persona);
        Optional<Persona> personaCreated = gestionPersona.registerPersona(persona);
        return
                ResponseBuilder.newBuilder()
                        .withStatus(personaCreated.isPresent() ? HttpStatus.CREATED : HttpStatus.OK)
                        .withResponse(personaCreated.isPresent() ? personaCreated : new Persona())
                        .buildResponse();
    }

    /**
     * Exposición de servicio para consultar todos los registros de la tabla persona
     * @return ResponseEntity. clase generica para responder en todos los servicios
     */
    @GetMapping(EndpointPersonaApi.FIND_PERSONAS)
    public ResponseEntity findPersonas() {
        log.info("ImplementadorApiImp. Ejecutando servicio para buscar personas. ");
        return ResponseBuilder.newBuilder()
                .withStatus(HttpStatus.OK)
                .withResponse(gestionPersona.findPersonas())
                .buildResponse();
    }

    /**
     * Exposición de servicio que consulta registros de personas segun el id de la persona
     * @param id identificador del registro persona que se consultará
     * @return ResponseEntity. clase generica para responder en todos los servicios
     */
    @GetMapping(EndpointPersonaApi.FIND_PERSONAS_BY_ID)
    public ResponseEntity findPersonById(final String id) {
        log.info("ImplementadorApiImp. Ejecutando servicio para buscar personas segun el id : ", id);
        return ResponseBuilder.newBuilder()
                .withStatus(HttpStatus.OK)
                .withResponse(gestionPersona.findPersonas())
                .buildResponse();
    }

    @PostMapping("/implementador")
    public ResponseEntity createImplementador(final ImplementadorDTORequest implementador) {
        log.info("ImplementadorApiImp. Ejecutando servicio para crear implementador: ");
        return ResponseBuilder.newBuilder()
                .withMessage("Implementador Creado.")
                .withStatus(HttpStatus.CREATED)
                .withResponse(implementadorService.crearImplementador(implementador))
                .buildResponse();
    }


}
