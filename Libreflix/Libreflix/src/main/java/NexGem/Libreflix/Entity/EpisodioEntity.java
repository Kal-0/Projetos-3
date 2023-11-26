package NexGem.Libreflix.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EPISODIOS")
public class EpisodioEntity extends VideoEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne()
	private SerieEntity serie;
	private int temporada;
	
	
	public EpisodioEntity(Long id, String titulo, String subtitulo, LocalDate anoDeProducao,
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
	
	@Override
	public void addView() {
		super.addView();
		serie.addView();
	}
	
}
