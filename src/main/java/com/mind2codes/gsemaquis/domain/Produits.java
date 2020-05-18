package com.mind2codes.gsemaquis.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="produits")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produits extends AuditModel {

	@Id
	@GeneratedValue(generator="produits_id_seq")
	private long id;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "categorie_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Categories categorie;
	
	@Column(name="is_delete")
	private boolean isDelete;
	
	@Column(name="userid")
	private long userId;
	
	@OneToMany(mappedBy="produit", cascade=CascadeType.ALL)
    private Set<ProduitPrix> produitPrix;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public Set<ProduitPrix> getProduitPrix() {
		return produitPrix;
	}

	public void setProduitPrix(Set<ProduitPrix> produitPrix) {
		this.produitPrix = produitPrix;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Categories getCategorie() {
		return categorie;
	}

	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
