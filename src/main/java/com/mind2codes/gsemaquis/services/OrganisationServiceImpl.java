package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Organisation;
import com.mind2codes.gsemaquis.repository.OrganisationRepository;
import com.mind2codes.gsemaquis.services.interfaces.OrganisationService;

@Service
public class OrganisationServiceImpl implements OrganisationService {

	@Autowired
	OrganisationRepository organisationRepository;
	
	@Override
	public Organisation ajouterOrganisation(Organisation organisation) {
		// TODO Auto-generated method stub
		try {
			return organisationRepository.save(organisation);
		} catch(Exception ex) {
			throw new NullPointerException("Impossible de créer l'organisation");
		}
	}

	@Override
	public List<Organisation> getOrganisations() {
		// TODO Auto-generated method stub
		return organisationRepository.findAll();
	}

	@Override
	public Organisation getOrganisationById(long id) {
		// TODO Auto-generated method stub
		return organisationRepository.findById(id).get();
	}

}
