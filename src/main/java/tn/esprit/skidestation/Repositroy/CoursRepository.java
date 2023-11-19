package tn.esprit.skidestation.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.skidestation.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {

}
