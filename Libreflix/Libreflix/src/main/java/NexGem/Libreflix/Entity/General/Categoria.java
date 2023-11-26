package NexGem.Libreflix.Entity.General;

import java.util.ArrayList;

import NexGem.Libreflix.Entity.ObraEntity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Categoria {
	@Id
	private Long id;
	@OneToOne(targetEntity = ObraEntity.class)
	private ObraEntity obra;	
	private CategoriaTipo tipo;
	private ArrayList<CategoriaGenero> generos;
	private ArrayList<CategoriaTema> temas;
	private CategoriaClassificacaoIndicativa classificacaoIndicativa;
	
	public Categoria() {
		
	}
	
	public Categoria(ObraEntity obra, CategoriaTipo tipo, ArrayList<CategoriaGenero> generos, ArrayList<CategoriaTema> temas,
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
	public ArrayList<CategoriaGenero> getGeneros() {
		return generos;
	}
	public void setGeneros(ArrayList<CategoriaGenero> generos) {
		this.generos = generos;
	}
	public ArrayList<CategoriaTema> getTemas() {
		return temas;
	}
	public void setTemas(ArrayList<CategoriaTema> temas) {
		this.temas = temas;
	}
	public CategoriaClassificacaoIndicativa getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	public void setClassificacaoIndicativa(CategoriaClassificacaoIndicativa classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	
}
