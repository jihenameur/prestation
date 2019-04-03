package com.gproconsulting.prestation.domain;

import java.util.Collection;
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

@Entity
@Table(name = "offre_service")
public class OffreService {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "service_name", length = 50, nullable = true)
    private String ServiceName;
	@Column(name = "text", length = 250, nullable = true)
    private String text;
	public Set<Service> getServices() {
		return Services;
	}
	public void setServices(Set<Service> services) {
		Services = services;
	}
	@ManyToOne
    @JoinColumn(name = "id") 
	private User user;
	 @OneToMany(mappedBy = "offre", cascade = CascadeType.ALL)
     public Set<Service> Services ;
	public OffreService(Long id, String serviceName, String text) {
		super();
		this.id = id;
		ServiceName = serviceName;
		this.text = text;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceName() {
		return ServiceName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
