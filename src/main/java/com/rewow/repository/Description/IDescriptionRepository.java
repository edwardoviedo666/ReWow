package com.rewow.repository.Description;

import com.rewow.model.entities.DescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDescriptionRepository extends JpaRepository<DescriptionEntity, Integer> {
}
