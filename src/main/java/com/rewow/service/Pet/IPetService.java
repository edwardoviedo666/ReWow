package com.rewow.service.Pet;

import com.rewow.commons.domains.generic.PetDTO;
import javassist.NotFoundException;
import org.omg.CORBA.SystemException;


public interface IPetService {
    PetDTO createPet(PetDTO petDTO) throws SystemException, NotFoundException, com.rewow.commons.exceptions.SystemException;
}
