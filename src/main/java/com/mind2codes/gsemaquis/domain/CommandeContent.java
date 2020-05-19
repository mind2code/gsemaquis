package com.mind2codes.gsemaquis.domain;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="commande_content")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CommandeContent extends AuditModel {

	@Id
	@GeneratedValue(generator="commande_content_id_sequ")
	private long id;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "produit_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Produits produit;

	@JsonIgnore
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "commande_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Commandes commande;
	
	public Commandes getCommande() {
		return commande;
	}

	public void setCommande(Commandes commande) {
		this.commande = commande;
	}

	@Column(name="prix_produit")
	private double prixProduit;
	
	@Column(name="quantite")
	private long quantite;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Produits getProduit() {
		return produit;
	}

	public void setProduit(Produits produit) {
		this.produit = produit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(double prixProduit) {
		this.prixProduit = prixProduit;
	}

	public long getQuantite() {
		return quantite;
	}

	public void setQuantite(long quantite) {
		this.quantite = quantite;
	}

	public CommandeContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
