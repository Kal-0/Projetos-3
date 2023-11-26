//package NexGem.Libreflix.Test;
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//import NexGem.Libreflix.DAO.Utils.HibernateUtils;
//
//public class Experiments {
//
//	public static void main(String[] args) {
//		TestGroupEntity g1 = new TestGroupEntity();
//		g1.setName("group1");
//		
//		TestItemEntity i1 = new TestItemEntity();		
//		i1.setName("item1");
//		
//		TestUserEntity u1 = new TestUserEntity();
//		u1.setEmail("email1");
//		u1.setNome("user1");
//		u1.setSenha("senha1");
//		u1.setUsername("username1");
//		u1.addItem(i1);
//		
//		i1.setUser(u1);
//		g1.addUser(u1);
//		
//		System.out.println(u1.getNome());
//		System.out.println(u1.getItens());
//		System.out.println(u1.getGroup().getName());
//		
//		
////		persist
//		SessionFactory sf = HibernateUtils.getSessionFactory();
//		Session session = sf.openSession();
//		
//		
//		session.beginTransaction();
//		
//		session.persist(g1);
//		session.persist(u1);
//		session.persist(i1);
//		
//		TestUserEntity lu1 = session.find(TestUserEntity.class, 1);
//		System.out.println(lu1.getItens());
//		
//		session.getTransaction().commit();
//		
//		
//		
//		
//		
//	}
//
//}
