package com.mind2codes.gsemaquis.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="produit_prix")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProduitPrix extends AuditModel {

	@Id
	@GeneratedValue(generator="produit_prix_id_seq")
	private long id;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "produit_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Produits produit;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="date_debut")
	private Date dateDebut;
	
	@Column(name="date_fin", nullable=true)
	private Date dateFin;

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

	public ProduitPrix() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
