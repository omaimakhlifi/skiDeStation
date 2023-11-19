package tn.esprit.skidestation.services;

import org.springframework.stereotype.Service;
import tn.esprit.skidestation.Repositroy.CoursRepository;
import tn.esprit.skidestation.Repositroy.MoniteurRepository;
import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.entities.Moniteur;
import tn.esprit.skidestation.enumeration.Support;

import java.util.List;
import java.util.Set;

@Service

public class MoniteurService implements IMoniteur{
    MoniteurRepository moniteurRepository;
    CoursRepository coursRepository;

    public MoniteurService(MoniteurRepository moniteurRepository) {
        this.moniteurRepository = moniteurRepository;
    }

    @Override
    public Moniteur add(Moniteur moniteur) {
        return moniteurRepository.save(moniteur) ;
    }

    @Override
    public Moniteur update(Moniteur moniteur) {
        return moniteurRepository.save(moniteur) ;
    }

    @Override
    public void remove(long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }
    @Override
    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur getMoniteur(long numMoniteur) {
        return  moniteurRepository.findById(numMoniteur).orElseThrow(()-> new NullPointerException("Invalid"));
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours cours=coursRepository.findById(numCourse).orElseThrow(null);
        Set<Cours> courses=moniteur.getCours();
        moniteur.setCours(courses);
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support) {
        Moniteur m=moniteurRepository.findById(numInstructor).orElseThrow(null);
       return null;
    }
}
