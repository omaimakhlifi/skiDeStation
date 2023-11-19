package tn.esprit.skidestation.services;

import tn.esprit.skidestation.entities.Cours;

import java.util.List;

public interface ICours {
    Cours add(Cours cour);
    Cours update(Cours cour );
    void remove (long numCours);
    List<Cours> getAllCours();
    Cours getCours(long numCours);
}
