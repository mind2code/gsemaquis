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

@SuppressWarnings("serial")
@Entity
@Table(name="produit_prix")
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
	
	@Column(name="date_fin")
	private Date dateFin;
}
