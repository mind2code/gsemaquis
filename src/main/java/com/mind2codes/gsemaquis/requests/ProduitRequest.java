package com.mind2codes.gsemaquis.requests;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ProduitRequest implements Serializable {

	private String libelle;
	
	private String description;
	
	private String imageUrl;
	
	private long categorieId;
	
	private double prix;
	
	private Date dateDebut;
	
	private Date dateFin;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public long getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(long categorieId) {
		this.categorieId = categorieId;
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

	public ProduitRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
