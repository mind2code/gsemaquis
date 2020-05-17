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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Table(name="categories")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Categories extends AuditModel {

	@Id
	@GeneratedValue(generator="categories_id_seq")
	private long id;
	
	@Column(name="libelle")
	private String libelle;
	
	@ManyToOne(fetch= FetchType.LAZY, optional = false)
	@JoinColumn(name = "maquis_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Maquis maquis;
	
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

	public Maquis getMaquis() {
		return maquis;
	}

	public void setMaquis(Maquis maquis) {
		this.maquis = maquis;
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

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
