package com.rewow.repository.MedicalService;

import com.rewow.model.entities.MedicalServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicalServiceRepository extends JpaRepository<MedicalServiceEntity, Integer> {
}
