package cf1.adaming.ngspringsec.services;

import java.util.List;

import cf1.adaming.ngspringsec.model.CarteCredit;

public interface CarteCreditService {
	public CarteCredit save(CarteCredit carte);
	public CarteCredit delete (Long id);
	public CarteCredit findById(Long id);
	public List<CarteCredit> findAll();
	

}
