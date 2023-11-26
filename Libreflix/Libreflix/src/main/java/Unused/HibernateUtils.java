package Unused;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtils {
	
//	singleton
	private HibernateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	private static SessionFactory sessionFactory = null;
	
//	new way to create a sessionFactory
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			// Create the StandardServiceRegistry
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

            // Create MetadataSources
            MetadataSources metadataSources = new MetadataSources(standardRegistry);

            // Create Metadata
            Metadata metadata = metadataSources.getMetadataBuilder().build();

            // Create SessionFactory
            sessionFactory = metadata.getSessionFactoryBuilder().build();
			
		}
		
		return sessionFactory;
	}
	
}
