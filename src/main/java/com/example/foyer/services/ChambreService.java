package com.example.foyer.services;

import com.example.foyer.entities.Chambre;
import com.example.foyer.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{


    @Autowired
    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return null;
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreById(long idChambre) {
        return null;
    }

    @Override
    public void deleteChambre(long idChambre) {

    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return null;
    }
}
