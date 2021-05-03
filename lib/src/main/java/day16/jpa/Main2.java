package day16.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main2 {
	
	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("myjpa");
		EntityManager manager =  factory.createEntityManager();
		
		
		Address address = new Address();
		address.setCity("mumbai");
		address.setLocality("kharghar");
		address.setState("MH");
		
		manager.getTransaction().begin();
		manager.persist(address);
		manager.getTransaction().commit();
		
		
		System.out.println("Working with JPA!!");
	}

}
