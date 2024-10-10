package tn.esprit.skidestation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.skidestation.enumeration.Support;
import tn.esprit.skidestation.enumeration.TypeCours;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCours;
    int niveau;
    TypeCours typeCours;
    Support support;
    float prix;
    int creneau;
    int p;
    @OneToMany(mappedBy = "cours")
    Set<Insciption> insc;

}
