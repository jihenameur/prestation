package com.gproconsulting.prestation.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider extends User {
	@Column(name = "formejuridique")
 	private String FormeJuridique;
	@Column(name = "note")
	private Float Note;
	@Column(name = "numcontrat")
    private int NumContrat; 
     
     public String getFormeJuridique() {
		return FormeJuridique;
	}


	public void setFormeJuridique(String formeJuridique) {
		FormeJuridique = formeJuridique;
	}


	public Float getNote() {
		return Note;
	}


	public void setNote(Float note) {
		Note = note;
	}


	public int getNumContrat() {
		return NumContrat;
	}


	public void setNumContrat(int numContrat) {
		NumContrat = numContrat;
	}


	@OneToMany( cascade = CascadeType.ALL)
	public Set<Reclamation> reclamations;
	

	@OneToMany( cascade = CascadeType.ALL)
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
