package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Commandes;
import com.mind2codes.gsemaquis.requests.CommandeRequest;
import com.mind2codes.gsemaquis.services.CommandeServiceImpl;

@RestController
public class CommandesController {

	@Autowired
	CommandeServiceImpl commandeServiceImpl;
	
	@PostMapping("/commandes")
	public ResponseEntity<Commandes> save(@RequestBody CommandeRequest commande) {
		return ResponseEntity.ok(commandeServiceImpl.saveCommandes(commande));
	}
	
	//@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/commandes/maquis/{maquisId}")
	public ResponseEntity<List<Commandes>> getCommandes(@PathVariable("maquisId") long maquisId) {
		return ResponseEntity.ok(commandeServiceImpl.getCommandesByMaquis(maquisId));
	}
	
	@GetMapping("/commandes/client/{userId}")
	public ResponseEntity<List<Commandes>> getCommandesByClient(@PathVariable("userId") long clientId) {
		return ResponseEntity.ok(commandeServiceImpl.getCommandesByClientsId(clientId));
	}
	
 
}
