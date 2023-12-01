package NexGem.Libreflix.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import NexGem.Libreflix.DAO.GeneralDAO;
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
import NexGem.Libreflix.Mediator.AssisteMediator;
import NexGem.Libreflix.Mediator.UsuarioMediator;
import NexGem.Libreflix.Mediator.VideoMediator;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////	===generalDAO===
		
	GeneralDAO<UsuarioEntity, Long> uDao = new GeneralDAO<>();
	GeneralDAO<SerieEntity, Long> sDao = new GeneralDAO<>();
	GeneralDAO<VideoEntity, Long> vDao = new GeneralDAO<>();
	GeneralDAO<EpisodioEntity, Long> eDao = new GeneralDAO<>();
	GeneralDAO<Categoria, Long> cDao = new GeneralDAO<>();
	GeneralDAO<Assiste, Long> aDao = new GeneralDAO<>();
	
	UsuarioMediator uMed = UsuarioMediator.getMediator();
	VideoMediator vMed = VideoMediator.getMediator();
	AssisteMediator aMed = AssisteMediator.getMediator();
		
		
		UsuarioEntity u1 = new UsuarioEntity(null, "nome1", "username1", "email1", "senha1");
		UsuarioEntity u2 = new UsuarioEntity(null, "nome2", "username2", "email2", "senha2");
		uDao.openSession();
		uDao.save(u1);
		uDao.save(u2);
		uDao.closeSession();
		
		VideoEntity v1 = new VideoEntity(null, "titulo1", "sub1", LocalDate.of(1999, 12, 31), "desc1", "url1", "permalink1", Duration.ofHours(1).plusMinutes(45).plusSeconds(30));
		VideoEntity v2 = new VideoEntity(null, "titulo2", "sub2", LocalDate.of(2004, 12, 31), "desc2", "url2", "permalink2", Duration.ofHours(1).plusMinutes(45).plusSeconds(30));
		vDao.openSession();
		vDao.save(v1);
		vDao.save(v2);
		vDao.closeSession();
		
		ArrayList<CategoriaGenero> cg1 = new ArrayList<CategoriaGenero>();
		ArrayList<CategoriaTema> ct1 = new ArrayList<CategoriaTema>();
		cg1.add(CategoriaGenero.ACAO);
		ct1.add(CategoriaTema.TECNOLOGIA);
		
		Categoria c1 = new Categoria(v1,CategoriaTipo.FILME, cg1, ct1, CategoriaClassificacaoIndicativa.R18);
		v1.setCategoria(c1);
		
		cDao.openSession();
		cDao.save(c1);
		cDao.closeSession();
		
		vDao.openSession();
		vDao.update(v1);
		vDao.closeSession();
		
		
		uMed.assistir(u1, v1, Duration.ofHours(1).plusMinutes(10).plusSeconds(10));
		uMed.assistir(u1, v1, Duration.ofHours(0).plusMinutes(20).plusSeconds(20));
		uMed.assistir(u2, v2, Duration.ofHours(1).plusMinutes(45).plusSeconds(30));
		
//		Assiste assiste = new Assiste(u2, v2);
//		Assiste assiste2 = new Assiste(u1, v2);
		
//		aMed.save(assiste);
//		aMed.save(assiste2);
//		u2.addVideoAssistido(assiste);
//		v2.addVisualizacao(assiste);
		
//		
		for(Assiste vass: v2.getVisualizacoes()) {
			System.out.println(vass.getId());
		}
		
//		uMed.update(u2);
//		vMed.update(v2);
//		v2.addVisualizacao(assiste2);
//		vMed.update(v2);
		
//		UsuarioEntity uGet = uMed.findByPk(2l);
//		
//		System.out.println(uGet.getId());
//		System.out.println(uGet.getVideosAssistidos().get(0).getProgresso());
//		System.out.println(uGet.getVideosAssistidos().get(0).getPorcentagem());
	}

}
