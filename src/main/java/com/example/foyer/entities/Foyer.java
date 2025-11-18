package com.example.foyer.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long  idFoyer ;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc>blocs;



}
