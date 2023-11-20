package NexGem.Libreflix.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;

@Entity
public class VideoEntity extends ObraEntity{
	private LocalTime duracao;
	
	
	public VideoEntity(long id, String titulo, String subtitulo, LocalDate anoDeProducao,
			String descricao, String url, String permalink, LocalTime duracao) {
		super(
				id,
				titulo,
				subtitulo,
				anoDeProducao,
				descricao,
				url,
				permalink
			);
		
		this.duracao = duracao;
	}
	
	
	public LocalTime getDuracao() {
		return duracao;
	}
	public void setDuracaoTime(LocalTime duracao) {
		this.duracao = duracao;
	}
	
	
	
}
