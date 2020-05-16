package com.mind2codes.gsemaquis.domain;

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
@Table(name="maquis")
public class Maquis extends AuditModel {

	@Id
	@GeneratedValue(generator="maquis_id_seq")
	private long id;
	
	@Column(name="raison_sociale")
	private String raisonSociale;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="siteweb")
	private String siteWeb;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "organisation_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Organisation organisation;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "pays_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Pays pays;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Maquis() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
