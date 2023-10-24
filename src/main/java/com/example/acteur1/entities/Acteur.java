package com.example.acteur1.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Acteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idActeur;
	private String nomActeur;
	private Double SalaireActeur;
	private String telActeur;
	private char genreActeur;
	private Date datedenaiss;
	
	@ManyToOne
	private Film film;
	
	
	public Acteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Acteur(String nomActeur, double salaireActeur, String telActeur, char genreActeur, Date datedenaiss) {
		super();
		this.nomActeur = nomActeur;
		SalaireActeur = salaireActeur;
		this.telActeur = telActeur;
		this.genreActeur = genreActeur;
		this.datedenaiss = datedenaiss;
	}


	public long getIdActeur() {
		return idActeur;
	}
	public void setIdActeur(Long idActeur) {
		this.idActeur = idActeur;
	}
	public String getNomActeur() {
		return nomActeur;
	}
	public void setNomActeur(String nomActeur) {
		this.nomActeur = nomActeur;
	}
	public double getSalaireActeur() {
		return SalaireActeur;
	}
	public void setSalaireActeur(Double salaireActeur) {
		SalaireActeur = salaireActeur;
	}
	public String getTelActeur() {
		return telActeur;
	}
	public void setTelActeur(String telActeur) {
		this.telActeur = telActeur;
	}
	public char getGenreActeur() {
		return genreActeur;
	}
	public void setGenreActeur(char genreActeur) {
		this.genreActeur = genreActeur;
	}
	public Date getDatedenaiss() {
		return datedenaiss;
	}
	public void setDatedenaiss(Date datedenaiss) {
		this.datedenaiss = datedenaiss;
	}


	@Override
	public String toString() {
		return "Acteur [idActeur=" + idActeur + ", nomActeur=" + nomActeur + ", SalaireActeur=" + SalaireActeur
				+ ", telActeur=" + telActeur + ", genreActeur=" + genreActeur + ", datedenaiss=" + datedenaiss + "]";
	}


	public Film getFilm() {
		return film;
	}


	public void setFilm(Film film) {
		this.film = film;
	}
	
	

}
