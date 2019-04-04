package com.gproconsulting.prestation.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider extends User {



	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<Reclamation> reclamations;
	

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<OffreService> offreservices;


	public Set<Reclamation> getReclamations() {
		return reclamations;
	}


	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}


	public Set<OffreService> getOffreservices() {
		return offreservices;
	}


	public void setOffreservices(Set<OffreService> offreservices) {
		this.offreservices = offreservices;
	}
	
	
	

}
