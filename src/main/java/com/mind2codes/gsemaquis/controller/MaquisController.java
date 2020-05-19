package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Maquis;
import com.mind2codes.gsemaquis.domain.VwMaquis;
import com.mind2codes.gsemaquis.services.MaquisServiceImpl;

@RestController
public class MaquisController {
	
	@Autowired
	MaquisServiceImpl maquisService;
	
	@GetMapping("/maquis")
	public ResponseEntity<List<Maquis>> getMaquis() {
		return ResponseEntity.ok(maquisService.getMaquis());
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping("/maquis")
	public ResponseEntity<Maquis> createMaquis(@RequestBody Maquis maquis) {
		return ResponseEntity.ok(maquisService.createMaquis(maquis));
	}
	
	@GetMapping("/allMaquis")
	public ResponseEntity<List<VwMaquis>> getVwMaquis() {
		return ResponseEntity.ok(maquisService.getVwMaquis());
	}

}
