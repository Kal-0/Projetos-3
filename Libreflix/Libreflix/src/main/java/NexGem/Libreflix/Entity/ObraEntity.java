package NexGem.Libreflix.Entity;

import java.time.LocalDate;
import java.util.ArrayList;

import NexGem.Libreflix.Entity.General.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class ObraEntity {
	@Id
	private long id;
	private String titulo;
	private String subtitulo;
	private LocalDate anoDeProducao;
	private Categoria categoria;
	private String descricao;
	private int views;
	private double avalicaoMedia;
	private ArrayList<String> comentarios;
	private String url;
	private String permalink;
	private Byte thumbNailImg;
	private Byte backGroungImg;
	
	
	public ObraEntity(long id, String titulo, String subtitulo, LocalDate anoDeProducao,
			String descricao, String url, String permalink) {
		
		this.id = id;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.anoDeProducao = anoDeProducao;
		this.descricao = descricao;
		this.url = url;
		this.permalink = permalink;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public LocalDate getAnoDeProducao() {
		return anoDeProducao;
	}
	public void setAnoDeProducao(LocalDate anoDeProducao) {
		this.anoDeProducao = anoDeProducao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public double getAvalicaoMedia() {
		return avalicaoMedia;
	}
	public void setAvalicaoMedia(double avalicaoMedia) {
		this.avalicaoMedia = avalicaoMedia;
	}
	public ArrayList<String> getComentarios() {
		return comentarios;
	}
	public void setComentarios(ArrayList<String> comentarios) {
		this.comentarios = comentarios;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	public Byte getThumbNailImg() {
		return thumbNailImg;
	}
	public void setThumbNailImg(Byte thumbNailImg) {
		this.thumbNailImg = thumbNailImg;
	}
	public Byte getBackGroungImg() {
		return backGroungImg;
	}
	public void setBackGroungImg(Byte backGroungImg) {
		this.backGroungImg = backGroungImg;
	}
	
	
	
	public void addView() {
		views += 1;
	}
	
}
