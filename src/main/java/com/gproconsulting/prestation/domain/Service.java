package com.gproconsulting.prestation.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
		@ManyToOne
	    @JoinColumn(name = "id") 
	    private User user ;
        
		@ManyToOne
	    @JoinColumn(name = "id") 
	    private OffreService offreservice; 
		 @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
	     public Set<Demande> demandes ;
	public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public OffreService getOffreservice() {
			return offreservice;
		}
		public void setOffreservice(OffreService offreservice) {
			this.offreservice = offreservice;
		}
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
	
	

	
}
