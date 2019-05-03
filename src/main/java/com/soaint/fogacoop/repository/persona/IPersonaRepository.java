package com.soaint.fogacoop.repository.persona;

import com.soaint.fogacoop.domain.model.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Clase que extiende de JpaRepository en la cual se pueden implementar consultas especializadas segun lo requiera el negocio
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, String> {

    @Query("select p from Persona p where p.idPersona = :id")
    Optional<Persona> findPersonaByIdPersona(@Param("id") final String id);


}
