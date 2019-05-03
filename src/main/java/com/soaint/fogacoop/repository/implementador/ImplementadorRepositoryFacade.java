package com.soaint.fogacoop.repository.implementador;

import com.soaint.fogacoop.domain.model.entities.Implementador;

import java.util.List;

public interface ImplementadorRepositoryFacade {

    Implementador createImplementador (final Implementador implementador);

    Implementador updateImplementador (final Implementador implementador) throws Exception;

    Implementador findImplementadorById(final Integer id);

    Implementador removeImplementadorById(final Integer id);

    List<Implementador> findAllImplementadores();



}
