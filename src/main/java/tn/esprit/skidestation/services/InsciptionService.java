package tn.esprit.skidestation.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.skidestation.Repositroy.CoursRepository;
import tn.esprit.skidestation.Repositroy.InscriptionRepository;
import tn.esprit.skidestation.Repositroy.SkieurRepository;
import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.entities.Insciption;
import tn.esprit.skidestation.entities.Skieur;
import tn.esprit.skidestation.enumeration.TypeCours;

import java.util.List;
@Service
@AllArgsConstructor
public class InsciptionService implements IInscription{
    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository;
    CoursRepository coursRepository;



    @Override
    public Insciption add(Insciption inscription) {
        return inscriptionRepository.save(inscription);
    }



    @Override
    public Insciption update(Insciption inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void remove(long numInscription) {
        inscriptionRepository.deleteById(numInscription);}
    @Override
    public List<Insciption> getAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Insciption getInscription(long numInscription) {
        return inscriptionRepository.findById(numInscription).orElseThrow(()-> new NullPointerException("Invalid"));
    }

    @Override
    public Insciption addRegistrationAndAssignToSkier(Insciption registration, Long numSkier) {
        Skieur s=skieurRepository.findById(numSkier).orElseThrow(null);
        registration.setSkieur(s);
        return inscriptionRepository.save(registration);
    }

    @Override
    public Insciption assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Cours c=coursRepository.findById(numCourse).orElseThrow(null);
        Insciption i= inscriptionRepository.findById(numRegistration).orElseThrow();
        i.setCours(c);
        return inscriptionRepository.save(i);
    }

    @Override
    public Insciption addRegistrationAndAssignToSkierAndCourse(Insciption inscription, Long numSkieur, Long numCours) {
        Cours c=coursRepository.findById(numCours).orElseThrow(null);
        Skieur s=skieurRepository.findById(numSkieur).orElseThrow(null);

        return null;
    }

}



