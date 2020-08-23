package com.rewow.repository.ClinicalHistory;

import com.rewow.model.entities.ClinicalHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClinicalHistoryRepository extends JpaRepository<ClinicalHistoryEntity, Integer> {
}
