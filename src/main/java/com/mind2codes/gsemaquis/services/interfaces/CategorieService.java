package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Categories;

public interface CategorieService {

	List<Categories> getCategories();
	Categories createCategories(Categories categorie);
	Categories getCategoriesById(long id);
}
