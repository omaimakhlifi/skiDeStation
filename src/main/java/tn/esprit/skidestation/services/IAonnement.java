package tn.esprit.skidestation.services;

import tn.esprit.skidestation.entities.Aonnement;
import tn.esprit.skidestation.entities.Insciption;
import tn.esprit.skidestation.enumeration.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAonnement {
    Aonnement add(Aonnement aonnement);
    Aonnement update(Aonnement aonnement );
    void remove (long numAbon);
    List<Aonnement> getAllAonnement();
    Aonnement getAonnement(long numAbon);
    Set<Aonnement> getSubscriptionByType(TypeAbonnement type);
    List<Aonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
