package com.example.acteur1.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.acteur1.entities.Acteur;
import com.example.acteur1.service.ActeurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ActeurRESTController {
	
	@Autowired
	ActeurService acteurService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Acteur> getAllActeur()
	{
		return acteurService.getAllActeurs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Acteur getProduitById(@PathVariable("id") Long id){   
		return acteurService.getActeur(id);    
		} 

	@RequestMapping(method = RequestMethod.POST)  
	public Acteur createActeur(@RequestBody Acteur acteur)
	{   
		return acteurService.saveActeur(acteur);  
		} 
	
	@RequestMapping(method = RequestMethod.PUT)  
	public Acteur updateProduit(@RequestBody Acteur acteur) 
	{  
		return acteurService.updateActeur(acteur);  
		}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteActeur(@PathVariable("id") Long id)
	{   
		acteurService.deleteActeurById(id); 
		} 
	
	@RequestMapping(value="/prodsfilm/{idFilm}",method = RequestMethod.GET) 
	public List<Acteur> getActeurByCatId(@PathVariable("idFilm") Long idFilm)
	{   
		return acteurService.findByFilmIdFilm(idFilm);  
		}
	
}
