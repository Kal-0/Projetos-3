//package NexGem.Libreflix.Test;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.ArrayList;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import NexGem.Libreflix.DAO.Utils.HibernateUtils;
//import NexGem.Libreflix.Entity.ObraEntity;
//import NexGem.Libreflix.Entity.UsuarioEntity;
//import NexGem.Libreflix.Entity.VideoEntity;
//import NexGem.Libreflix.Entity.General.Categoria;
//import NexGem.Libreflix.Entity.General.CategoriaClassificacaoIndicativa;
//import NexGem.Libreflix.Entity.General.CategoriaGenero;
//import NexGem.Libreflix.Entity.General.CategoriaTema;
//import NexGem.Libreflix.Entity.General.CategoriaTipo;
//
//public class MainTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String titulo = "filme1";
//		String subtitulo = "sub1";
//		LocalDate anoDeProducao = LocalDate.of(1999, 12, 31);
//		
//		ArrayList<CategoriaGenero> generos =  new ArrayList<CategoriaGenero>();
//		generos.add(CategoriaGenero.ANIMACAO);
//		ArrayList<CategoriaTema> temas =  new ArrayList<CategoriaTema>();
//		temas.add(CategoriaTema.ESTRANGEIROS);
//		
//		
//		String descricao = "descricao1";
//		String url = "url1";
//		String permalink = "permalink1";
//		
//		ObraEntity obra1 = new ObraEntity(titulo, subtitulo, anoDeProducao, descricao, url, permalink) {
//		};
//		
//		
//		LocalTime duracao = LocalTime.of(1, 45, 30);
//		VideoEntity filme1 = new VideoEntity(titulo, subtitulo, anoDeProducao, descricao, url, permalink, duracao);
//		Categoria categoria = new Categoria(filme1,CategoriaTipo.FILME, generos, temas, CategoriaClassificacaoIndicativa.R18);
//		filme1.setCategoria(categoria);
//		
//		System.out.println(obra1.getTitulo());
//		System.out.println(filme1.getSubtitulo());
//		System.out.println(filme1.getCategoria().getGeneros());
//		
//		UsuarioEntity usuario1 = new UsuarioEntity("caio", "kal", "kal@gmail.com", "123");
//		
////		TestUserEntity u1 = new TestUserEntity("caio1", "kal", "kal@gmail.com", "123");
//		
//		
//		LocalDate ano1 = LocalDate.of(2026, 12, 31);
//		LocalTime dur1 = LocalTime.of(2, 45, 30);
//		VideoEntity v1 = new VideoEntity("dragoes", "4", ano1, "d movie", "url", "permalink", dur1);
//		
//		
////		*create configuration
////		Configuration config = new Configuration();
////		config.configure().addAnnotatedClass(TestUserEntity.class);
//		
////		*create session factory
////		SessionFactory sFactory = config.buildSessionFactory();
//		SessionFactory sFactory = HibernateUtils.getSessionFactory();
//		
////		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
////	            .configure("hibernate.cfg.xml") // Load your Hibernate configuration
////	            .build();
//		
//		
////		*initialize session
//		Session session = sFactory.openSession();
//		
////		save data to database
//		session.beginTransaction();
////		session.save(u1);
////		session.save(v1);
//		session.getTransaction().commit();
//		
//		
//////		load data from database
////		session.beginTransaction();
////		TestUserEntity getTestUserEntity = session.get(TestUserEntity.class, 1);
////		session.getTransaction().commit();
////		
////		System.out.println(getTestUserEntity.getNome());
////		
////		
//////		update data to database(overwriting)
////		getTestUserEntity.setNome("caio cesar");
////		session.beginTransaction();
////		session.update(getTestUserEntity);
////		session.getTransaction().commit();
//		
//		
//////		delete data from database
////		session.beginTransaction();
////		session.delete(getTestUserEntity);
////		session.getTransaction().commit();
//		
//		
//////		other way to do a transaction:
////		Transaction txTransaction = session.beginTransaction();
////		
////		session.save(u1);
////		
////		txTransaction.commit();
//		
//		
////		close connection to database
//		session.close();
//		
//		
//		
//		System.out.println("hello world");
//		
//		
//	}
//
//}
