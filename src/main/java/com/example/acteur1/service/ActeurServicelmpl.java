package com.example.acteur1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.acteur1.entities.Acteur;
import com.example.acteur1.entities.Film;
import com.example.acteur1.repos.ActeurRepository;

@Service
public class ActeurServicelmpl implements ActeurService{

	@Autowired
	ActeurRepository acteurRepository;
	
	@Override
	public Acteur saveActeur(Acteur a) {
		return acteurRepository.save(a);
	}

	@Override
	public Acteur updateActeur(Acteur a) {
		return acteurRepository.save(a);
	}

	@Override
	public void deleteActeur(Acteur a) {
		acteurRepository.delete(a);
	}

	@Override
	public void deleteActeurById(Long id) {
		acteurRepository.deleteById(id);
	}

	@Override
	public Acteur getActeur(Long id) {
		return acteurRepository.findById(id).get();
	}

	@Override
	public List<Acteur> getAllActeurs() {
		return acteurRepository.findAll();
	}

	@Override
	public List<Acteur> findByNomActeur(String nom) {
		return acteurRepository.findByNomActeur(nom);
	}

	@Override
	public List<Acteur> findByNomActeurContains(String nom) {
		return acteurRepository.findByNomActeurContains(nom);
	}

	@Override
	public List<Acteur> findByNomSalaire(String nom, Double salaire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acteur> findByFilm(Film film) {
		return acteurRepository.findByfilm(film);
	}

	@Override
	public List<Acteur> findByFilmIdFilm(Long id) {
		return acteurRepository.findByFilmIdFilm(id);
	}

	@Override
	public List<Acteur> findByOrderByNomActeurAsc() {
		return acteurRepository.findByOrderByNomActeurAsc();
	}

	@Override
	public List<Acteur> trierActeurNomSalaire() {
		return acteurRepository.trierActeurNomsSalaire();
	}

}
