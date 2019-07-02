package cf1.adaming.ngspringsec.services;

import java.util.List;

import cf1.adaming.ngspringsec.model.Projet;



public interface ProjetService {
	public Projet save(Projet projet);
	public Projet delete (Long id);
	public Projet findById(Long id);
	public List<Projet> findAll();
}
