package com.mind2codes.gsemaquis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="pays")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pays extends AuditModel {
	
	@Id
	@GeneratedValue(generator="pays_id_seq")
	private long id;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="code_telephonique")
	private String codeTelephonique;
	
	@Column(name="is_delete")
	private boolean isDelete;
	
	@Column(name="userid")
	private long userId;

	public long getId() {
		return id;
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

	public String getCodeTelephonique() {
		return codeTelephonique;
	}

	public void setCodeTelephonique(String codeTelephonique) {
		this.codeTelephonique = codeTelephonique;
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

	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
