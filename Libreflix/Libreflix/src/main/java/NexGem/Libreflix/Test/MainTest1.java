package NexGem.Libreflix.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import NexGem.Libreflix.DAO.GeneralDAO;
import NexGem.Libreflix.DAO.Utils.JPAUtils;
import NexGem.Libreflix.Entity.EpisodioEntity;
import NexGem.Libreflix.Entity.SerieEntity;
import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.VideoEntity;
import NexGem.Libreflix.Entity.General.Assiste;
import NexGem.Libreflix.Entity.General.Categoria;
import NexGem.Libreflix.Entity.General.CategoriaClassificacaoIndicativa;
import NexGem.Libreflix.Entity.General.CategoriaGenero;
import NexGem.Libreflix.Entity.General.CategoriaTema;
import NexGem.Libreflix.Entity.General.CategoriaTipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UsuarioEntity u1 = new UsuarioEntity(null, "nome1", "username1", "email1", "senha1");
		UsuarioEntity u2 = new UsuarioEntity(null, "nome2", "username2", "email2", "senha2");
		
		VideoEntity v1 = new VideoEntity(null, "titulo1", "sub1", LocalDate.of(1999, 12, 31), "desc1", "url1", "permalink1", LocalTime.of(1, 45, 13));
		VideoEntity v2 = new VideoEntity(null, "titulo2", "sub2", LocalDate.of(2004, 12, 31), "desc2", "url2", "permalink2", LocalTime.of(2, 45, 13));
		
		
		
////		===generalDAO===
		
		GeneralDAO<UsuarioEntity, Long> uDao = GeneralDAO.getDao();
		GeneralDAO<SerieEntity, Long> sDao = GeneralDAO.getDao();
		GeneralDAO<VideoEntity, Long> vDao = GeneralDAO.getDao();
		GeneralDAO<EpisodioEntity, Long> eDao = GeneralDAO.getDao();
		GeneralDAO<Categoria, Long> cDao = GeneralDAO.getDao();
		GeneralDAO<Assiste, Long> aDao = GeneralDAO.getDao();
		
		uDao.save(u1);
		uDao.save(u2);
		
		UsuarioEntity uGet = uDao.findByPK(UsuarioEntity.class, 1L);
		System.out.println(uGet.getNome());
		
		String jpql = "SELECT u FROM UsuarioEntity u WHERE u.nome = :nome";
		jpql = jpql.replace(":nome", "'nome2'");
		
		List<UsuarioEntity> lu1 = uDao.findByJpql(UsuarioEntity.class, jpql);
		for (UsuarioEntity usuario : lu1) {
			System.out.println(usuario.getNome());
		}
		
		vDao.save(v1);
		vDao.save(v2);
		
		
		ArrayList<CategoriaGenero> cg1 = new ArrayList<CategoriaGenero>();
		ArrayList<CategoriaTema> ct1 = new ArrayList<CategoriaTema>();
		cg1.add(CategoriaGenero.ACAO);
		ct1.add(CategoriaTema.TECNOLOGIA);
		
		Categoria c1 = new Categoria(v1,CategoriaTipo.FILME, cg1, ct1, CategoriaClassificacaoIndicativa.R18);
		v1.setCategoria(c1);
		
		cDao.save(c1);
		vDao.update(v1);
		
		VideoEntity vGet = vDao.findByPK(VideoEntity.class, 1l);
		System.out.println(vGet.getCategoria().getTemas().get(0));
//		mediator: td vez q assistir tem q att o usuario e o video
		Assiste a1 = new Assiste(u1, v1, 40, 2);
		u1.addVideoAssistido(a1);
		v1.addVisualizacao(a1);
		
		aDao.save(a1);
		uDao.update(u1);
		vDao.update(v1);
		

		

		
//		===manual JPA===
//		EntityManager em = JPAUtils.getEntityManager();
//		
//		String jpql = "SELECT u FROM UsuarioEntity u WHERE u.nome = :nome";
//		jpql = jpql.replace(":nome", "'nome2'");
//		System.out.println(jpql);
//		Query query = em.createQuery(jpql, UsuarioEntity.class);
//		List<UsuarioEntity> lu1 = query.getResultList();
		
//		for (UsuarioEntity usuario : lu1) {
//			System.out.println(usuario.getNome());
//		}
		
		
//		em.getTransaction().begin();
//		
//		em.persist(u1);
//		em.persist(v1);
//		
//		em.getTransaction().commit();
//		em.close();
		
////		delete db
//		JPAUtils.closeEMF();
		
		
		
	}

}
