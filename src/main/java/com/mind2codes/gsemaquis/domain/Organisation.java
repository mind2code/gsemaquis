package com.mind2codes.gsemaquis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="organisation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organisation {

	@Id
	@GeneratedValue(generator="organisation_id_seq")
	private long id;
	
	@Column(name="raison_sociale")
	private String raisonSociale;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="adresse_geographique")
	private String adresseGeographique;
	
	@Column(name="siteweb")
	private String siteWeb;

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

	public String getAdresseGeographique() {
		return adresseGeographique;
	}

	public void setAdresseGeographique(String adresseGeographique) {
		this.adresseGeographique = adresseGeographique;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
