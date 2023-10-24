package com.example.acteur1;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.acteur1.entities.Acteur;
import com.example.acteur1.entities.Film;
import com.example.acteur1.repos.ActeurRepository;

@SpringBootTest
class Acteur1ApplicationTests {

@Autowired
private ActeurRepository ActeurRepository;

@Test
public void testCreateActeur() {
	Acteur act = new Acteur ("Fathi Haddaoui",50000.000,"50250115",'M',new Date());
	ActeurRepository.save(act);
}


@Test
public void testFindActeur() {
	Acteur a = ActeurRepository.findById(10L).get();
	System.out.println(a);
}

@Test
public void testUpdateActeur() {
	Acteur a = ActeurRepository.findById(10L).get();
	a.setSalaireActeur(4500.0);
	ActeurRepository.save(a);
	System.out.println(a);
}

@Test
public void testDeleteActeur() {
	ActeurRepository.deleteById(12L);
}

@Test
public void testFindAllActeur() {
	List<Acteur> acts=ActeurRepository.findAll();
	for (Acteur a:acts)
		System.out.println(a);
}

@Test
public void testFindActeurByNom() {
	List<Acteur> acts = ActeurRepository.findByNomActeur("Fathi Haddoui");
	for (Acteur a:acts)
		System.out.println(a);
}

@Test
public void testFindActeurByNomContains() {
	List<Acteur> acts = ActeurRepository.findByNomActeurContains("a");
	for (Acteur a:acts)
		System.out.println(a);
}

@Test 
public void testfindByNomSalaire()   
{  
	List<Acteur>  acts = ActeurRepository.findByNomSalaire("Rim Riahi", 1000.0);
	for (Acteur a : acts)    
	{     
		System.out.println(a);    
		}     
	}  

@Test 
public void testfindByFilm()  
{   
	Film fm = new Film();
	fm.setIdFilm(3L);      
	List<Acteur>  acts = ActeurRepository.findByfilm(fm);    
	
	for (Acteur a : acts)   
	{     
	System.out.println(a);    
	}   
} 

@Test 
public void findByFilmIdFilm()  
{      
	List<Acteur>  acts = ActeurRepository.findByFilmIdFilm(3L);
	for (Acteur a : acts)   
	{     
		System.out.println(a);    
		}        
	}  

@Test 
public void testfindByOrderByNomActeurAsc() 
{  
	List<Acteur>  acts =    ActeurRepository.findByOrderByNomActeurAsc();
	for (Acteur a : acts)   
	{   
		System.out.println(a);   
		}   
	}

@Test  
public void testTrierActeurNomsSalaire()  
{   
	List<Acteur>  acts = ActeurRepository.trierActeurNomsSalaire();   
	for (Acteur a : acts)   
	{    
		System.out.println(a);    
		}   
	}

}
