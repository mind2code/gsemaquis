package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.PaiementType;

public interface PaiementTypeService {

	List<PaiementType> getPaiementTypes();
	PaiementType createPaiementType(PaiementType paiementType);
}
