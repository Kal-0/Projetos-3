package NexGem.Libreflix.DAO;

import java.util.List;

import NexGem.Libreflix.DAO.Utils.JPAUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;



//singleton
public class GeneralDAO<T,PK> implements GenericDAO<T, PK>{
	public static GeneralDAO<?,?> dao = null;
	private EntityManager em;
	
	
	private GeneralDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized <T,PK> GeneralDAO<T,PK> getDao() {
		if(dao == null) {
			dao = new GeneralDAO<>();
			
		}
		
		return (GeneralDAO<T,PK>)dao;
	}
	
	
//	implements
	@Override
	public void save(T entity) {
		em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}
	@Override
	public void update(T entity) {
		em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();
	}
	@Override
	public void remove(T entity) {
		em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
		em.close();
	}
	@Override
	public T findByPK(Class<T> clazz, PK pk) {
		T foundEntity;
		
		em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
//		System.out.println(clazz.getName());
		foundEntity = em.find(clazz, pk);
		em.getTransaction().commit();
		em.close();
		
		return foundEntity;
	}
	@Override
	public List<T> findAll(Class<T> clazz) {
		List<T> result;
		String jpql = "SELECT x FROM :class x";
		jpql = jpql.replace(":class", clazz.getName());
		
		em = JPAUtils.getEntityManager();
		Query query = em.createQuery(jpql, clazz);
		result = query.getResultList();
		em.close();
		
		return result;
	}
	@Override
	public List<T> findByJpql(Class<T> clazz, String jpql) {
		List<T> result;
		
		em = JPAUtils.getEntityManager();
		Query query = em.createQuery(jpql, clazz);
		result = query.getResultList();
		em.close();
		
		return result;
	}
	
}
