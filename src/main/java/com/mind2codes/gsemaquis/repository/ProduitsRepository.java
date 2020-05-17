package com.mind2codes.gsemaquis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.Produits;

@Repository
public interface ProduitsRepository extends JpaRepository<Produits, Long> {
	List<Produits> findByCategorieId(long id);
}
