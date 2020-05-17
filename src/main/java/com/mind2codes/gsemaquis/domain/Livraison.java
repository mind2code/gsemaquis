package com.mind2codes.gsemaquis.domain;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="livraison")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Livraison extends AuditModel {

	@Id
	@GeneratedValue(generator="livraison_id_seq")
	private long id;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "commande_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Commandes commandes;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "livreur_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private User livreur;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "statuts_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Statuts statuts;
	
	@Column(name="userid")
	private long userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Commandes getCommandes() {
		return commandes;
	}

	public void setCommandes(Commandes commandes) {
		this.commandes = commandes;
	}

	public User getLivreur() {
		return livreur;
	}

	public void setLivreur(User livreur) {
		this.livreur = livreur;
	}

	public Statuts getStatuts() {
		return statuts;
	}

	public void setStatuts(Statuts statuts) {
		this.statuts = statuts;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
