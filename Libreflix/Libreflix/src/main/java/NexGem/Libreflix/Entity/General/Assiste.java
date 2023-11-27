package NexGem.Libreflix.Entity.General;

import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.VideoEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "ASSISTES")
public class Assiste {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@ManyToOne
	private UsuarioEntity usuario;
	@ManyToOne
	private VideoEntity video;
	private int porcentagem;
	private int views;
	
	
	public Assiste() {
		// TODO Auto-generated constructor stub
	}
	
	public Assiste(UsuarioEntity usuario, VideoEntity video, int porcentagem, int views) {
		super();
		this.usuario = usuario;
		this.video = video;
		this.porcentagem = porcentagem;
		this.views = views;
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
	public int getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
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
}
