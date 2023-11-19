package tn.esprit.skidestation.services;

import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.entities.Moniteur;
import tn.esprit.skidestation.enumeration.Support;

import java.util.List;

public interface IMoniteur {
    Moniteur add(Moniteur moniteur);
    Moniteur update(Moniteur moniteur );
    void remove (long numMoniteur);
    List<Moniteur> getAllMoniteurs();
    Moniteur getMoniteur(long numMoniteur);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);
}
