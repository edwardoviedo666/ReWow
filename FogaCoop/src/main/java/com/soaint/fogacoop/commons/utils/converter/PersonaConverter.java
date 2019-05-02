package com.soaint.fogacoop.commons.utils.converter;

import com.soaint.fogacoop.commons.domains.request.PersonaDTORequest;
import com.soaint.fogacoop.domain.model.entities.Persona;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonaConverter {

    public static Persona converterDtoTOPersona(PersonaDTORequest personaDTO) {
        log.info("PersonaConverter. convirtiendo PersonaDTORequest a Persona : ",personaDTO);
        return Persona.builder()
                .idPersona(personaDTO.getIdPersona())
                .nombres(personaDTO.getNombres())
                .apellidos(personaDTO.getApellidos())
                .tipoIdentificacion(personaDTO.getTipoIdentificacion())
                .numeroIdentificacion(personaDTO.getNumeroIdentificacion())
                .build();
    }


}
