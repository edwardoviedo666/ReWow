package com.soaint.fogacoop.service.implementador.impl;

import com.soaint.fogacoop.commons.domains.request.ImplementadorDTORequest;
import com.soaint.fogacoop.commons.domains.response.ImplementadorDTOResponse;
import com.soaint.fogacoop.domain.model.entities.Implementador;
import com.soaint.fogacoop.repository.implementador.ImplementadorRepositoryFacade;
import com.soaint.fogacoop.service.implementador.ImplementadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementadorServiceImpl implements ImplementadorService {

    private final ImplementadorRepositoryFacade repository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    public ImplementadorServiceImpl(ImplementadorRepositoryFacade repository) {
        this.repository = repository;
    }

    @Override
    public ImplementadorDTOResponse crearImplementador(ImplementadorDTORequest implementador) {
        return mapper.map(repository.createImplementador(
                mapper.map(implementador, Implementador.class)), ImplementadorDTOResponse.class);
    }
}
