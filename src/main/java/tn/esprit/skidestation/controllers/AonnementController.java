package tn.esprit.skidestation.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skidestation.entities.Aonnement;
import tn.esprit.skidestation.entities.Cours;
import tn.esprit.skidestation.services.IAonnement;

import java.util.List;

@RestController
public class AonnementController {
    IAonnement iAonnement;

    public AonnementController(IAonnement iAonnement) {
        this.iAonnement = iAonnement;
    }
    @PostMapping("/iAonnement/add")
    Aonnement add(@RequestBody Aonnement aonnement){
        return iAonnement.add(aonnement);
    }
    @GetMapping("/iAonnement/alliAonnement")
    List<Aonnement> getAonnement(){
        return iAonnement.getAllAonnement();
    }
    @PutMapping("/iAonnement/update")
    Aonnement updateAonnement(@RequestBody Aonnement aonnement){return iAonnement.update(aonnement);}
    @DeleteMapping("/iAonnement/delete/{id}")
    void deleteAonnement(@PathVariable long id){iAonnement.remove(id);}
    @GetMapping("/iAonnement/getiAonnement/{id}")
    Aonnement getAonnement(@PathVariable long id){
        return iAonnement.getAonnement(id);
    }
}
