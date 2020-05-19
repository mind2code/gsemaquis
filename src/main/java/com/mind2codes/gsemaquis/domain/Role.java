package com.mind2codes.gsemaquis.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="app_role")
public class Role {

	//private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(generator = "app_role_id_seq")
    private long id;

    @Column(name="role_name")
    private String roleName;

    @Column(name="description")
    private String description;
    
    @JsonIgnore
    @ManyToMany(
            cascade = {
                CascadeType.PERSIST
            },
            mappedBy = "roles")
    private Set<User> user = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	/**
	 * @param id
	 * @param roleName
	 * @param description
	 * @param users
	 */
	public Role(long id, String roleName, String description) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.description = description;
	}

	/**
	 * 
	 */
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
