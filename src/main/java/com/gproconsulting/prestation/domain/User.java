package com.gproconsulting.prestation.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_name", length = 50, nullable = false)
	private String userName;

	@Column(name = "user_adress", length = 50, nullable = false)
	private String userAdress;

	@Column(name = "user_email", nullable = false)
	private String userEmail;
	
	@Column(name = "user_tel1", nullable = false)
	private String userTel1;
	
	@Column(name = "user_tel2", nullable = false)
	private String userTel2;
	
	@Column(name = "user_fax", nullable = true)
	private String userFax;
	
	@Column(name = "user_avatar")
	private String userAvatar;
	
	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;
	
	@Column(name = "user_etat")
	private boolean userEtat;
	

 	@OneToMany( cascade = CascadeType.ALL)
 	public Set<Demande> demande;

	@OneToMany( cascade = CascadeType.ALL)
	public Set<OffreService> offreservices;
	
	@OneToMany( cascade = CascadeType.ALL)
	public Set<Service> services;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAdress() {
		return userAdress;
	}

	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTel1() {
		return userTel1;
	}

	public void setUserTel1(String userTel1) {
		this.userTel1 = userTel1;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getLogin() {
		return login;
	}

	public String getUserTel2() {
		return userTel2;
	}

	public void setUserTel2(String userTel2) {
		this.userTel2 = userTel2;
	}

	public String getUserFax() {
		return userFax;
	}

	public void setUserFax(String userFax) {
		this.userFax = userFax;
	}

	

	public boolean isUserEtat() {
		return userEtat;
	}

	public void setUserEtat(boolean userEtat) {
		this.userEtat = userEtat;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Demande> getDemande() {
		return demande;
	}

	public void setDemande(Set<Demande> demande) {
		this.demande = demande;
	}

	public Set<OffreService> getOffreservices() {
		return offreservices;
	}

	public void setOffreservices(Set<OffreService> offreservices) {
		this.offreservices = offreservices;
	}

	public Set<Service> getServices() {
		return services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

}
