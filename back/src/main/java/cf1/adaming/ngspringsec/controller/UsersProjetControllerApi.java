package cf1.adaming.ngspringsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cf1.adaming.ngspringsec.model.UsersProjet;
import cf1.adaming.ngspringsec.services.UsersProjetService;



@RestController
@RequestMapping(value="/api/users")
public class UsersProjetControllerApi {
	@Autowired
	UsersProjetService ps;
	
	@GetMapping(value="/{id}")
	public UsersProjet getById(@PathVariable("id")Long id) {
		UsersProjet projet = ps.findById(id);
		return projet;
	}
	
	@GetMapping(value="")
	public List<UsersProjet>findAll(){
		return ps.findAll();
	}

	@PostMapping(value="")
	public UsersProjet save(@RequestBody UsersProjet UsersProjet) {
		return ps.save(UsersProjet);
	}
	
	@GetMapping(value="/deleted/{id}")
	public UsersProjet delete(@PathVariable("id")Long id) {
		return ps.delete(id);
	}
}
