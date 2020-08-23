package com.rewow.repository.PetSize;

import com.rewow.model.entities.PetSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetSizeRepository extends JpaRepository<PetSizeEntity, Integer> {
}
