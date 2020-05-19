package com.mind2codes.gsemaquis.services.interfaces;

import java.util.List;

import com.mind2codes.gsemaquis.domain.Commandes;
import com.mind2codes.gsemaquis.requests.CommandeRequest;

public interface CommandeService {

	List<Commandes> getCommandesByMaquis(long maquisId);
	List<Commandes> getCommandesByClientsId(long clientId);
	List<Commandes> getCommandesByStatuts(long statutsId);
	Commandes saveCommandes(CommandeRequest commande);
	Commandes updateCommandes(Commandes commande);
}
