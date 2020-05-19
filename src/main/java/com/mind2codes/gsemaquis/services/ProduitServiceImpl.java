package com.mind2codes.gsemaquis.services;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.Categories;
import com.mind2codes.gsemaquis.domain.ProduitPrix;
import com.mind2codes.gsemaquis.domain.Produits;
import com.mind2codes.gsemaquis.domain.VwProduits;
import com.mind2codes.gsemaquis.helpers.Utilities;
import com.mind2codes.gsemaquis.repository.ProduitPrixRepository;
import com.mind2codes.gsemaquis.repository.ProduitsRepository;
import com.mind2codes.gsemaquis.repository.VwProduitRepository;
import com.mind2codes.gsemaquis.requests.ProduitRequest;
import com.mind2codes.gsemaquis.services.interfaces.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {

	private static final Logger logger = LogManager.getLogger(AppUserDetailsService.class);

	@Autowired
	ProduitsRepository produitRepository;
	
	@Autowired
	CategorieServiceImpl categorieService;
	
	@Autowired
	ProduitPrixRepository produitPrixRepository;
	
	@Autowired
	VwProduitRepository vwProduitRepository;
	
	@Override
	public List<Produits> getProduits() {
		// TODO Auto-generated method stub
		try {
			return produitRepository.findAll();
		} catch(Exception ex) {
			logger.error(ex.getMessage());
			throw ex;
		}
		
	}

	@Override
	public List<Produits> getProduitsByCategoriesId(long id) {
		// TODO Auto-generated method stub
		try {
			return produitRepository.findByCategorieId(id);
		} catch(Exception ex) {
			logger.error("Aucune catégorie existante avec l'ID => " + id);
			throw new NullPointerException("Aucune catégorie existante avec l'ID => " + id);
		}
		
	}

	@Override
	public Produits createProduits(ProduitRequest request) {
		// TODO Auto-generated method stub
		try {
			Produits produit = new Produits();
			Categories categorie = categorieService.getCategoriesById(request.getCategorieId());
			if(categorie == null) {
				logger.error("Aucune catégorie disponible");
				throw new NullPointerException("Aucune catégorie disponible");
			}
			produit.setCategorie(categorie);
			
			produit.setLibelle(request.getLibelle());
			produit.setDescription(request.getDescription());
			produit.setImageUrl(request.getImageUrl());
			produit.setUserId(1);
			produit.setDelete(false);
			
			ProduitPrix produitPrix = new ProduitPrix();
			
			
			produitPrix.setPrix(request.getPrix());
			produitPrix.setDateDebut(new Date());
			
			Set<ProduitPrix> prod = new HashSet<ProduitPrix>();
			
			produitPrix.setProduit(produit);
			prod.add(produitPrix);
			produit.setProduitPrix(prod);
			
			produitRepository.save(produit);
			return produit;
		} catch(Exception ex) {
			logger.error(ex.getMessage());
			throw ex;
		}
		
	}

	@Override
	public Produits getProduitById(long id) {
		// TODO Auto-generated method stub
		try {
			return produitRepository.findById(id).get();
		} catch(Exception ex) {
			logger.error("Aucun produit correspondant");
			throw new NullPointerException("Aucun produit correspondant");
		}
	}

	@Override
	public List<VwProduits> getProduitsWithPrice() {
		// TODO Auto-generated method stub
		return vwProduitRepository.findAll();
	}

}
