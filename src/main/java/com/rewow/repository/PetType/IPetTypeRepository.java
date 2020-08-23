package com.rewow.repository.PetType;


import com.rewow.model.entities.PetTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetTypeRepository extends JpaRepository<PetTypeEntity, Integer> {
}
