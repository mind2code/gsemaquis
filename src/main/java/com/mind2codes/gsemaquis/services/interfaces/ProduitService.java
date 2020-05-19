package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Produits;
import com.mind2codes.gsemaquis.domain.VwProduits;
import com.mind2codes.gsemaquis.requests.ProduitRequest;

public interface ProduitService {

	List<Produits> getProduits();
	List<Produits> getProduitsByCategoriesId(long id);
	Produits createProduits(ProduitRequest produit);
	Produits getProduitById(long id);
	List<VwProduits> getProduitsWithPrice();
}
