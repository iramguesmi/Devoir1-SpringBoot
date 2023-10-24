package com.example.acteur1.service;

import java.util.List;

import com.example.acteur1.entities.Acteur;
import com.example.acteur1.entities.Film;

public interface ActeurService {
Acteur saveActeur (Acteur a);
Acteur updateActeur (Acteur a);
void deleteActeur (Acteur a);
void deleteActeurById(Long id);
Acteur getActeur(Long id);
List<Acteur> getAllActeurs();

List<Acteur> findByNomActeur(String nom);
List<Acteur> findByNomActeurContains(String nom);
List<Acteur> findByNomSalaire (String nom, Double salaire); 
List<Acteur> findByFilm (Film film);   
List<Acteur> findByFilmIdFilm(Long id);  
List<Acteur> findByOrderByNomActeurAsc();  
List<Acteur> trierActeurNomSalaire(); 

}
