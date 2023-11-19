package tn.esprit.skidestation.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skidestation.entities.Moniteur;
import tn.esprit.skidestation.entities.Piste;
import tn.esprit.skidestation.services.IMoniteur;
import tn.esprit.skidestation.services.MoniteurService;

import java.util.List;

@RestController

public class MoniteurController {
    IMoniteur iMoniteur;

    public MoniteurController(IMoniteur iMoniteur) {
        this.iMoniteur = iMoniteur;
    }

    @PostMapping("/moniteur/add")
    Moniteur add(@RequestBody Moniteur moniteur){
        return iMoniteur.add(moniteur);
    }
    @GetMapping("/moniteur/allMoniteur")
    List<Moniteur> getMoniteurs(){
        return iMoniteur.getAllMoniteurs();
    }
    @PutMapping("/moniteur/update")
    Moniteur updateMoniteur(@RequestBody Moniteur moniteur){return iMoniteur.update(moniteur);}
    @DeleteMapping("/moniteur/delete/{id}")
    void deleteMoniteur(@PathVariable long id){iMoniteur.remove(id);}
    @GetMapping("/moniteur/getMoniteur/{id}")
    Moniteur getMoniteur(@PathVariable long id){
        return iMoniteur.getMoniteur(id);
    }


}
