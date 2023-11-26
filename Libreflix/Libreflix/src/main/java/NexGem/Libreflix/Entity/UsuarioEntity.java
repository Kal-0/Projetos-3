package NexGem.Libreflix.Entity;

import java.util.ArrayList;
import java.util.List;

import NexGem.Libreflix.Entity.General.Assiste;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "USUARIOS")

public class UsuarioEntity implements GenericEntity<Long> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String nome;
	private String username;
	private String senha;
	@OneToMany(targetEntity = Assiste.class)
    private List<Assiste> videosAssistidos = new ArrayList<Assiste>();

	public UsuarioEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioEntity(Long id, String nome, String username, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.email = email;
		this.senha = senha;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Assiste> getVideosAssistidos() {
		return videosAssistidos;
	}
	public void setVideosAssistidos(ArrayList<Assiste> videosAssistidosArrayList) {
		this.videosAssistidos = videosAssistidosArrayList;
	}
	public void addVideoAssistido(Assiste videoAssistido) {
		videosAssistidos.add(videoAssistido);
	}
	public void removeVideoAssistido(Assiste videoAssistido) {
		videosAssistidos.remove(videoAssistido);
	}

	
	@Override
	public Long getPK() {
		
		return getId();
	}
}
