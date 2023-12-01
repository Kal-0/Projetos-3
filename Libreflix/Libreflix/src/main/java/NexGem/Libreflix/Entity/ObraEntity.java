package NexGem.Libreflix.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import NexGem.Libreflix.Entity.General.Categoria;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OBRAS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ObraEntity implements GenericEntity<Long>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String subtitulo;
	private LocalDate anoDeProducao;
	@OneToOne
	private Categoria categoria;
	private String descricao;
	private int views;
	private double avalicaoMedia;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "OBRAS_COMENTARIOS")
	private List<String> comentarios = new ArrayList<String>();
	private String url;
	private String permalink;
	private Byte thumbNailImg;
	private Byte backGroungImg;
	
	public ObraEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public ObraEntity(Long id, String titulo, String subtitulo, LocalDate anoDeProducao,
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
		categoria.setObra(this);
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
	public List<String> getComentarios() {
		return (List<String>)comentarios;
	}
	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}
	public void addComentario(String comentario) {
		comentarios.add(comentario);
	}
	public void removeComentario(String comentario) {
		comentarios.remove(comentario);
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
	
	@Override
	public Long getPK() {
		
		return getId();
	}
	
	public void addView() {
		views += 1;
	}
	
}
