package NexGem.Libreflix.DAO;

import java.util.List;

public interface GenericDAO<T, PK> {
	
	
	public void save(T entity);
	public void update(T entity);
	public void remove(T entity);
	public T findByPK(Class<T> clazz, PK pk);
	public List<T> findAll(Class<T> clazz);
	public List<T> findByJpql(Class<T> clazz, String jpql);
}
