package cf1.adaming.ngspringsec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class CarteCredit extends Paiement{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String ccnom;
	   private String ccnumero;
	    private String ccexpiration;
	   private String cccvv;
	   
	   
	   public CarteCredit() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCcnom() {
		return ccnom;
	}

	public void setCcnom(String ccnom) {
		this.ccnom = ccnom;
	}

	public String getCcnumero() {
		return ccnumero;
	}

	public void setCcnumero(String ccnumero) {
		this.ccnumero = ccnumero;
	}

	public String getCcexpiration() {
		return ccexpiration;
	}

	public void setCcexpiration(String ccexpiration) {
		this.ccexpiration = ccexpiration;
	}

	public String getCccvv() {
		return cccvv;
	}

	public void setCccvv(String cccvv) {
		this.cccvv = cccvv;
	}

	
	   
   
	
	
}
