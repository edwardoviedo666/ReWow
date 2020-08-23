package com.rewow.repository.Pet.impl;

import com.rewow.model.entities.PetEntity;

import java.util.Optional;

public interface PetRepositoryFacade {
    Optional<PetEntity> save(PetEntity petEntity);
}
