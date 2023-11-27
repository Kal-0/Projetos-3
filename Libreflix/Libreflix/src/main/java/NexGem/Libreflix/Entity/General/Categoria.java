package NexGem.Libreflix.Entity.General;

import java.util.ArrayList;
import java.util.List;

import NexGem.Libreflix.Entity.ObraEntity;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {
	@Id
	private Long id;
	@OneToOne(targetEntity = ObraEntity.class)
	private ObraEntity obra;	
	@Enumerated(EnumType.STRING)
	private CategoriaTipo tipo;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "CATEGORIAS_GENEROS")
	@Enumerated(EnumType.STRING)
	private List<CategoriaGenero> generos = new ArrayList<CategoriaGenero>();
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "CATEGORIAS_TIPOS")
	@Enumerated(EnumType.STRING)
	private List<CategoriaTema> temas = new ArrayList<CategoriaTema>();
	@Enumerated(EnumType.STRING)
	private CategoriaClassificacaoIndicativa classificacaoIndicativa;
	
	public Categoria() {
		
	}
	
	public Categoria(ObraEntity obra, CategoriaTipo tipo, List<CategoriaGenero> generos, List<CategoriaTema> temas,
			CategoriaClassificacaoIndicativa classificacaoIndicativa) {
		super();
		this.id = obra.getPK();
		this.obra = obra;
		this.tipo = tipo;
		this.generos = generos;
		this.temas = temas;
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ObraEntity getObra() {
		return obra;
	}
	public void setObra(ObraEntity obra) {
		this.obra = obra;
	}
	public CategoriaTipo getTipo() {
		return tipo;
	}
	public void setTipo(CategoriaTipo tipo) {
		this.tipo = tipo;
	}
	public List<CategoriaGenero> getGeneros() {
		return generos;
	}
	public void setGeneros(List<CategoriaGenero> generos) {
		this.generos = generos;
	}
	public void addGenero(CategoriaGenero genero) {
		generos.add(genero);
	}
	public void removeGenero(CategoriaGenero genero) {
		generos.remove(genero);
	}
	public List<CategoriaTema> getTemas() {
		return temas;
	}
	public void setTemas(List<CategoriaTema> temas) {
		this.temas = temas;
	}
	public void addTema(CategoriaTema tema) {
		temas.add(tema);
	}
	public void removeGenero(CategoriaTema tema) {
		temas.remove(tema);
	}
	public CategoriaClassificacaoIndicativa getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	public void setClassificacaoIndicativa(CategoriaClassificacaoIndicativa classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	
}
