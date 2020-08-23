package com.rewow.repository.Pet.impl;

import com.rewow.model.entities.PetEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class PetRepositoryImpl implements  PetRepositoryFacade{

    @Override
    public Optional<PetEntity> save(PetEntity petEntity) {
        return Optional.empty();
    }
}
