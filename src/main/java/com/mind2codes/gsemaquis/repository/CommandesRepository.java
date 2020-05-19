package com.mind2codes.gsemaquis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.Commandes;

@Repository
public interface CommandesRepository extends JpaRepository<Commandes, Long> {

	List<Commandes> findByMaquisId(long maquisId);
	List<Commandes> findByClientId(long clientId);
	List<Commandes> findByStatutsId(long statutsId);

}
