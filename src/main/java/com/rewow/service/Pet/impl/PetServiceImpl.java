package com.rewow.service.Pet.impl;

import com.rewow.commons.converter.PetConverter;
import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.commons.exceptions.SystemException;
import com.rewow.model.entities.PetEntity;
import com.rewow.repository.Pet.impl.PetRepositoryFacade;
import com.rewow.service.Pet.IPetService;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetServiceImpl implements IPetService {
    private final PetRepositoryFacade petRepository;
    private final PetConverter petConverter;
    public PetServiceImpl(PetRepositoryFacade petRepository, PetConverter petConverter) {
        this.petRepository = petRepository;
        this.petConverter = petConverter;

    }
    @Override
    public PetDTO createPet(PetDTO petDTO) throws SystemException {

        Optional<PetEntity> optPetDTO = petRepository.save(petConverter.converterPetDTOtoInEntity(petDTO));
        if (optPetDTO.isPresent()) {
            return petConverter.converterPetDTOtoInDTO(optPetDTO.get());
        } else {
            throw new SystemException("Not possible create In");
        }
    }
}
