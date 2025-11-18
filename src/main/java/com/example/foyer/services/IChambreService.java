package com.example.foyer.services;


import com.example.foyer.entities.Chambre;

import java.util.List;


public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    List<Chambre> getAllChambres();
    Chambre getChambreById(long idChambre);
    void deleteChambre(long idChambre);
    Chambre updateChambre(Chambre chambre);
}
