package com.mind2codes.gsemaquis.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"dateCreation", "dateModification"},
        allowGetters = true
)
public abstract class AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5504773032790071926L;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_creation", nullable = false, updatable = false)
    @CreatedDate
    private Date DateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_modification", nullable = false)
    @LastModifiedDate
    private Date DateModification;

    @JsonIgnore
	public Date getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}

	@JsonIgnore
	public Date getDateModification() {
		return DateModification;
	}

	public void setDateModification(Date dateModification) {
		DateModification = dateModification;
	}
}
