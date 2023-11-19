package tn.esprit.skidestation.services;

import org.springframework.stereotype.Service;
import tn.esprit.skidestation.Repositroy.AonnementRepository;
import tn.esprit.skidestation.entities.Aonnement;
import tn.esprit.skidestation.enumeration.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Service
public class AonnementService implements  IAonnement{
    AonnementRepository aonnementRepository;

    public AonnementService(AonnementRepository aonnementRepository) {
        this.aonnementRepository = aonnementRepository;
    }

    @Override
    public Aonnement add(Aonnement aonnement) {
        return aonnementRepository.save(aonnement);
    }

    @Override
    public Aonnement update(Aonnement aonnement) {
        return aonnementRepository.save(aonnement);
    }

    @Override
    public void remove(long numAbon) {
        aonnementRepository.deleteById(numAbon);

    }

    @Override
    public List<Aonnement> getAllAonnement() {
        return aonnementRepository.findAll();
    }

    @Override
    public Aonnement getAonnement(long numAbon) {
        return aonnementRepository.findById(numAbon).orElseThrow(()-> new NullPointerException("Invalid"));
    }

    @Override
    public Set<Aonnement> getSubscriptionByType(TypeAbonnement type) {
        return aonnementRepository.findByType(type);
    }

    @Override
    public List<Aonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return aonnementRepository.findByDates(startDate,endDate);
    }
}
