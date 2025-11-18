package com.example.foyer.controllers;

import com.example.foyer.entities.Universite;
import com.example.foyer.services.UniversiteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Gestion Universite")
@RestController
@AllArgsConstructor
@RequestMapping("/api/univarsites")


public class UniversiteController {

    @Autowired
    private UniversiteService universiteService;

    @PostMapping("/{idUniversite}/foyer/{idFoyer}")
    public Universite affecterFoyer(
            @PathVariable Long idUniversite,
            @PathVariable Long idFoyer) {
        return universiteService.affecterFoyerUniversite(idFoyer, idUniversite);
    }

}
