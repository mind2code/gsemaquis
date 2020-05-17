package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Pays;

public interface PaysService {

	List<Pays> getPays();
	Pays createPays(Pays pays);
	Pays getPaysById(long id);
}
