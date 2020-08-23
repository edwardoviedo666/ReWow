package com.rewow.service.Pet.impl;

import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.repository.Pet.impl.PetRepositoryFacade;
import com.rewow.service.Pet.IPetService;
import javassist.NotFoundException;
import org.omg.CORBA.SystemException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PetServiceImpl implements IPetService {
    private final PetRepositoryFacade petRepository;
    public PetServiceImpl(PetRepositoryFacade petRepository) {
        this.petRepository = petRepository;

    }
    @Override
    public PetDTO createIn(PetDTO inDTO) throws SystemException {

        Optional<PetDTO> in = petRepository.save(inConverter.converterInDTOToInEntity(calculateValues(inDTO, kardex)));

    }
}
