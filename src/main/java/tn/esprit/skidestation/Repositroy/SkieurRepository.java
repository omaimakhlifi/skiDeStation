package tn.esprit.skidestation.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.entities.Skieur;
import tn.esprit.skidestation.enumeration.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    @Query("select s from  Skieur s where s.abon=:abonnement")
    List<Skieur> findByType(@Param("abonnement") TypeAbonnement typeAbonnement);
}
