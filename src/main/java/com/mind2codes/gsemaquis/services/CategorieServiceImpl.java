package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Categories;
import com.mind2codes.gsemaquis.domain.Maquis;
import com.mind2codes.gsemaquis.repository.CategoriesRepository;
import com.mind2codes.gsemaquis.services.interfaces.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	CategoriesRepository categorieRepository;
	
	@Autowired
	MaquisServiceImpl maquisService;

	@Autowired
	PaysServiceImpl paysService;
	
	@Override
	public List<Categories> getCategories() {
		// TODO Auto-generated method stub
		try {
			return categorieRepository.findAll();
		} catch(Exception ex) {
			throw new NullPointerException("Aucune categorie trouvé");
		}
	}

	@Override
	public Categories createCategories(Categories categorie) {
		// TODO Auto-generated method stub
		try {
			Maquis maquis = maquisService.getMaquisById(categorie.getMaquis().getId());
			categorie.setMaquis(maquis);
			return categorieRepository.save(categorie);
		} catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public Categories getCategoriesById(long id) {
		// TODO Auto-generated method stub
		return categorieRepository.findById(id).get();
	}

}
