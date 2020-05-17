package com.mind2codes.gsemaquis.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="statuts")
public class Statuts extends AuditModel {

	@Id
	@GeneratedValue(generator="statuts_id_seq")
	private long id;
	
	@Column(name="libelle")
	private long libelle;
	
	@Column(name="is_delete")
	private boolean isDelete;
	
	@Column(name="user_id")
	private long userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLibelle() {
		return libelle;
	}

	public void setLibelle(long libelle) {
		this.libelle = libelle;
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

	public Statuts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}