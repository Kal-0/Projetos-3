package NexGem.Libreflix.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class EpisodioEntity extends VideoEntity{
	private SerieEntity serie;
	private int temporada;
	
	
	public EpisodioEntity(long id, String titulo, String subtitulo, LocalDate anoDeProducao,
			String descricao, String url, String permalink, LocalTime duracao, SerieEntity serie, int temporada) {
		super(
				id,
				titulo,
				subtitulo,
				anoDeProducao,
				descricao,
				url,
				permalink,
				duracao
		);
		
		this.serie = serie;
		this.temporada = temporada;
	}
	
	
	public SerieEntity getSerie() {
		return serie;
	}
	public void setSerie(SerieEntity serie) {
		this.serie = serie;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	public void addView() {
		super.addView();
		serie.addView();
	}
	
}
