package NexGem.Libreflix.DAO.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import NexGem.Libreflix.Entity.TestUserEntity;


public class HibernateUtils {
	
//	singleton
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(TestUserEntity.class);
			
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
	
}
