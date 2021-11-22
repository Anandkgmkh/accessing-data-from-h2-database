package com.example.demoDataBase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demoDataBase.dao.AlienRepo;
import com.example.demoDataBase.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}

	@RequestMapping("/deleteAlienAll")
	@ResponseBody
	public String deleteAlien() {
		repo.deleteAll();
		return "Alldeleted";
	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public String deletingByName(int id) // "id" values will get from web browser and passed here
	{
		repo.deleteById(id);
		return "deleted";
	}

	@RequestMapping("/getAllAliens")
	@ResponseBody
	public Iterable<Alien> getAllAliens() // "id" values will get from web browser and passed here
	{
		return repo.findAll();
	}

	@RequestMapping("/getAlien")
	@ResponseBody
	public Alien getAlien(@RequestParam int aid) {
		//ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		/**mv.addObject(alien);*/

		//Custom method vs predefined methods
		System.out.println(repo.findByTech("Java"));
		System.out.println(repo.findByAidGreaterThan(102));
		System.out.println(repo.findByTechSorted("Java"));

		return alien;

	}

}
