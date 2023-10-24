package com.example.acteur1.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Film {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFilm;
	private String titre;
	private String synopsis;
	private String realisateur;
	private Date dateSortie;
	private String genre;
	
	
	
	@OneToMany (mappedBy="film")
	@JsonIgnore
	private List<Acteur> acteurs;
	
	
	public Film() {
		super();
	}
	
	
	
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}


	public List<Acteur> getActeurs() {
		return acteurs;
	}


	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
	
	

}
