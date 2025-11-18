package com.example.foyer.services;

import com.example.foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    List<Universite> getAllUniversites();
    Universite getUniversiteById(long idUniversite);
    void deleteUniversite(long idUniversite);
    Universite updateUniversite(Universite universite);

    Universite affecterFoyerUniversite(long idFoyer, Long idUniversite);
}
