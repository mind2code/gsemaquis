package com.mind2codes.gsemaquis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Produits;
import com.mind2codes.gsemaquis.repository.ProduitsRepository;
import com.mind2codes.gsemaquis.services.interfaces.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitsRepository produitRepository;
	
	@Override
	public List<Produits> getProduits() {
		// TODO Auto-generated method stub
		try {
			return produitRepository.findAll();
		} catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public List<Produits> getProduitsByCategoriesId(long id) {
		// TODO Auto-generated method stub
		try {
			return produitRepository.findByCategorieId(id);
		} catch(Exception ex) {
			throw new NullPointerException("Aucune catégorie existante avec l'ID => " + id);
		}
		
	}

	@Override
	public Produits createProduits(Produits produit) {
		// TODO Auto-generated method stub
		try {
			return produitRepository.save(produit);
		} catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Produits getProduitById(long id) {
		// TODO Auto-generated method stub
		try {
			return produitRepository.findById(id).get();
		} catch(Exception ex) {
			throw new NullPointerException("Aucun produit correspondant");
		}
	}

}
