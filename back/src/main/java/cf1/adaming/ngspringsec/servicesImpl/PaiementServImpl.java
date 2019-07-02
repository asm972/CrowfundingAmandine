package cf1.adaming.ngspringsec.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf1.adaming.ngspringsec.model.Paiement;
import cf1.adaming.ngspringsec.repository.PaiementRepository;
import cf1.adaming.ngspringsec.services.PaiementService;

@Service
public class PaiementServImpl implements PaiementService {

	@Autowired
	private PaiementRepository pr;
	@Override
	public Paiement save(Paiement paiement) {
	
		return pr.save(paiement);
	}

	@Override
	public Paiement delete(Long id) {
		Paiement p = findById(id);
		pr.deleteById(id);
		return p;
	}

	@Override
	public Paiement findById(Long id) {
		
		return pr.findById(id).get();
	}

	@Override
	public List<Paiement> findAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
