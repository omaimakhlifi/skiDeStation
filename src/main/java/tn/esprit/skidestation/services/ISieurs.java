package tn.esprit.skidestation.services;

import tn.esprit.skidestation.entities.Insciption;
import tn.esprit.skidestation.entities.Piste;
import tn.esprit.skidestation.entities.Skieur;
import tn.esprit.skidestation.enumeration.TypeAbonnement;

import java.util.List;

public interface ISieurs {
    Skieur add(Skieur skieur);
    Skieur update(Skieur skieur );
    void remove (long numSkieur );
    List<Skieur> getAllSkieur();
    Skieur getSkieur(long numSkieur);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);


}
