package cf1.adaming.ngspringsec.services;

import java.util.List;

import cf1.adaming.ngspringsec.model.Paypal;



public interface PaypalService {
	public Paypal save(Paypal paypal);
	public Paypal delete (Long id);
	public Paypal findById(Long id);
	public List<Paypal> findAll();
}
