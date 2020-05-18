package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Produits;
import com.mind2codes.gsemaquis.requests.ProduitRequest;
import com.mind2codes.gsemaquis.services.ProduitServiceImpl;

@RestController
public class ProduitController {

	@Autowired
	ProduitServiceImpl produitService;
	
	
	@GetMapping("/produits")
	public ResponseEntity<List<Produits>> getProduits() {
		return ResponseEntity.ok(produitService.getProduits());
	}
	
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('GERANT')")
	@PostMapping("/produits")
	public ResponseEntity<Produits> createProduits(@RequestBody ProduitRequest produit) {
		return ResponseEntity.ok(produitService.createProduits(produit));
	}
}
