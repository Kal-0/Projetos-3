package NexGem.Libreflix.Entity;

import java.util.ArrayList;


public class SerieEntity extends ObraEntity{
	private int numeroDeTemporadas;
	private int numeroDeEpisodios;
	ArrayList<EpisodioEntity> episodios;
	
	
	public SerieEntity(ObraEntity obra,int numeroDeTemporadas, int numeroDeEpisodios,
			ArrayList<EpisodioEntity> episodios) {
		super(
				obra.getId(),
				obra.getTitulo(),
				obra.getSubtitulo(), 
				obra.getAnoDeProducao(),
				obra.getCategoria(), 
				obra.getDescricao(),
				obra.getViews(),
				obra.getAvalicaoMedia(),
				obra.getComentarios(),
				obra.getUrl(),
				obra.getPermalink(),
				obra.getThumbNailImg(),
				obra.getBackGroungImg()
			);
		
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.numeroDeEpisodios = numeroDeEpisodios;
		this.episodios = episodios;
	}
	
	
	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	public int getNumeroDeEpisodios() {
		return numeroDeEpisodios;
	}
	public void setNumeroDeEpisodios(int numeroDeEpisodios) {
		this.numeroDeEpisodios = numeroDeEpisodios;
	}
	public ArrayList<EpisodioEntity> getEpisodios() {
		return episodios;
	}
	public void setEpisodios(ArrayList<EpisodioEntity> episodios) {
		this.episodios = episodios;
	}
	
	
	
}
