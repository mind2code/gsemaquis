package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Pays;
import com.mind2codes.gsemaquis.services.PaysServiceImpl;

@RestController
public class PaysController {

	@Autowired
	PaysServiceImpl paysService;
	
	@GetMapping("/pays")
	public ResponseEntity<List<Pays>> getPays() {
		
		return ResponseEntity.ok(paysService.getPays());
		
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping("/pays")
	public ResponseEntity<Pays> createPays(@RequestBody Pays pays) {
		
		return ResponseEntity.ok(paysService.createPays(pays));
		
	}
	
	@GetMapping("/pays/{paysId}")
	public ResponseEntity<Pays> getPaysById(@PathVariable("paysId") long paysId) {
		
		return ResponseEntity.ok(paysService.getPaysById(paysId));
		
	}
}
