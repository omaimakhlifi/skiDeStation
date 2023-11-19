package tn.esprit.skidestation.services;

import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.entities.Piste;
import tn.esprit.skidestation.entities.Skieur;

import java.util.List;

public interface IPiste {
    Piste add(Piste piste);
    Piste update(Piste piste );
    void remove (long numPiste);
    List<Piste> getAllPiste();
    Piste getPiste(long numPiste);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
}
