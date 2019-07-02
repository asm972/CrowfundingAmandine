package cf1.adaming.ngspringsec.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf1.adaming.ngspringsec.model.UsersProjet;
import cf1.adaming.ngspringsec.repository.UsersProjetRepository;
import cf1.adaming.ngspringsec.services.UsersProjetService;

@Service
public class UsersProjetServImpl implements UsersProjetService{

	@Autowired
	private UsersProjetRepository upr;
	
	@Override
	public UsersProjet save(UsersProjet up) {
		
		return upr.save(up);
	}

	@Override
	public UsersProjet delete(Long id) {
		UsersProjet up = findById(id);
		upr.deleteById(id);
		return up;
	}

	@Override
	public UsersProjet findById(Long id) {
		
		return upr.findById(id).get();
	}

	@Override
	public List<UsersProjet> findAll() {
		
		return upr.findAll();
	}

}
