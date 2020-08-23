package com.rewow.repository.Pet;

import com.rewow.model.entities.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetRepository extends JpaRepository<PetEntity, Integer> {
}
