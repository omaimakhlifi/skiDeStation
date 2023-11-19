package tn.esprit.skidestation.services;

import org.springframework.stereotype.Service;
import tn.esprit.skidestation.Repositroy.CoursRepository;
import tn.esprit.skidestation.entities.Cours;

import java.util.List;
@Service
public class CoursService implements  ICours {
    CoursRepository coursRepository;

    public CoursService(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public Cours add(Cours cour) {
        return coursRepository.save(cour);
    }

    @Override
    public Cours update(Cours cour) {
        return coursRepository.save(cour);
    }

    @Override
    public void remove(long numCours) {
        coursRepository.deleteById(numCours);

    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours getCours(long numCours) {
        return coursRepository.findById(numCours).orElseThrow(()-> new NullPointerException("Invalid"));
    }
}




