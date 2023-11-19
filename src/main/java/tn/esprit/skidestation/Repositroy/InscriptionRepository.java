package tn.esprit.skidestation.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.skidestation.entities.Insciption;

public interface InscriptionRepository extends JpaRepository<Insciption,Long> {
    @Query("SELECT COUNT(i) FROM Insciption i WHERE I.skieur = :coursId")
    int countSkieursForCours(@Param("coursId") Long numCours);
}
