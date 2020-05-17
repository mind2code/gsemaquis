package com.mind2codes.gsemaquis.domain;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@SuppressWarnings("serial")
@Entity
@Table(name="commandes")
public class Commandes extends AuditModel {

	@Id
	@GeneratedValue(generator="commandes_id_seq")
	private long id;
	
	@Column(name="code_commande")
	private String codeCommande;
	
	@Column(name="date_commande")
	private Date dateCommande;
	
	@Column(name="prix_total")
	private double prixTotal;
	
	@Column(name="remise")
	private double remise;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "client_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private User client;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "statuts_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Statuts statuts;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodeCommande() {
		return codeCommande;
	}
	public void setCodeCommande(String codeCommande) {
		this.codeCommande = codeCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public double getRemise() {
		return remise;
	}
	public void setRemise(double remise) {
		this.remise = remise;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	public Statuts getStatus() {
		return statuts;
	}
	public void setStatusId(Statuts status) {
		this.statuts = status;
	}
	public Commandes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
