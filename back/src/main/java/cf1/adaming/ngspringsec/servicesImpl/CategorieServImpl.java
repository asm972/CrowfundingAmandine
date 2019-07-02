package cf1.adaming.ngspringsec.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cf1.adaming.ngspringsec.model.Categorie;
import cf1.adaming.ngspringsec.repository.CategorieRepository;
import cf1.adaming.ngspringsec.services.CategorieService;

@Service
public class CategorieServImpl implements CategorieService {
	
	@Autowired
	CategorieRepository cr;

	@Override
	public Categorie findById(Long id) {
		
		return cr.findById(id).get();
	}

	@Override
	public List<Categorie> findAll() {
		
		return cr.findAll();
	}

	@Override
	public Categorie save(Categorie cat) {
		
		return cr.save(cat);
	}

}
