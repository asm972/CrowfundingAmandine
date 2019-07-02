package cf1.adaming.ngspringsec.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Paiement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String prenom;
	private Long montant;
    private String credit;
    private String paypal;
    
   
    @ManyToOne(cascade = CascadeType.DETACH, fetch= FetchType.EAGER)
    private Projet projet;
    
    public Paiement() {}

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

	public Long getMontant() {
		return montant;
	}

	public void setMontant(Long montant) {
		this.montant = montant;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getPaypal() {
		return paypal;
	}

	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}

	public Paiement(String nom, String prenom, Long montant, String credit, String paypal) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.montant = montant;
		this.credit = credit;
		this.paypal = paypal;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
    
    
    
    		
    
	
}
