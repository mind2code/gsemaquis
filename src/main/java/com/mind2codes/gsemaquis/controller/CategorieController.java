package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Categories;
import com.mind2codes.gsemaquis.services.CategorieServiceImpl;

@RestController
public class CategorieController {

	@Autowired
	CategorieServiceImpl categorieService;
	
	@GetMapping("/categories")
	public ResponseEntity<List<Categories>> getCategories() {
		return ResponseEntity.ok(categorieService.getCategories());
	}
	
	@PreAuthorize("hasAuthority('ADMIN') or hasAuthority('GERANT')")
	@PostMapping("/categories")
	public ResponseEntity<Categories> createCategorie(@RequestBody Categories categorie) {
		return ResponseEntity.ok(categorieService.createCategories(categorie));
	}
	
	
}
