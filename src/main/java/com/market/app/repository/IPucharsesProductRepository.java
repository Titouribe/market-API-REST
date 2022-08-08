package com.market.app.repository;

import com.market.app.model.entities.PucharsesProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPucharsesProductRepository extends JpaRepository<PucharsesProduct, UUID> {
}
