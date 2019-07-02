package cf1.adaming.ngspringsec.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class UsersProjet extends User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
    private String prenom;
    private String adresse;
    
    @OneToMany
	private Set<Projet>projet = new HashSet<Projet>();
	
    public UsersProjet() {}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	

	public Set<Projet> getProjet() {
		return projet;
	}

	public void setProjet(Set<Projet> projet) {
		this.projet = projet;
	}

	public UsersProjet(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	
	}
    
    
}
