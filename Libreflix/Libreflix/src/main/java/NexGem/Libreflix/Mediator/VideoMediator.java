package NexGem.Libreflix.Mediator;

import java.util.List;

import NexGem.Libreflix.DAO.GeneralDAO;
import NexGem.Libreflix.Entity.VideoEntity;

public class VideoMediator {
	public static VideoMediator mediator = null;
	private GeneralDAO<VideoEntity, Long> dao = new GeneralDAO<>();
	AssisteMediator aMed = AssisteMediator.getMediator();
	
	private VideoMediator() {
		// TODO Auto-generated constructor stub
	}
	
	public static VideoMediator getMediator() {
		if(mediator == null) {
			mediator = new VideoMediator();
		}
		
		return mediator;
	}
	
	public String save(VideoEntity entity) {
		dao.openSession();
		
		String result = null;
		
		if(findByPk(entity.getPK()) == null) {
			dao.save(entity);
		}
		else {
			result = "Video ja existente";
		}
		
		
		dao.closeSession();
		return result;
	}
	
	public String update(VideoEntity entity) {
		dao.openSession();
		
		String result = null;
		
		if(dao.findByPK(VideoEntity.class, entity.getPK()) != null) {
			dao.update(entity);
		}
		else {
			result = "Video nao existente";
		}
		
		
		dao.closeSession();
		return result;
	}
	
	public String remove(VideoEntity entity) {
		dao.openSession();
		
		String result = null;
		
		if(findByPk(entity.getPK()) != null) {
			dao.remove(entity);
		}
		else {
			result = "Video nao existente";
		}
		
		
		dao.closeSession();
		return result;
	}
	
	public VideoEntity findByPk(Long pk) {
		dao.openSession();
		
		VideoEntity result = null;
		
		result = dao.findByPK(VideoEntity.class, pk);
		
//		load-lazyLoads
		result.getComentarios();
		result.getVisualizacoes();
		
		dao.closeSession();
		return result;
	}
	
	public List<VideoEntity> findAll(){
		dao.openSession();
		
		List<VideoEntity> resultList = null;
		
		resultList = dao.findAll(VideoEntity.class);
		
//		load-lazyLoads
		for(VideoEntity entity : resultList) {
			entity.getComentarios();
			entity.getVisualizacoes();
		}
		
		dao.closeSession();
		return resultList;
	}
	
	public List<VideoEntity> findByJpql(String jpql) {
		dao.openSession();
		
		List<VideoEntity> resultList = null;
		
		resultList = dao.findByJpql(VideoEntity.class, jpql);
		
//		load-lazyLoads
		for(VideoEntity entity : resultList) {
			entity.getComentarios();
			entity.getVisualizacoes();
		}
		
		dao.closeSession();
		return resultList;
	
	}
	
	
	
	
}