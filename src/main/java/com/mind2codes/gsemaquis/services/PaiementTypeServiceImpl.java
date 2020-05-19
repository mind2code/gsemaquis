package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.PaiementType;
import com.mind2codes.gsemaquis.repository.PaiementTypeRepository;
import com.mind2codes.gsemaquis.services.interfaces.PaiementTypeService;

@Service
public class PaiementTypeServiceImpl implements PaiementTypeService {

	@Autowired
	PaiementTypeRepository paiementTypeRepository;
	
	@Override
	public List<PaiementType> getPaiementTypes() {
		// TODO Auto-generated method stub
		return paiementTypeRepository.findAll();
	}

	@Override
	public PaiementType createPaiementType(PaiementType paiementType) {
		// TODO Auto-generated method stub
		return paiementTypeRepository.save(paiementType);
	}

}
