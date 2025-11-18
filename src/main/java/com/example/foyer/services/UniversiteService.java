package com.example.foyer.services;

import com.example.foyer.entities.Foyer;
import com.example.foyer.entities.Universite;
import com.example.foyer.repositories.FoyerRepository;
import com.example.foyer.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversiteService {

    @Autowired
    private UniversiteRepository universiteRepository;

    @Autowired
    private FoyerRepository foyerRepository;

    public Universite affecterFoyerUniversite(long idFoyer, Long idUniversite) {
        // Récupérer le foyer
        Foyer foyer = foyerRepository.findById(idFoyer)
                .orElseThrow(() -> new RuntimeException("Foyer introuvable"));

        // Récupérer l'université
        Universite universite = universiteRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException("Université introuvable"));

        // Affecter le foyer à l'université (OWNING SIDE)
        universite.setFoyer(foyer);

        // Sauvegarder l'université
        universiteRepository.save(universite);

        // Retourner l'université mise à jour
        return universite;
    }

}
