package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Maquis;
import com.mind2codes.gsemaquis.domain.VwMaquis;

public interface MaquisService {

	List<Maquis> getMaquis();
	Maquis createMaquis(Maquis maquis);
	Maquis getMaquisById(long id);
	List<VwMaquis> getVwMaquis();

}
