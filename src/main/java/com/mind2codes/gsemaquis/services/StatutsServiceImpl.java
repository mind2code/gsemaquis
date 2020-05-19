package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mind2codes.gsemaquis.domain.Statuts;
import com.mind2codes.gsemaquis.repository.StatutsRepository;
import com.mind2codes.gsemaquis.services.interfaces.StatutsService;

@Service
public class StatutsServiceImpl implements StatutsService {

	@Autowired
	StatutsRepository statutsRepository;
	
	@Override
	public List<Statuts> getStatuts() {
		// TODO Auto-generated method stub
		return statutsRepository.findAll();
	}

	@Override
	@Transactional
	public Statuts createStatuts(Statuts statuts) {
		// TODO Auto-generated method stub
		return statutsRepository.save(statuts);
	}

	@Override
	public Statuts getStatutsById(long id) {
		// TODO Auto-generated method stub
		return statutsRepository.findById(id).get();
	}

}
