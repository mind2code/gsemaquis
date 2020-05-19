package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;

import com.mind2codes.gsemaquis.domain.Maquis;
import com.mind2codes.gsemaquis.domain.VwMaquis;

public interface MaquisService {

	List<Maquis> getMaquis();
	
	Maquis createMaquis(Maquis maquis);
	Maquis getMaquisById(long id);
	List<VwMaquis> getVwMaquis();

}
