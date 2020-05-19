package com.mind2codes.gsemaquis.services;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind2codes.gsemaquis.domain.CommandeContent;
import com.mind2codes.gsemaquis.domain.Commandes;
import com.mind2codes.gsemaquis.domain.Maquis;
import com.mind2codes.gsemaquis.domain.Produits;
import com.mind2codes.gsemaquis.domain.Statuts;
import com.mind2codes.gsemaquis.domain.User;
import com.mind2codes.gsemaquis.domain.VwProduits;
import com.mind2codes.gsemaquis.helpers.RandomString;
import com.mind2codes.gsemaquis.repository.CommandesRepository;
import com.mind2codes.gsemaquis.requests.CommandeRequest;
import com.mind2codes.gsemaquis.services.interfaces.CommandeService;
import com.mind2codes.gsemaquis.services.interfaces.UserService;

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	CommandesRepository commandeRepository;
	
	@Autowired
	MaquisServiceImpl maquisService;
	
	@Autowired
	StatutsServiceImpl statutService;
	
	@Autowired
	UserServiceImpl userService;
	
	@Autowired
	ProduitServiceImpl produitService;
	
	@Override
	public List<Commandes> getCommandesByMaquis(long maquisId) {
		// TODO Auto-generated method stub
		return commandeRepository.findByMaquisId(maquisId);
	}

	@Override
	public List<Commandes> getCommandesByClientsId(long clientId) {
		// TODO Auto-generated method stub
		return commandeRepository.findByClientId(clientId);
	}

	@Override
	public List<Commandes> getCommandesByStatuts(long statutsId) {
		// TODO Auto-generated method stub
		return commandeRepository.findByStatutsId(statutsId);
	}

	@Override
	public Commandes saveCommandes(CommandeRequest request) {
		// TODO Auto-generated method stub
		try {
			User user = userService.findUserByEmail(request.getCommandes().getClient().getEmail());
			Maquis maquis = maquisService.getMaquisById(request.getCommandes().getMaquis().getId());
			Statuts statuts = statutService.getStatutsById(2);
			
			Commandes commande = new Commandes();
			
			String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
			RandomString codeCommande = new RandomString(8, new SecureRandom(), easy);
			
			commande.setClient(user);
			commande.setCodeCommande(codeCommande.nextString());
			commande.setMaquis(maquis);
			commande.setDateCommande(new Date());
			commande.setPrixTotal(request.getPrixTotal());
			commande.setStatuts(statuts);
			
			Set<CommandeContent> commandeContent = new HashSet();
			
			for(CommandeContent cmd: request.getCommandeContents()) {
				Produits produit = produitService.getProduitById(cmd.getProduit().getId());
				cmd.setCommande(commande);
				cmd.setProduit(produit);
				commandeContent.add(cmd);
			}
			
			commande.setCommandeContent(commandeContent);
			
			
			return commandeRepository.save(commande);
		} catch (Exception ex) {
			throw ex;
		}
		
	}

	@Override
	public Commandes updateCommandes(Commandes commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}

}
