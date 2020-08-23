package com.rewow.commons.converter;

import com.rewow.commons.domains.generic.PetDTO;
import com.rewow.model.entities.PetEntity;

import java.sql.Timestamp;
import java.util.Date;

public class PetConverter {
    public PetEntity converterInDTOToInEntity(PetDTO petDTO) {
        return PetEntity.builder()
                .build();
    }

    public InEntity converterKardexToIn(KardexEntity kardexEntity) {
        return InEntity.builder()
                .quantity(kardexEntity.getQuantity())
                .unitValue(kardexEntity.getUnitCost())
                .totalValue(kardexEntity.getTotalCost())
                .kUnitValue(kardexEntity.getUnitCost())
                .kTotalValue(kardexEntity.getTotalCost())
                .kQuantity(kardexEntity.getQuantity())
                .kardexId(kardexEntity.getIdKardex())
                .observation("Creacion Prod")
                .type(0)
                .date(new Timestamp(new Date().getTime()))
                .lastModified(new Timestamp(new Date().getTime()))
                .build();
    }

    public InDTO converterInEntityToInDTO(InEntity inEntity) {
        return InDTO.builder()
                .inId(inEntity.getInId())
                .quantity(inEntity.getQuantity())
                .type(inEntity.getType())
                .lastModified(inEntity.getLastModified())
                .kUnitValue(inEntity.getKUnitValue())
                .kQuantity(inEntity.getKQuantity())
                .kTotalValue(inEntity.getKTotalValue())
                .observation(inEntity.getObservation())
                .unitValue(inEntity.getUnitValue())
                .totalValue(inEntity.getTotalValue())
                .date(inEntity.getDate())
                .kardexId(inEntity.getKardexId())
                .build();
    }
}
