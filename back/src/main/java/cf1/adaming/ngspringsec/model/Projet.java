package cf1.adaming.ngspringsec.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Projet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
private String nom ;
private String description ;
private Long somme ;
private Integer somme0; 

@Column(columnDefinition="TEXT")
private String image;

@ManyToOne(cascade = CascadeType.DETACH, fetch= FetchType.EAGER)
private User user;

public User getUser() {
	return user;
}



public String getImage() {
	return image;
}



public void setImage(String image) {
	this.image = image;
}



public void setUser(User user) {
	this.user = user;
}



@ManyToOne(cascade = CascadeType.DETACH, fetch= FetchType.EAGER)
private Categorie categorie;

@JsonIgnore
@ManyToOne(cascade = CascadeType.DETACH, fetch= FetchType.EAGER)
private UsersProjet up;

@JsonIgnore
@OneToMany
private Set<Paiement> paiement = new HashSet<Paiement>();

public Projet() {}







public Projet(String nom, Long somme, Integer somme0) {
	super();
	this.nom = nom;
	this.somme = somme;
	this.somme0 = somme0;
}



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Long getSomme() {
	return somme;
}

public void setSomme(Long somme) {
	this.somme = somme;
}



public Integer getSomme0() {
	return somme0;
}



public void setSomme0(Integer somme0) {
	this.somme0 = somme0;
}



public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}

public UsersProjet getUp() {
	return up;
}

public void setUp(UsersProjet up) {
	this.up = up;
}



public Set<Paiement> getPaiement() {
	return paiement;
}



public void setPaiement(Set<Paiement> paiement) {
	this.paiement = paiement;
}



}
