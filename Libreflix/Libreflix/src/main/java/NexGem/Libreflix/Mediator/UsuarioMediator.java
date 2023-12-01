package NexGem.Libreflix.Mediator;

import java.time.Duration;
import java.util.List;

import org.hibernate.Hibernate;

import NexGem.Libreflix.DAO.GeneralDAO;
import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.VideoEntity;
import NexGem.Libreflix.Entity.General.Assiste;



//singleton
public class UsuarioMediator {
	public static UsuarioMediator mediator = null;
	private GeneralDAO<UsuarioEntity, Long> dao = new GeneralDAO<>();
	VideoMediator vMed = VideoMediator.getMediator();
	AssisteMediator aMed = AssisteMediator.getMediator();
	
	private UsuarioMediator() {
		// TODO Auto-generated constructor stub
	}
	
	public static UsuarioMediator getMediator() {
		if(mediator == null) {
			mediator = new UsuarioMediator();
		}
		
		return mediator;
	}
	
	public String save(UsuarioEntity entity) {
		dao.openSession();
		String result = null;
		
		if(findByPk(entity.getPK()) == null) {
			dao.save(entity);
		}
		else {
			result = "usuario ja existente";
		}
		
		dao.closeSession();
		return result;
	}
	
	public String update(UsuarioEntity entity) {
		dao.openSession();
		String result = null;
		
//		if(dao.findByPK(UsuarioEntity.class, entity.getPK()) != null) {
			dao.update(entity);
//		}
//		else {
//			result = "usuario nao existente";
//		}
		dao.closeSession();
		return result;
	}
	
	public String remove(UsuarioEntity entity) {
		dao.openSession();
		String result = null;
		
		if(findByPk(entity.getPK()) != null) {
			dao.remove(entity);
		}
		else {
			result = "usuario nao existente";
		}
		
		dao.closeSession();
		return result;
	}
	
	public UsuarioEntity findByPk(Long pk) {
		dao.openSession();
		UsuarioEntity result = null;
		
		result = dao.findByPK(UsuarioEntity.class, pk);
		
//		load-lazyLoads
		Hibernate.initialize(result.getVideosAssistidos());
		
		
		dao.closeSession();
		return result;
	}
	
	public List<UsuarioEntity> findAll(){
		dao.openSession();
		List<UsuarioEntity> resultList = null;
		
		resultList = dao.findAll(UsuarioEntity.class);
		
//		load-lazyLoads
		for(UsuarioEntity entity : resultList) {
			entity.getVideosAssistidos();
		}
		
		dao.closeSession();
		return resultList;
	}
	
	public List<UsuarioEntity> findByJpql(String jpql) {
		dao.openSession();
		List<UsuarioEntity> resultList = null;
		
		resultList = dao.findByJpql(UsuarioEntity.class, jpql);
		
//		load-lazyLoads
		for(UsuarioEntity entity : resultList) {
			Hibernate.initialize(entity.getVideosAssistidos());
		}
		
		dao.openSession();
		return resultList;
	}
	
	
	public String assistir(UsuarioEntity usuario, VideoEntity video, Duration tempoAssistido) {
		String result = null;
		
		Assiste assiste = null;
		boolean exists = false;
		
//		verifica se ja assistiu
		for(Assiste videoAssitido : usuario.getVideosAssistidos()) {
			if(videoAssitido.getVideo().getPK() == video.getPK()) {
				exists = true;
				assiste = videoAssitido;
			}
		}
		
//		se ainda nao viu, cria um Assiste
		if(exists == false) {
			assiste = new Assiste(usuario, video);
			usuario.addVideoAssistido(assiste);
			video.addVisualizacao(assiste);
			
			aMed.save(assiste);
			vMed.update(video);
			update(usuario);
			
		}
		
		
//		assiste
		Duration progresso = assiste.getProgresso();
		Long restante = video.getDuracao().toSeconds() - progresso.toSeconds();
		
		if(restante - tempoAssistido.toSeconds() < 0) {
			result = "tempo assistido ultrapassa o tempo restante do video";
		}
		else {
			
//			voltando a assistir depois de contabilizar view
			boolean finalizado = false;
			if(assiste.getPorcentagem()>=80) {
				finalizado = true;
			}
			
//			atualizando progresso
			progresso = progresso.plus(tempoAssistido);
			assiste.setProgresso(progresso);
			
//			voltando a assistir sem ter contabilizado view
			if(assiste.getPorcentagem()>=80 && finalizado == false) {
				assiste.addView();
			}
			
//			resetando progresso
			if(assiste.getPorcentagem() == 100) {
				assiste.setProgresso(Duration.ofHours(0).plusMinutes(0).plusSeconds(0));
			}
			
			aMed.update(assiste);
		}
		return result;
	}
}
