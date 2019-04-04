package com.gproconsulting.prestation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.soap.Text;

@Entity
@Table(name = "service")
public class Service {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "service_titre", length = 50, nullable = false)
	private String servicetitre;
	@Column(name = "discription", length = 50, nullable = true)
	private Text discription;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Demande demande;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private OffreService offre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Domaine domaine;

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

	public Demande getDemande() {
		return demande;
	}

	public void setDemande(Demande demande) {
		this.demande = demande;
	}

	public OffreService getOffre() {
		return offre;
	}

	public void setOffre(OffreService offre) {
		this.offre = offre;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	
	
}
