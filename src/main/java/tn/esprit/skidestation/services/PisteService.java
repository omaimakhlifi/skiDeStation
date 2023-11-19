package tn.esprit.skidestation.services;

import org.springframework.stereotype.Service;
import tn.esprit.skidestation.Repositroy.PisteRepositroy;
import tn.esprit.skidestation.Repositroy.SkieurRepository;
import tn.esprit.skidestation.entities.Piste;
import tn.esprit.skidestation.entities.Skieur;

import java.util.List;

@Service
public class PisteService implements IPiste{
    PisteRepositroy pisteRepositroy;
    SkieurRepository skieurRepository;

    public PisteService(PisteRepositroy pisteRepositroy) {
        this.pisteRepositroy = pisteRepositroy;
    }

    @Override
    public Piste add(Piste piste) {
        return pisteRepositroy.save(piste);
    }

    @Override
    public Piste update(Piste piste) {
        return pisteRepositroy.save(piste) ;
    }

    @Override
    public void remove(long numPiste) {
        pisteRepositroy.deleteById(numPiste);

    }

    @Override
    public List<Piste> getAllPiste() {
        return pisteRepositroy.findAll();
    }

    @Override
    public Piste getPiste(long numPiste) {
        return  pisteRepositroy.findById(numPiste).orElseThrow(()-> new NullPointerException("Invalid"));
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur=skieurRepository.findById(numSkieur).orElseThrow(null);
        Piste piste =pisteRepositroy.findById(numPiste).orElseThrow(null);
        piste.getSkieurs().add(skieur);


        return skieurRepository.save(skieur);
    }
}
