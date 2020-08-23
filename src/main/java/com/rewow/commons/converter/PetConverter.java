package com.rewow.commons.converter;

import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.model.entities.PetEntity;

import java.sql.Timestamp;
import java.util.Date;

public class PetConverter {
    public PetEntity converterPetDTOtoInEntity(PetDTO petDTO) {
        return PetEntity.builder()
                .idPet(petDTO.getIdPet())
                .ownerName(petDTO.getOwnerName())
                .petName(petDTO.getPetName())
                .age(petDTO.getAge())
                .build();
    }
    public PetDTO converterPetDTOtoInDTO(PetEntity petEntity) {
        return PetDTO.builder()
               .PetId(petEntity.getIdPet())
                .ownerName(petEntity.getOwnerName())
                .petName(petEntity.getPetName())
                .age(petEntity.getAge())
                .build();
    }
}
