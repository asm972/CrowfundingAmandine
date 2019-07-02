package cf1.adaming.ngspringsec.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import cf1.adaming.ngspringsec.model.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {

}
