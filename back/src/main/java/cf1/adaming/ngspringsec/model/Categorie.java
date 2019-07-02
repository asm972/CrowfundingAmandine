package cf1.adaming.ngspringsec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	@JsonIgnore
	@OneToMany
	private List<Projet>projet = new ArrayList<Projet>();
	
	public Categorie () {}
	
	

	public Categorie(String nom, List<Projet> projet) {
		super();
		this.nom = nom;
		this.projet = projet;
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

	public List<Projet> getProjet() {
		return projet;
	}

	public void setProjet(List<Projet> projet) {
		this.projet = projet;
	}
	
	
	

}
