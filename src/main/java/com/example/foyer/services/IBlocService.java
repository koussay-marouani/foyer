package com.example.foyer.services;

import com.example.foyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    List<Bloc> getAllBlocs();
    Bloc getBlocById(long idBloc);
    void deleteBloc(long idBloc);
    Bloc updateBloc(Bloc bloc);
}
