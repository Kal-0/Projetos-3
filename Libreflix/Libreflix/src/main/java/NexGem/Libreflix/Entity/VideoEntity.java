package NexGem.Libreflix.Entity;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import NexGem.Libreflix.Entity.General.Assiste;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "VIDEOS")
public class VideoEntity extends ObraEntity{
	private Duration duracao;
	
	@OneToMany(targetEntity = Assiste.class)
	private List<Assiste> visualizacoes = new ArrayList<>();
	
	public VideoEntity() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public VideoEntity(Long id, String titulo, String subtitulo, LocalDate anoDeProducao,
			String descricao, String url, String permalink, Duration duracao) {
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
	
	
	public Duration getDuracao() {
		return duracao;
	}
	public void setDuracaoTime(Duration duracao) {
		this.duracao = duracao;
	}
	public List<Assiste> getVisualizacoes(){
		return visualizacoes;
	}
	public void addVisualizacao(Assiste visualizacao) {
		visualizacoes.add(visualizacao);
	}
	public void removerVisualizacao(Assiste visualizacao) {
		visualizacoes.remove(visualizacao);
	}
	
	
	
	
}
