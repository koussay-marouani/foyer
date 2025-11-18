package com.example.foyer.repositories;

import com.example.foyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepsitory extends JpaRepository<Etudiant, Long> {
    Etudiant findByCin(Long cin);
}
