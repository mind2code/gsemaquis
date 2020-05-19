package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Statuts;
import com.mind2codes.gsemaquis.services.StatutsServiceImpl;

@RestController
public class StatutsController {

	@Autowired
	StatutsServiceImpl statutsService;
	
	@GetMapping("/statuts")
	public ResponseEntity<List<Statuts>> getStatuts() {
		return ResponseEntity.ok(statutsService.getStatuts());
	}
	
	@PostMapping("/statuts")
	public ResponseEntity<Statuts> createStatuts(@RequestBody Statuts statuts) {
		return ResponseEntity.ok(statutsService.createStatuts(statuts));
	}
}
