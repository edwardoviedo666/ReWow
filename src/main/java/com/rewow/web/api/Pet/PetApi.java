package com.rewow.web.api.Pet;

import com.rewow.commons.constants.api.EndpointApi;
import com.rewow.commons.constants.api.Pet.IEndpointPet;
import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.commons.domains.response.builder.ResponseBuilder;
import com.rewow.enums.TransactionState;
import com.rewow.service.Pet.IPetService;
import javassist.NotFoundException;
import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = EndpointApi.BASE_PATH)
@CrossOrigin(origins = "*")
public class PetApi {
    private final IPetService petService;
    @Autowired
    public PetApi(IPetService petService){ this.petService = petService;}
    @ResponseBody
    @PostMapping (IEndpointPet.PET)
    public ResponseEntity <?> createPet(@RequestBody PetDTO petDTO) throws SystemException, NotFoundException{
        PetDTO petResponse = petService.createPet(petDTO);
        return ResponseBuilder.newBuilder()
                .withResponse(petResponse)
                .withPath(IEndpointPet.PET)
                .withMessage("successfully created")
                .withStatus(HttpStatus.CREATED)
                .withTransactionState(TransactionState.OK)
                .buildResponse();
    }
}
