package tn.esprit.skidestation.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skidestation.entities.Skieur;
import tn.esprit.skidestation.services.ISieurs;
import tn.esprit.skidestation.services.SkieurService;

import java.util.List;

@RestController
public class SkieurController {
    ISieurs iSieurs;
    @PostMapping("/skieur/add")
    Skieur add(@RequestBody Skieur skieur){
        return iSieurs.add(skieur);
    }
    @GetMapping("/skieur/allSkieur")
    List<Skieur> getSkieur(){
        return iSieurs.getAllSkieur();
    }
    @PutMapping("/skieur/update")
    Skieur updatekieur(@RequestBody Skieur skieur){return iSieurs.update(skieur);}
    @DeleteMapping("/skieur/delete/{id}")
    void deletekieur(@PathVariable long id){iSieurs.remove(id);}
    @GetMapping("/skieur/getSkieur/{id}")
    Skieur getkieur(@PathVariable long id){
        return iSieurs.getSkieur(id);
    }
}
