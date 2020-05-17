package com.mind2codes.gsemaquis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.ProduitPrix;

@Repository
public interface ProduitPrixRepository extends JpaRepository<ProduitPrix, Long> {

}
