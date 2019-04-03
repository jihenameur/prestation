package com.gproconsulting.prestation.domain;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.soap.Text;

@Entity
@Table(name = "service")
public class Service {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	 @Column(name = "service_titre", length = 50, nullable = false)
	    private String servicetitre;
	 @Column(name = "discription", length = 50, nullable = true)
	    private Text discription;
		
   // thabti mel ktiba dima
    @OneToMany(mappedBy="demande")
    private Set<Demande>demandes;
    private OffreService offreservice;
	public Service(Long id, String servicetitre, Text discription) {
		super();
		this.id = id;
		this.servicetitre = servicetitre;
		this.discription = discription;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServicetitre() {
		return servicetitre;
	}
	public void setServicetitre(String servicetitre) {
		this.servicetitre = servicetitre;
	}
	public Text getDiscription() {
		return discription;
	}
	public void setDiscription(Text discription) {
		this.discription = discription;
	}
	
	
	public OffreService getOffreservice() {
		return offreservice;
	}
	public void setOffreservice(OffreService offreservice) {
		this.offreservice = offreservice;
	}
	
}
