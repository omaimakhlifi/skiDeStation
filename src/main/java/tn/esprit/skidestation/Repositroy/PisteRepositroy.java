package tn.esprit.skidestation.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.skidestation.entities.Piste;

public interface PisteRepositroy extends JpaRepository<Piste,Long> {
}
