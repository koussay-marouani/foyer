    package com.example.foyer.Mappers;

    import com.example.foyer.DTO.ProjetDTO;
    import com.example.foyer.entities.Projet;
    import org.mapstruct.Mapper;
    import org.mapstruct.Mapping;

    @Mapper(componentModel = "spring")
    public interface ProjetMapper {
        @Mapping(target = "libelleProjet", source ="nom")
        ProjetDTO toDTO(Projet projet);
    }
