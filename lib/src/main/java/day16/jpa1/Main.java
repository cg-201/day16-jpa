package day16.jpa1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("myjpa");
		EntityManager manager =  factory.createEntityManager();
		
		
		
		Address address = new Address();
		address.setCity("delhi");
		address.setState("dl");
		address.setLocality("gandhi nagar");
		
		Employee employee = new Employee();
		employee.setName("virat");
		employee.setEmail("virat@gmail.com");
		employee.setMobile("22334455");
		
		// complex object / Associated object / RelationShipt Object
		employee.setAddress(address);
		
		
		manager.getTransaction().begin();
		manager.persist(employee);  			// persisiting only 1 object; this will help to save the dependent object
		manager.getTransaction().commit();
		
		
		
		
		System.out.println("Working with JPA!!");
	}

}
