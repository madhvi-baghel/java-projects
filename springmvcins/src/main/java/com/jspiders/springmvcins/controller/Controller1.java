package com.jspiders.springmvcins.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvcins.pojo.Pojo;

import com.jspiders.springmvcins.service.Service1;


@Controller
public class Controller1 {

	@Autowired
	private Service1 service;

	// Home Controller
	@GetMapping("/home")
	public String home() {
		return "Home";
	}

	// Add Page Controller
	@GetMapping("/add")
	public String addPerson() {
		return "Add";
	}

	// Add Data Controller
	@PostMapping("/add")
	public String add(@RequestParam String name,  ModelMap map) {
		Pojo person = service.addPerson(name);
		if (person != null) {
			// Success response
			map.addAttribute("msg", "Data added successfully..!!");
			return "Add";
		}
		// Failure response
		map.addAttribute("msg", "Data not added successfully..!!");
		return "Add";
	}

	// Search Page Controller
	@GetMapping("/search")
	public String searchPerson() {
		return "Search";
	}

	// Search Data Controller
	@PostMapping("/search")
	public String search(@RequestParam String name, ModelMap map) {
		Pojo person = service.searchPerson(name);
		if (person != null) {
			// Success response
			map.addAttribute("msg", "Person data found..!!");
			map.addAttribute("person", person);
			return "Search";
		}
		// Failure response
		map.addAttribute("msg", "Data not found..!!");
		return "Search";
	}

	
	}


