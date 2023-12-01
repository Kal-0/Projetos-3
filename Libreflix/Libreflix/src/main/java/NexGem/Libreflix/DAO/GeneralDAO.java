package NexGem.Libreflix.DAO;

import java.util.List;

import org.hibernate.Hibernate;

import NexGem.Libreflix.DAO.Utils.JPAUtils;
import NexGem.Libreflix.Entity.GenericEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;



public class GeneralDAO<T extends GenericEntity<PK>,PK> implements GenericDAO<T, PK>{
	private EntityManager em;
	
	
	public GeneralDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void openSession() {
		if(em == null || em.isOpen() == false) {
			em = JPAUtils.getEntityManager();
			em.getTransaction().begin();
		}
	}
	
	public void closeSession() {
		if(em.isOpen() == true) {
			em.getTransaction().commit();
			em.close();
		}
	}
	
//	implements
	@Override
	public void save(T entity) {
		em.persist(entity);
	}
	@Override
	public void update(T entity) {
		em.merge(entity);
	}
	@Override
	public void remove(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}
	@Override
	public T findByPK(Class<T> clazz, PK pk) {
		T foundEntity;
		
//		System.out.println(clazz.getName());
		foundEntity = em.find(clazz, pk); 
		
		return foundEntity;
	}
	@Override
	public List<T> findAll(Class<T> clazz) {
		List<T> result;
		String jpql = "SELECT x FROM :class x";
		jpql = jpql.replace(":class", clazz.getName());
		
		Query query = em.createQuery(jpql, clazz);
		result = query.getResultList();
		
		return result;
	}
	@Override
	public List<T> findByJpql(Class<T> clazz, String jpql) {
		List<T> result;
		
		
		Query query = em.createQuery(jpql, clazz);
		result = query.getResultList();
		
		return result;
	}
	
}
