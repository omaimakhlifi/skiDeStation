package tn.esprit.skidestation.services;

import tn.esprit.skidestation.entities.Insciption;

import java.util.List;

public interface IInscription {
    Insciption add(Insciption inscription);
    Insciption update(Insciption inscription );
    void remove (long numInscription);
    List<Insciption> getAllInscription();
    Insciption getInscription(long numInscription);
    Insciption addRegistrationAndAssignToSkier(Insciption registration, Long numSkier);
    Insciption assignRegistrationToCourse(Long numRegistration, Long numCourse);
    Insciption addRegistrationAndAssignToSkierAndCourse(Insciption inscription,Long numSkieur, Long numCours);


}
