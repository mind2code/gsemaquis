package com.mind2codes.gsemaquis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mind2codes.gsemaquis.services.ProduitServiceImpl;

@RestController
public class ProduitController {

	@Autowired
	ProduitServiceImpl produitService;
	 
}
