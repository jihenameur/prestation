package com.gproconsulting.prestation.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_name", length = 50, nullable = false)
	private String userName;

	@Column(name = "user_adress", length = 50, nullable = false)
	private String userAdress;

	@Column(name = "user_email", nullable = true)
	private String userEmail;
	@Column(name = "user_tel", nullable = true)
	private String userTel;

	@Column(name = "user_image")
	private String userImage;
	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<Demande> demandes;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<Reclamation> reclamations;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<OffreService> offreservices;

}
