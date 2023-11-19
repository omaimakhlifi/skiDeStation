package tn.esprit.skidestation.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.skidestation.entities.Piste;
import tn.esprit.skidestation.services.IPiste;
import tn.esprit.skidestation.services.PisteService;

import java.util.List;

@RestController
public class PisteController {
    IPiste iPiste;
    @PostMapping("/piste/add")
    Piste add(@RequestBody Piste piste){
        return iPiste.add(piste);
    }
    @GetMapping("/piste/allPiste")
    List<Piste> getPistes(){
        return iPiste.getAllPiste();
    }
    @PutMapping("/piste/update")
    Piste updatePiste(@RequestBody Piste piste){return iPiste.update(piste);}
    @DeleteMapping("/piste/delete/{id}")
    void deletePiste(@PathVariable long id){iPiste.remove(id);}
    @GetMapping("/piste/getPiste/{id}")
    Piste getPiste(@PathVariable long id){
        return iPiste.getPiste(id);
    }

}
