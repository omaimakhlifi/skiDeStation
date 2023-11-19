package tn.esprit.skidestation.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skidestation.Repositroy.InscriptionRepository;
import tn.esprit.skidestation.Repositroy.SkieurRepository;
import tn.esprit.skidestation.entities.Insciption;
import tn.esprit.skidestation.entities.Skieur;
import tn.esprit.skidestation.enumeration.TypeAbonnement;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class SkieurService implements  ISieurs{

    SkieurRepository skieurRepository;
    InscriptionRepository inscriptionRepository;



    @Override
    public Skieur add(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur update(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void remove(long numSkieur) {
        skieurRepository.deleteById(numSkieur);

    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getSkieur(long numSkieur) {
        return skieurRepository.findById(numSkieur).orElseThrow(()-> new NullPointerException("Invalid"));
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return  skieurRepository.findByType(typeAbonnement);
    }


}
