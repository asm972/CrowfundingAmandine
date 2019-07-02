package cf1.adaming.ngspringsec.services;

import java.util.List;

import cf1.adaming.ngspringsec.model.CarteCredit;
import cf1.adaming.ngspringsec.model.Categorie;

public interface CategorieService {
	
	public Categorie findById(Long id);
	public List<Categorie> findAll();
	public Categorie save(Categorie cat);
	
}
