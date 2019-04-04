package com.gproconsulting.prestation.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer  extends User {


     
     
     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
 	public Set<Reclamation> reclamations;
 	

 	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
 	public Set<Demande> demande;


	public Set<Reclamation> getReclamations() {
		return reclamations;
	}


	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}


	public Set<Demande> getDemande() {
		return demande;
	}


	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}
 	
 	

    
}
