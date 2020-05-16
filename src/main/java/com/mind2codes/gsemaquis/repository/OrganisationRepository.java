package com.mind2codes.gsemaquis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mind2codes.gsemaquis.domain.Organisation;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Long> {

}
