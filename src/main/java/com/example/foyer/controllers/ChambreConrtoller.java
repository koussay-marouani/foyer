package com.example.foyer.controllers;

import com.example.foyer.entities.Bloc;
import com.example.foyer.entities.Chambre;
import com.example.foyer.services.IBlocService;
import com.example.foyer.services.IChambreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Chambre")
@RestController
@AllArgsConstructor
@RequestMapping("/api/chambres")
public class ChambreConrtoller {
    @Autowired
    IChambreService iChambreService;

    @Operation(description = "Ajouter Chambre")
    @PostMapping("/AjouterChambre")
    public Chambre addingChambre(@RequestBody Chambre chambre) {
        return iChambreService.addChambre(chambre);
    }

    @GetMapping("/AfficherChambres")
    public List<Chambre> getAllChambres() {
        return iChambreService.getAllChambres();
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return iChambreService.getChambreById(id);
    }
}
