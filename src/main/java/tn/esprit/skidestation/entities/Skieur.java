package tn.esprit.skidestation.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkieur;
    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;
    @OneToMany(mappedBy = "skieur",cascade = CascadeType.ALL)
    Set <Insciption> insciptions;
    @OneToOne(cascade = CascadeType.ALL)
    Aonnement abon;
}
