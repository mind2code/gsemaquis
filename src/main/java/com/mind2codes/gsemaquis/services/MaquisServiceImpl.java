package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Maquis;
import com.mind2codes.gsemaquis.domain.Organisation;
import com.mind2codes.gsemaquis.domain.Pays;
import com.mind2codes.gsemaquis.repository.MaquisRepository;
import com.mind2codes.gsemaquis.services.interfaces.MaquisService;

@Service
public class MaquisServiceImpl implements MaquisService {

	@Autowired
	MaquisRepository maquisRepository;
	
	@Autowired
	OrganisationServiceImpl organisationService;
	
	@Autowired
	PaysServiceImpl paysService;
	
	@Override
	public List<Maquis> getMaquis() {
		// TODO Auto-generated method stub
		try {
			return maquisRepository.findAll();
		} catch(Exception ex) {
			throw new NullPointerException("Aucun maquis");
		}
		
	}

	@Override
	public Maquis createMaquis(Maquis maquis) {
		// TODO Auto-generated method stub
		try {
			Organisation organisation = organisationService.getOrganisationById(maquis.getOrganisation().getId());
			maquis.setOrganisation(organisation);
			
			Pays pays = paysService.getPaysById(maquis.getPays().getId());
			
			maquis.setPays(pays);
			return maquisRepository.save(maquis);
		} catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public Maquis getMaquisById(long id) {
		// TODO Auto-generated method stub
		return maquisRepository.findById(id).get();
	}

}
