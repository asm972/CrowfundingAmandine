package cf1.adaming.ngspringsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cf1.adaming.ngspringsec.model.Paypal;
import cf1.adaming.ngspringsec.services.PaypalService;



@RestController
@RequestMapping(value="/api/paypal")
public class PaypalControllerApi {
	@Autowired
	PaypalService pps;
	
	@GetMapping(value="/{id}")
	public Paypal getById(@PathVariable("id")Long id) {
		Paypal paypal = pps.findById(id);
		return paypal;
	}
	
	@GetMapping(value="")
	public List<Paypal>findAll(){
		return pps.findAll();
	}

	@PostMapping(value="")
	public Paypal save(@RequestBody Paypal paypal) {
		return pps.save(paypal);
	}
	
	@GetMapping(value="/deleted/{id}")
	public Paypal delete(@PathVariable("id")Long id) {
		return pps.delete(id);
	}
}
