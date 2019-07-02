package cf1.adaming.ngspringsec.services;

import java.util.List;

import cf1.adaming.ngspringsec.model.UsersProjet;



public interface UsersProjetService {
	
	public UsersProjet save(UsersProjet up);
	public UsersProjet delete (Long id);
	public UsersProjet findById(Long id);
	public List<UsersProjet> findAll();
	

}