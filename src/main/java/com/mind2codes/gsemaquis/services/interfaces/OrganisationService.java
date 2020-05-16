package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Organisation;

public interface OrganisationService {

	Organisation ajouterOrganisation(Organisation organisation);
	List<Organisation> getOrganisations();
	Organisation getOrganisationById(long id);
	
}
