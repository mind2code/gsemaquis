package com.mind2codes.gsemaquis.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="paiement_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PaiementType extends AuditModel {
	
	@Id
	@GeneratedValue(generator="paiement_type_id_seq")
	private long id;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="is_delete")
	private boolean is_delete;
	
	@Column(name="user_id")
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

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public PaiementType() {
		super();
		// TODO Auto-generated constructor stub
	}

}
