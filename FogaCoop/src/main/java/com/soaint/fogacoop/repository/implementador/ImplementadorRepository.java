package com.soaint.fogacoop.repository.implementador;

import com.soaint.fogacoop.domain.model.entities.Implementador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImplementadorRepository extends JpaRepository<Implementador, Integer> {
}
