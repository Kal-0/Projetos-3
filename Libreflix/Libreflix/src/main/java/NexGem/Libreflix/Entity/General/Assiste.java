package NexGem.Libreflix.Entity.General;

import java.time.Duration;

import NexGem.Libreflix.Entity.GenericEntity;
import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.VideoEntity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "ASSISTES")
public class Assiste implements GenericEntity<Long>{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@ManyToOne
	private UsuarioEntity usuario;
	@ManyToOne
	private VideoEntity video;
	private Duration progresso;
	private int views;
	
	
	public Assiste() {
		// TODO Auto-generated constructor stub
	}
	
	public Assiste(UsuarioEntity usuario, VideoEntity video) {
		super();
		this.usuario = usuario;
		this.video = video;
		this.progresso = Duration.ofSeconds(0);
		this.views = 0;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	public VideoEntity getVideo() {
		return video;
	}
	public void setVideo(VideoEntity video) {
		this.video = video;
	}
	public Duration getProgresso() {
		return progresso;
	}
	public void setProgresso(Duration progresso) {
		this.progresso = progresso;
	}
	public int getPorcentagem() {
		return (int)(progresso.toSeconds() / (video.getDuracao().toSeconds() / 100));
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	
	
	public void addView() {
		views += 1;
	}

	@Override
	public Long getPK() {
		
		return getId();
	}
}
