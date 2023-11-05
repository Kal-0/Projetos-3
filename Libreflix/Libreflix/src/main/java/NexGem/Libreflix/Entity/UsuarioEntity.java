package NexGem.Libreflix.Entity;

import java.util.ArrayList;

import NexGem.Libreflix.Entity.General.Assiste;

public class UsuarioEntity {
	private String nome;
	private String username;
	private String email;
	private String senha;
	private ArrayList<Assiste> videosAssistidosArrayList;

	
	public UsuarioEntity(String nome, String username, String email, String senha,
			ArrayList<Assiste> videosAssistidosArrayList) {

		this.nome = nome;
		this.username = username;
		this.email = email;
		this.senha = senha;
		this.videosAssistidosArrayList = videosAssistidosArrayList;
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
	public ArrayList<Assiste> getVideosAssistidosArrayList() {
		return videosAssistidosArrayList;
	}
	public void setVideosAssistidosArrayList(ArrayList<Assiste> videosAssistidosArrayList) {
		this.videosAssistidosArrayList = videosAssistidosArrayList;
	}
	
	
}
