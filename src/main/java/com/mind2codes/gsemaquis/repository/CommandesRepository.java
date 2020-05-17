package com.mind2codes.gsemaquis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mind2codes.gsemaquis.domain.Commandes;

public interface CommandesRepository extends JpaRepository<Commandes, Long> {

}
