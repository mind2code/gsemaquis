package com.mind2codes.gsemaquis.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="vw_maquis")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VwMaquis {

	@Id
	@Column(name="maquis_id")
	private long maquisId;
	
	@Column(name="raison_sociale")
	private String raisonSociale;
	
	@Column(name="siteweb")
	private String siteweb;
	
	@Column(name="adresse")
	private String adresseMaquis;
	
	@Column(name="telephone")
	private String telephoneMaquis;
	
	@Column(name="description")
	private String description;
	
	@Column(name="pays_id")
	private long paysId;
	
	@Column(name="pays")
	private String pays;

	public long getMaquisId() {
		return maquisId;
	}

	public void setMaquisId(long maquisId) {
		this.maquisId = maquisId;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getSiteweb() {
		return siteweb;
	}

	public void setSiteweb(String siteweb) {
		this.siteweb = siteweb;
	}

	public String getAdresseMaquis() {
		return adresseMaquis;
	}

	public void setAdresseMaquis(String adresseMaquis) {
		this.adresseMaquis = adresseMaquis;
	}

	public String getTelephoneMaquis() {
		return telephoneMaquis;
	}

	public void setTelephoneMaquis(String telephoneMaquis) {
		this.telephoneMaquis = telephoneMaquis;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPaysId() {
		return paysId;
	}

	public void setPaysId(long paysId) {
		this.paysId = paysId;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public VwMaquis() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
