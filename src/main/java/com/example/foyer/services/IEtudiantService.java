package com.example.foyer.services;


import com.example.foyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(long idEtudiant);
    void deleteChambre(long idEtudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
}
