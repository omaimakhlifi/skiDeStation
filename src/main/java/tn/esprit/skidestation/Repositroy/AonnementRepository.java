package tn.esprit.skidestation.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.skidestation.entities.Aonnement;
import tn.esprit.skidestation.enumeration.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface AonnementRepository extends JpaRepository<Aonnement,Long> {
    @Query("select a from Aonnement a where a.typeAbon=:typeabo")
    Set<Aonnement> findByType(@Param("typeabo") TypeAbonnement type);

    @Query("select a from Aonnement a where a.dateDebut=:startDate and a.dateFin=:endDate ")
    List<Aonnement> findByDates(@Param("startDate") LocalDate startDate,@Param("endDate") LocalDate endDate);
}
