package com.mind2codes.gsemaquis.domain;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="paiements")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Paiements extends AuditModel {

	@Id
	@GeneratedValue(generator="paiements_id_seq")
	private long id;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "commande_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Commandes commande;
	
	@Column(name="montant")
	private double montant;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "paiement_type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private PaiementType paiementType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Commandes getCommande() {
		return commande;
	}

	public void setCommande(Commandes commande) {
		this.commande = commande;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public PaiementType getPaiementType() {
		return paiementType;
	}

	public void setPaiementType(PaiementType paiementType) {
		this.paiementType = paiementType;
	}

	public Paiements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
