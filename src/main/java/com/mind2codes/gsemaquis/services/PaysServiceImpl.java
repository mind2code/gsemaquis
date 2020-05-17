package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Pays;
import com.mind2codes.gsemaquis.repository.PaysRepository;
import com.mind2codes.gsemaquis.services.interfaces.PaysService;

@Service
public class PaysServiceImpl implements PaysService {

	@Autowired
	PaysRepository paysRepository;
	
	@Override
	public List<Pays> getPays() {
		// TODO Auto-generated method stub
		return paysRepository.findAll();
	}

	@Override
	public Pays createPays(Pays pays) {
		// TODO Auto-generated method stub
		return paysRepository.save(pays);
	}

	@Override
	public Pays getPaysById(long id) {
		// TODO Auto-generated method stub
		return paysRepository.findById(id).get();
	}

}
