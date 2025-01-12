package com.jspiders.hibernatetask.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jspiders.hibernatetask.dto.EmployeeDTO;

public class EmployeeDAO {
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
	
	private static void show() {
		
		EmployeeDTO e1= entityManager.find(EmployeeDTO.class,1 );
		System.out.println(e1);
		EmployeeDTO e2= entityManager.find(EmployeeDTO.class,2 );
		System.out.println(e2);
		EmployeeDTO e3= entityManager.find(EmployeeDTO.class,3 );
		System.out.println(e3);
		EmployeeDTO e4= entityManager.find(EmployeeDTO.class,4 );
		System.out.println(e4);
		EmployeeDTO e5= entityManager.find(EmployeeDTO.class,5 );
		System.out.println(e5);
		
	}
	
	public static void main(String[] args) {
		try {
			openConnection();
			
             entityTransaction.begin();
			
			EmployeeDTO emp1  = new EmployeeDTO();
			emp1.setEmpno(1);
			emp1.setEname("Pallavi");
			emp1.setEmail("pallavi@gmail.com");
			emp1.setContact(9876543210L);
			emp1.setLoc("Pune");
			entityManager.persist(emp1);
			
			EmployeeDTO emp2  = new EmployeeDTO();
			emp2.setEmpno(2);
			emp2.setEname("ramesh");
			emp2.setEmail("ramesh@gmail.com");
			emp2.setContact(9876543210L);
			emp2.setLoc("Pune");
			entityManager.persist(emp2);
			
			EmployeeDTO emp3  = new EmployeeDTO();
			emp3.setEmpno(3);
			emp3.setEname("suresh");
			emp3.setEmail("suresh@gmail.com");
			emp3.setContact(9876543210L);
			emp3.setLoc("Pune");
			entityManager.persist(emp3);
			
			EmployeeDTO emp4  = new EmployeeDTO();
			emp4.setEmpno(4);
			emp4.setEname("anjali");
			emp4.setEmail("anjali@gmail.com");
			emp4.setContact(9876543210L);
			emp4.setLoc("Pune");
			entityManager.persist(emp4);
			
			EmployeeDTO emp5  = new EmployeeDTO();
			emp5.setEmpno(5);
			emp5.setEname("mahak");
			emp5.setEmail("mahak@gmail.com");
			emp5.setContact(9876543210L);
			emp5.setLoc("Pune");
			entityManager.persist(emp5);
			
			//display records
			show();
			
			
//			update
			EmployeeDTO ep1 = entityManager.find(EmployeeDTO.class,2);
            ep1.setEname("raju");
            entityManager.persist(ep1);
            
            EmployeeDTO ep2 = entityManager.find(EmployeeDTO.class,3);
            ep2.setEname("suraj");
            entityManager.persist(ep2);
            
          //display records
            show();
            
            
            //delete
            EmployeeDTO e = entityManager.find(EmployeeDTO.class, 5);
			entityManager.remove(e);
			
			//display records
			show();
            
			entityTransaction.commit();
			
		} finally {
			closeConnection();
		}
	}

}
