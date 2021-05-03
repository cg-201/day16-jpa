package day16.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("myjpa");
		EntityManager manager =  factory.createEntityManager();
		
		
		Employee employee = new Employee();
		// employee.setName("rohit");
		employee.setEmail("rohit@gmail.com");
		employee.setMobile("11223344");
		
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
		
		
		System.out.println("Working with JPA!!");
	}

}
