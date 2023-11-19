package tn.esprit.skidestation.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skidestation.entities.Insciption;
import tn.esprit.skidestation.services.IInscription;
import tn.esprit.skidestation.services.InsciptionService;

import java.util.List;

@RestController

public class InscriptionController {
    IInscription iInscription;

    public InscriptionController(IInscription iInscription) {
        this.iInscription = iInscription;
    }

    @PostMapping("/insciption/add")
    Insciption add(@RequestBody Insciption insciption){
        return iInscription.add(insciption);
    }
    @GetMapping("/insciption/allInsciption")
    List<Insciption> getInsciptions(){
        return iInscription.getAllInscription();
    }
    @PutMapping("/insciption/update")
    Insciption updateInsciption(@RequestBody Insciption insciption){return iInscription.update(insciption);}
    @DeleteMapping("/insciption/delete/{id}")
    void deleteInsciption(@PathVariable long id){iInscription.remove(id);}
    @GetMapping("/insciption/getInsciption/{id}")
    Insciption getInsciption(@PathVariable long id){
        return iInscription.getInscription(id);
    }

}
