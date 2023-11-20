package NexGem.Libreflix.Entity;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.Entity;

@Entity
public class SerieEntity extends ObraEntity{
	private int numeroDeTemporadas;
	private int numeroDeEpisodios;
	ArrayList<EpisodioEntity> episodios;
	
	
	public SerieEntity(long id, String titulo, String subtitulo, LocalDate anoDeProducao,
			String descricao, String url, String permalink, int numeroDeTemporadas, int numeroDeEpisodios,
			ArrayList<EpisodioEntity> episodios) {
		super(
				id,
				titulo,
				subtitulo,
				anoDeProducao,
				descricao,
				url,
				permalink
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
