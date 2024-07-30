package com.jspiders.springmvcins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jspiders.springmvcins.pojo.Pojo;
import com.jspiders.springmvcins.repository.Repository1;


@Service
public class Service1 {
	
	@Autowired
	private Repository1 repository;
	
	public Pojo addPerson(String name) {
		Pojo person = repository.
				addPerson(name);
		return person;
	}

	public Pojo searchPerson(String name) {
		Pojo person = repository.searchPerson(name);
		return person;
	}

	public List<Pojo> searchAllSerson() {
		List<Pojo> person = repository.allPerson();
		return person;
	}


}

