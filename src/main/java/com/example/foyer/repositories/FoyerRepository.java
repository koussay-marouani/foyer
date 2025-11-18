package com.example.foyer.repositories;

import com.example.foyer.entities.Foyer;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {

    List<Foyer> findByBlocsCapaciteBlocAndBlocsNomBloc(Long blocsCapaciteBloc, String blocsNomBloc, Limit limit);
}
