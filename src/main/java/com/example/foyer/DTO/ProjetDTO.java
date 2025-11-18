package com.example.foyer.DTO;



public class ProjetDTO {

    private Long id;
    private String libelleProjet; // ← doit correspondre à target dans le Mapper

    // Getter / Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelleProjet() {
        return libelleProjet;
    }
    public void setLibelleProjet(String libelleProjet) {
        this.libelleProjet = libelleProjet;
    }
}
