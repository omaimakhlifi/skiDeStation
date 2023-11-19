package tn.esprit.skidestation.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.services.CoursService;
import tn.esprit.skidestation.services.ICours;

import java.util.List;

@RestController
public class CoursController {
    ICours  iCours;

    public CoursController(ICours iCours) {
        this.iCours = iCours;
    }

    @PostMapping("/Cour/add")
    Cours add(@RequestBody Cours cours){
        return iCours.add(cours);
    }
    @GetMapping("/Cour/allCour")
    List<Cours> getcours(){
        return iCours.getAllCours();
    }
    @PutMapping("/cours/update")
    Cours updateCours(@RequestBody Cours cours){return iCours.update(cours);}
    @DeleteMapping("/cours/delete/{id}")
    void deleteCours(@PathVariable long id){iCours.remove(id);}
    @GetMapping("/cours/getCours/{id}")
    Cours getCour(@PathVariable long id){
        return iCours.getCours(id);
    }

}

