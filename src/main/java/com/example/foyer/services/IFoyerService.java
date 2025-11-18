package com.example.foyer.services;

import com.example.foyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    List<Foyer> getAllFoyer();
    Foyer getFoyerById(long idFoyer);
    void deleteFoyer(long idFoyer);
    Foyer updateFoyer(Foyer foyer);
}
