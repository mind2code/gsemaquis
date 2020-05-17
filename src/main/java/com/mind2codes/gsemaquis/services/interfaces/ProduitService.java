package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Produits;

public interface ProduitService {

	List<Produits> getProduits();
	List<Produits> getProduitsByCategoriesId(long id);
	Produits createProduits(Produits produit);
	Produits getProduitById(long id);
}
