package com.example.foyer.controllers;

import com.example.foyer.DTO.ProjetDTO;
import com.example.foyer.services.ProjetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Project Management")
@RestController
@AllArgsConstructor
@RequestMapping("/Projet")
public class projetRESTController {

    @Autowired
    private ProjetService projetService;

    @RequestMapping("/{id}")
    @Operation(summary = "Get Project by nom")
    public ProjetDTO getProjet(@PathVariable Long id) {
        return projetService.getProjetById(id);
    }
}
