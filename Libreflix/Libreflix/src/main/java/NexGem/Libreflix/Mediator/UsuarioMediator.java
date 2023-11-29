package NexGem.Libreflix.Mediator;

import java.util.List;

import NexGem.Libreflix.DAO.GeneralDAO;
import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.VideoEntity;
import NexGem.Libreflix.Entity.General.Assiste;

//singleton
public class UsuarioMediator {
	GeneralDAO<UsuarioEntity, Long> dao = GeneralDAO.getDao();
	
	
	private UsuarioMediator() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String save(UsuarioEntity entity) {
		String result = null;
		
		if(findByPk(entity.getPK()) == null) {
			dao.save(entity);
		}
		else {
			result = "usuario ja existente";
		}
		
		return result;
	}
	
	public String update(UsuarioEntity entity) {
		String result = null;
		
		if(findByPk(entity.getPK()) != null) {
			dao.update(entity);
		}
		else {
			result = "usuario nao existente";
		}
		
		return result;
	}
	
	public String remove(UsuarioEntity entity) {
		String result = null;
		
		if(findByPk(entity.getPK()) != null) {
			dao.remove(entity);
		}
		else {
			result = "usuario nao existente";
		}
		
		return result;
	}
	
	public UsuarioEntity findByPk(Long pk) {
		UsuarioEntity result = null;
		
		result = dao.findByPK(UsuarioEntity.class, pk);
		
		return result;
		
	}
	
	public List<UsuarioEntity> findAll(){
		List<UsuarioEntity> resultList = null;
		
		resultList = dao.findAll(UsuarioEntity.class);
		
		return resultList;
	}
	
	public List<UsuarioEntity> findByJpql(String jpql) {
		List<UsuarioEntity> resultList = null;
		
		resultList = dao.findByJpql(UsuarioEntity.class, jpql);
		
		return resultList;
	
	}
	
	public void assistir(UsuarioEntity usuario, VideoEntity video, int tempo) {
		
//		if(video not usuario.getVideosAssistidos())
		Assiste assiste = new Assiste(usuario, video, 0, 0);
		
		
	}
}
