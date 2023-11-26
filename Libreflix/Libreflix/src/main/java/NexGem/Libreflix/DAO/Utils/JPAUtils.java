package NexGem.Libreflix.DAO.Utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//singleton
public class JPAUtils {
	public static EntityManagerFactory emf = null;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("jpa-hibernate");
		}
		return emf;
	}
	
	
	public static EntityManager getEntityManager() {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		
		return em;
	}
	
	public static void closeEMF() {
		getEntityManagerFactory().close();
		
	}
}
