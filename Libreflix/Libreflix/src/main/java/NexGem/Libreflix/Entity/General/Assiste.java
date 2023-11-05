package NexGem.Libreflix.Entity.General;

import NexGem.Libreflix.Entity.UsuarioEntity;
import NexGem.Libreflix.Entity.VideoEntity;

public class Assiste {
	private UsuarioEntity usuario;
	private VideoEntity video;
	private int porcentagem;
	private int views;
	
	
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
