package NexGem.Libreflix.Entity;

public class EpisodioEntity extends VideoEntity{
	private SerieEntity serie;
	private int temporada;
	
	
	public EpisodioEntity(ObraEntity obra, VideoEntity video, SerieEntity serie, int temporada) {
		super(
			obra, 
			video.getDuracao()
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
	
	
	
}
