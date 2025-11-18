package com.example.foyer.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;

}
