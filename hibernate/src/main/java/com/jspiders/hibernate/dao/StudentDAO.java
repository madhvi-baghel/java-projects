package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.StudentDTO;

public class StudentDAO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection() {
		entityManagerFactory = Persistence.
				createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null && entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			
			openConnection();
			
			entityTransaction.begin();
			
			StudentDTO student = new StudentDTO();
			student.setId(4);
			student.setName("Pallavi");
			student.setEmail("pallavi@gmail.com");
//			student.setContact(9876543210L);
			student.setCity("Pune");
			entityManager.persist(student);
			
			entityTransaction.commit();
			
		} finally {
			closeConnection();
		}
	}

}
