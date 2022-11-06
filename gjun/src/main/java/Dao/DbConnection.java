package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public static void main(String[] args) {

		System.out.println(getDB());
	}

	public static EntityManager getDB() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gjun");
		EntityManager em = emf.createEntityManager();

		return em;
	}
}
