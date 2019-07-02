package cf1.adaming.ngspringsec.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf1.adaming.ngspringsec.model.Paypal;
import cf1.adaming.ngspringsec.repository.PaypalRepository;
import cf1.adaming.ngspringsec.services.PaypalService;

@Service
public class PaypalServImpl implements PaypalService{

	@Autowired
	private PaypalRepository pr;

	@Override
	public Paypal save(Paypal paypal) {
	
		return pr.save(paypal);
	}

	@Override
	public Paypal delete(Long id) {
		Paypal pay = findById(id);
				pr.deleteById(id);
		return pay;
	}

	@Override
	public Paypal findById(Long id) {
		
		return pr.findById(id).get();
	}

	@Override
	public List<Paypal> findAll() {
		
		return pr.findAll();
	}
	
}