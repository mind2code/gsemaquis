package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Categories;
import com.mind2codes.gsemaquis.repository.CategoriesRepository;
import com.mind2codes.gsemaquis.services.interfaces.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	CategoriesRepository categorieRepository;
	
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
			return categorieRepository.save(categorie);
		} catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	public Categories getCategoriesById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
