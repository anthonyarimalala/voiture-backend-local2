package com.example.springsecurity.repository;

import com.example.springsecurity.model.Favori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Favorirepository extends JpaRepository<Favori,Integer> {
    @Query("select f from Favori f where f.utilisateur.id= :idutilisateur")
    List<Favori> myfavori(int idutilisateur);
}
