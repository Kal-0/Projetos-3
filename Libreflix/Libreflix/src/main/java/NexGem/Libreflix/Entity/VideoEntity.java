package NexGem.Libreflix.Entity;

import java.sql.Time;

public class VideoEntity extends ObraEntity{
	private Time duracao;
	
	
	public VideoEntity(ObraEntity obra, Time duracao) {
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
		
		this.duracao = duracao;
	}
	
	
	public Time getDuracao() {
		return duracao;
	}
	public void setDuracaoTime(Time duracao) {
		this.duracao = duracao;
	}
	
	
	
}
