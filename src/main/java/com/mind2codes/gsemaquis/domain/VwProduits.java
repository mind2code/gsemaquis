package com.mind2codes.gsemaquis.domain;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="vw_produits")
public class VwProduits {

	@Id
	@Column(name="produitid")
	private long produitId;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="prix")
	private double prix;
	
	@JsonIgnore
	@Column(name="date_debut")
	private Date dateDebut;
	
	@JsonIgnore
	@Column(name="date_fin")
	private Date dateFin;
	
	@Column(name="categorieid")
	private long categorieId;
	
	@Column(name="categorie")
	private String categorie;

	public long getProduitId() {
		return produitId;
	}

	public void setProduitId(long produitId) {
		this.produitId = produitId;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public long getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(long categorieId) {
		this.categorieId = categorieId;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public VwProduits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
