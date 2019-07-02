package cf1.adaming.ngspringsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cf1.adaming.ngspringsec.model.CarteCredit;
import cf1.adaming.ngspringsec.security.WebSecurityConfig;
import cf1.adaming.ngspringsec.services.CarteCreditService;


@RestController
@RequestMapping(value="/api/cartecredit")
public class CarteCreditControllerApi {
	@Autowired
	CarteCreditService ccs;
	
	@GetMapping(value="/{id}")
	public CarteCredit getById(@PathVariable("id")Long id) {
		CarteCredit carteCredit = ccs.findById(id);
		return carteCredit;
	}
	
	@GetMapping(value="")
	public List<CarteCredit>findAll(){
		return ccs.findAll();
	}

	@PostMapping(value="")
	public CarteCredit save(@RequestBody CarteCredit carteCredit) {
		
		carteCredit.setCccvv(WebSecurityConfig.passwordEncoder().encode(carteCredit.getCccvv()));
		carteCredit.setCcnumero(WebSecurityConfig.passwordEncoder().encode(carteCredit.getCcnumero().toString()));
		carteCredit.setCcexpiration(WebSecurityConfig.passwordEncoder().encode(carteCredit.getCcexpiration()));

		return ccs.save(carteCredit);
	}
	
	@GetMapping(value="/deleted/{id}")
	public CarteCredit delete(@PathVariable("id")Long id) {
		return ccs.delete(id);
	}
}
