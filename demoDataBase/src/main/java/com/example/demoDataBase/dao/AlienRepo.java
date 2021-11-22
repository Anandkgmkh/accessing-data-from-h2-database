package com.example.demoDataBase.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demoDataBase.model.Alien;

/**
 * @author Anand
 *
 */
public interface AlienRepo extends CrudRepository<Alien, Integer>{ 
	
	  //custom method declaration 
	  List<Alien> findByTech(String tech);
	  
	  List<Alien> findByAidGreaterThan(int aid);
	  
	  @Query("from Alien where tech=?1 order by name") List<Alien>
	  findByTechSorted(String tech);
	 
	
	

	
}
