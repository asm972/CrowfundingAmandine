package cf1.adaming.ngspringsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cf1.adaming.ngspringsec.model.Paiement;
import cf1.adaming.ngspringsec.services.PaiementService;



@RestController
@RequestMapping(value="/api/paiement")
public class PaiementControllerApi {
	@Autowired
	PaiementService ps;
	
	@GetMapping(value="/{id}")
	public Paiement getById(@PathVariable("id")Long id) {
		Paiement paiement = ps.findById(id);
		return paiement;
	}
	
	@GetMapping(value="")
	public List<Paiement>findAll(){
		return ps.findAll();
	}

	@PostMapping(value="")
	public Paiement save(@RequestBody Paiement paiement) {
		return ps.save(paiement);
	}
	
	@GetMapping(value="/deleted/{id}")
	public Paiement delete(@PathVariable("id")Long id) {
		return ps.delete(id);
	}
}
