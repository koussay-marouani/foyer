package com.example.foyer.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private LocalDate dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;

}
