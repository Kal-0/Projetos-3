package NexGem.Libreflix.Entity.General;

import java.util.ArrayList;

public class Categoria {
	private CategoriaTipo tipo;
	private ArrayList<CategoriaGenero> generos;
	private ArrayList<CategoriaTema> temas;
	private CategoriaClassificacaoIndicativa classificacaoIndicativa;
	
	
	public Categoria(CategoriaTipo tipo, ArrayList<CategoriaGenero> generos, ArrayList<CategoriaTema> temas,
			CategoriaClassificacaoIndicativa classificacaoIndicativa) {
		super();
		this.tipo = tipo;
		this.generos = generos;
		this.temas = temas;
		this.classificacaoIndicativa = classificacaoIndicativa;
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
