package NexGem.Libreflix.Mediator;

import java.util.List;

import NexGem.Libreflix.DAO.GeneralDAO;
import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.General.Assiste;

public class AssisteMediator extends Exception{
	public static AssisteMediator mediator = null;
	GeneralDAO<Assiste, Long> dao = new GeneralDAO<>();
	
	
	private AssisteMediator() {
		// TODO Auto-generated constructor stub
	}
	
	public static AssisteMediator getMediator() {
		if(mediator == null) {
			mediator = new AssisteMediator();
		}
		
		return mediator;
	}
	
	public String save(Assiste entity) {
		dao.openSession();
		String result = null;
		if(entity.getPK() != null) {
			if(findByPk(entity.getPK()) != null) {
				result = "Assiste ja existente";
			}
		}
		else {
			dao.save(entity);
			
		}
		
		
		dao.closeSession();
		return result;
	}
	
	public String update(Assiste entity) {
		dao.openSession();

		String result = null;
		
		if(dao.findByPK(Assiste.class, entity.getPK()) != null) {
			dao.update(entity);
		}
		else {
			result = "Assiste nao existente";
		}
		
		dao.closeSession();
		return result;
	}
	
	public String remove(Assiste entity) {
		dao.openSession();
		
		String result = null;
		
		if(findByPk(entity.getPK()) != null) {
			dao.remove(entity);
		}
		else {
			result = "Assiste nao existente";
		}
		
		dao.closeSession();
		return result;
	}
	
	public Assiste findByPk(Long pk) {
		dao.openSession();
		
		Assiste result = null;
		
		result = dao.findByPK(Assiste.class, pk);
		
//		load-lazyLoads
		
		dao.closeSession();
		return result;
	}
	
	public List<Assiste> findAll(){
		dao.openSession();

		List<Assiste> resultList = null;
		
		resultList = dao.findAll(Assiste.class);
		
//		load-lazyLoads
//		for(Assiste entity : resultList) {
//		}

		dao.closeSession();
		return resultList;
	}
	
	public List<Assiste> findByJpql(String jpql) {
		dao.openSession();
		
		List<Assiste> resultList = null;
		
		resultList = dao.findByJpql(Assiste.class, jpql);
		
//		load-lazyLoads
//		for(Assiste entity : resultList) {
//		}
		
		dao.closeSession();
		return resultList;
	}
	
	
}
