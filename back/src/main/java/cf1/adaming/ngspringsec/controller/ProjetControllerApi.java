package cf1.adaming.ngspringsec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cf1.adaming.ngspringsec.model.Projet;
import cf1.adaming.ngspringsec.model.UsersProjet;
import cf1.adaming.ngspringsec.services.ProjetService;

@PreAuthorize("hasRole('USER') or hasRole('ADMIN')or hasRole('PM')")
@RestController
@RequestMapping(value="/api/projet")
public class ProjetControllerApi {
	@Autowired
	ProjetService ps;
	
	@GetMapping(value="/{id}")
	public Projet getById(@PathVariable("id")Long id) {
		Projet projet = ps.findById(id);
		return projet;
	}
	
	@GetMapping(value="")
	public List<Projet>findAll(){
		return ps.findAll();
	}

	@PostMapping(value="")
	public Projet save(@RequestBody Projet projet) {
		
		return ps.save(projet);
	}
	
	
	@GetMapping(value="/delete/{id}")
	public Projet delete(@PathVariable("id")Long id) {
		System.out.println(id);
		return ps.delete(id);
		//return null;
	}
}
