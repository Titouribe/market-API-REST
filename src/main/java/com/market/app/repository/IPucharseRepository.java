package com.market.app.repository;

import com.market.app.model.entities.Pucharse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPucharseRepository extends JpaRepository<Pucharse, UUID> {
}
