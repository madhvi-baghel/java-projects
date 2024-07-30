package com.jspiders.springmvcins.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.springmvcins.pojo.Pojo;

@Repository
public class Repository1 {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	private static String jpql;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("mvc");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
	}

	public Pojo addPerson(String name) {
		openConnection();
		transaction.begin();
		Pojo pojo = new Pojo();
		pojo.setName(name);
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}
	
	public Pojo searchPerson(String name) {
		openConnection();
		transaction.begin();
		Pojo pojo = manager.find(Pojo.class, name);
		if (pojo != null) {
			transaction.commit();
			closeConnection();
			return pojo;
		}
		transaction.commit();
		closeConnection();
		return null;
	}

	public List<Pojo> allPerson() {
		openConnection();
		transaction.begin();
		jpql = "from Pojo";
		query = manager.createQuery(jpql);
		List<Pojo> person = query.getResultList();
		transaction.commit();
		closeConnection();
		return person;
	}

	
	

}
