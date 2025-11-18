package com.example.foyer.services;


import com.example.foyer.DTO.ProjetDTO;
import com.example.foyer.Mappers.ProjetMapper;
import com.example.foyer.entities.Projet;
import com.example.foyer.repositories.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProjetServiceImpl  implements ProjetService {

    private final ProjetRepository projetRepository;
    private  final ProjetMapper projetMapper;



    public ProjetDTO getProjetById(Long id) {
        Projet projet = projetRepository.findById(id).orElseThrow();

        return projetMapper.toDTO(projet);
    }





}
