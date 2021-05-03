package day16.jpa1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main2 {
	
	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("myjpa");
		EntityManager manager =  factory.createEntityManager();
		
		
		
		// fetch / find
		Employee employee =  manager.find(Employee.class, 2);
		System.out.println(employee);
		
		
		
		
		
		System.out.println("Working with JPA!!");
	}

}
