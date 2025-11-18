package com.example.foyer.controllers;

import com.example.foyer.entities.Bloc;
import com.example.foyer.services.IBlocService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name = "Gestion Bloc")
@RestController
@AllArgsConstructor
@RequestMapping("/api/blocs")
public class BlocController {
    @Autowired
    IBlocService iBlocService;
    @Operation(description = "Ajouter un bloc")
    @PostMapping("/AjouterBloc")
    public Bloc addingBloc(@RequestBody Bloc bloc) {
        return iBlocService.addBloc(bloc);
    }
    @GetMapping("/AfficherBlocs")
    public List<Bloc> getAllBlocs() {
        return iBlocService.getAllBlocs();
    }

    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable Long id) {
        return iBlocService.getBlocById(id);

    }





}



