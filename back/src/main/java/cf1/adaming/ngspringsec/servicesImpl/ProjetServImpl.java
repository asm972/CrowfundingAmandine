package cf1.adaming.ngspringsec.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf1.adaming.ngspringsec.model.Projet;
import cf1.adaming.ngspringsec.repository.ProjetRepository;
import cf1.adaming.ngspringsec.services.ProjetService;

@Service
public class ProjetServImpl implements ProjetService{

	@Autowired 
	private ProjetRepository pjr;
	
	@Override
	public Projet save(Projet projet) {
		
		return pjr.save(projet);
	}

	@Override
	public Projet delete(Long id) {
	Projet projet = findById(id);
	pjr.delete(projet);
	//pjr.deleteById(id);
		return projet;
	}

	@Override
	public Projet findById(Long id) {
		
		return pjr.findById(id).get();
	}

	@Override
	public List<Projet> findAll() {
		
		return pjr.findAll();
	}

}
