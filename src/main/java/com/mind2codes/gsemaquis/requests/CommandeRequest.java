package com.mind2codes.gsemaquis.requests;

import java.io.Serializable;
import java.util.List;

import com.mind2codes.gsemaquis.domain.CommandeContent;
import com.mind2codes.gsemaquis.domain.Commandes;

@SuppressWarnings("serial")
public class CommandeRequest implements Serializable {

	private Commandes commandes;
	
	private List<CommandeContent> commandeContents;
	
	private double prixTotal;
	
	private double remise;
	
	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Commandes getCommandes() {
		return commandes;
	}
	
	public void setCommandes(Commandes commandes) {
		this.commandes = commandes;
	}

	public List<CommandeContent> getCommandeContents() {
		return commandeContents;
	}

	public void setCommandeContents(List<CommandeContent> commandeContents) {
		this.commandeContents = commandeContents;
	}
	
}
