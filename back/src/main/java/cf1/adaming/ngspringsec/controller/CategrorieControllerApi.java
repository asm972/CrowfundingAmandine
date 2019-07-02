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
import cf1.adaming.ngspringsec.model.Categorie;
import cf1.adaming.ngspringsec.services.CategorieService;



@RestController
@RequestMapping(value="/api/categorie")
public class CategrorieControllerApi {
	
	@Autowired
	CategorieService cs;
	
	@GetMapping(value="/{id}")
	public Categorie getById(@PathVariable("id")Long id) {
		Categorie categorie = cs.findById(id);
		return categorie;
	}
	
	@GetMapping(value="")
	public List<Categorie>findAll(){
		return cs.findAll();
	}
	@PostMapping(value="")
	public Categorie save(@RequestBody Categorie cat) {
		return cs.save(cat);
	}
}
	
	
