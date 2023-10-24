package com.example.acteur1.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.acteur1.entities.Acteur;
import com.example.acteur1.entities.Film;

@RepositoryRestResource(path = "rest") 
public interface ActeurRepository extends JpaRepository<Acteur, Long> {

	List <Acteur> findByNomActeur (String nomActeur);
	List <Acteur> findByNomActeurContains (String nomActeur);
	
	/*@Query("select a from Acteur a where a.nomActeur like %?1 and a.SalaireActeur > ?2")
	List<Acteur> findByNomSalaire (String nomActeur, Double SalaireActeur); */
	
	@Query("select a from Acteur a where a.nomActeur like %:nom and a.SalaireActeur > :Salaire") 
	List<Acteur> findByNomSalaire (@Param("nom") String nomActeur,@Param("Salaire") Double SalaireActeur);
	
	@Query("select a from Acteur a where a.film = ?1") 
	List<Acteur> findByfilm (Film film); 
	
	List<Acteur> findByFilmIdFilm(Long id);
	
	List<Acteur> findByOrderByNomActeurAsc(); 
	
	@Query("select a from Acteur a order by a.nomActeur ASC, a.SalaireActeur DESC") 
	List<Acteur> trierActeurNomsSalaire (); 

}
