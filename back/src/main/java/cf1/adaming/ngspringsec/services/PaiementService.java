package cf1.adaming.ngspringsec.services;

import java.util.List;


import cf1.adaming.ngspringsec.model.Paiement;

public interface PaiementService {
	public Paiement save(Paiement paiement);
	public Paiement delete (Long id);
	public Paiement findById(Long id);
	public List<Paiement> findAll();
	
}
