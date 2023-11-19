package tn.esprit.skidestation.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.skidestation.entities.Moniteur;
import tn.esprit.skidestation.enumeration.Support;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
    void numeroDays(Support support);
}
