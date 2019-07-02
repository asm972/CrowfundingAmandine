package cf1.adaming.ngspringsec.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf1.adaming.ngspringsec.model.CarteCredit;
import cf1.adaming.ngspringsec.repository.CarteCreditRepository;
import cf1.adaming.ngspringsec.services.CarteCreditService;

@Service
public class CarteCreditServImpl implements CarteCreditService {

	@Autowired
	private CarteCreditRepository ccr;
	
	@Override
	public CarteCredit save(CarteCredit carte) {
		
		return ccr.save(carte);
	}

	@Override
	public CarteCredit delete(Long id) {
		CarteCredit c = findById(id);
		ccr.deleteById(id);
		return c;
	}

	@Override
	public CarteCredit findById(Long id) {
		
		return ccr.findById(id).get();
	}

	@Override
	public List<CarteCredit> findAll() {
		
		return ccr.findAll();
	}

}
