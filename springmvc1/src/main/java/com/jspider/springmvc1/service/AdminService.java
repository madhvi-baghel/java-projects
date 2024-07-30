package com.jspider.springmvc1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springmvc1.pojo.AdminPOJO;
import com.jspider.springmvc1.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repository;

	public AdminPOJO login(String username, String password) {
		AdminPOJO pojo = repository.login(username, password);
		return pojo;
	}

	public List<AdminPOJO> getAdmin() {
		List<AdminPOJO> admin = repository.getAdmin();
		return admin;
	}

	public AdminPOJO addAdmin(String username, String password) {
		AdminPOJO pojo = repository.addAdmin(username, password);
		return pojo;
	}
	
}