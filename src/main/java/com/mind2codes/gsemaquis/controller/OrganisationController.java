package com.mind2codes.gsemaquis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.domain.Organisation;
import com.mind2codes.gsemaquis.services.OrganisationServiceImpl;

@RestController
public class OrganisationController {

	@Autowired
	OrganisationServiceImpl organisationService;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping("/organisations")
	public ResponseEntity<Organisation> ajouterOrganisation(@RequestBody Organisation request) {
		return ResponseEntity.ok(organisationService.ajouterOrganisation(request));
	}
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/organisations")
	public ResponseEntity<List<Organisation>> getOrganisations() {
		return ResponseEntity.ok(organisationService.getOrganisations());
	}
}
