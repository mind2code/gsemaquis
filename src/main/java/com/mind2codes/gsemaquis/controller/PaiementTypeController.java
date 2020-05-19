package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.PaiementType;
import com.mind2codes.gsemaquis.services.PaiementTypeServiceImpl;

@RestController
public class PaiementTypeController {

	@Autowired
	PaiementTypeServiceImpl paiementTypeService;
	
	@GetMapping("/paiementType")
	public ResponseEntity<List<PaiementType>> getPaiementTypes() {
		return ResponseEntity.ok(paiementTypeService.getPaiementTypes());
	}
	
	@PostMapping("/paiementType")
	public ResponseEntity<PaiementType> createPaiementTypes(@RequestBody PaiementType paiementType) {
		return ResponseEntity.ok(paiementTypeService.createPaiementType(paiementType));
	}
}
