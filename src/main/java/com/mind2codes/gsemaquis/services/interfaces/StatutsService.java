package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Statuts;

public interface StatutsService {

	List<Statuts> getStatuts();
	Statuts createStatuts(Statuts statuts);
	Statuts getStatutsById(long id);
}
