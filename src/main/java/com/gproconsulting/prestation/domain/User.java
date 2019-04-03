package com.gproconsulting.prestation.domain;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
   
  
    @Column(name = "user_name", length = 50, nullable = true)
    private String userName;

    @Column(name = "user_adress", length = 50, nullable = true)
    private String userAdress;

    @Column(name = "user_email", nullable = true)
    private String userEmail;
    @Column(name="user_tel",nullable=true)
     private String userTel;
    @Column(name="user_image")
    private String userImage;
     @Column(name="login")
     private String login;
     @Column(name="password")
     private String password;
     @Column(name="role")
     private String role;
     
     
     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
     public Set<Demande> demandes ;
     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
     public Set<Reclamation> reclamations ;
     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
     public Set<OffreService> offreservices ;
    public User(Long id, String userName, String userAdress, String userEmail, String userTel, String userImage,
			String login, String password, String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.userAdress = userAdress;
		this.userEmail = userEmail;
		this.userTel = userTel;
		this.userImage = userImage;
		this.login = login;
		this.password = password;
		this.role = role;
	}

	public String getLogin() {
		return login;
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

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



  

    

}
