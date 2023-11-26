//package NexGem.Libreflix.Test;
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//
//@Entity
//@Table(name = "USUARIOSTESTE")
//
//public class TestUserEntity {
////	auto increment pk
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String email;
//	private String nome;
//	private String username;
//	private String senha;
//	@OneToMany(targetEntity = TestItemEntity.class)
//	private List<TestItemEntity> itens = new ArrayList<TestItemEntity>();
//	@ManyToOne
//	@JoinColumn(name = "group_id", nullable = true)
//	private TestGroupEntity group;
//
//
//	public TestUserEntity() {}
//	public TestUserEntity( String nome, String username, String email, String senha) {
//		this.nome = nome;
//		this.username = username;
//		this.email = email;
//		this.senha = senha;
//	}
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getSenha() {
//		return senha;
//	}
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//	public List<TestItemEntity> getItens() {
//		return itens;
//	}
//	public void addItem(TestItemEntity item) {
//		item.setUser(this);
//		itens.add(item);
//	}
//	public TestGroupEntity getGroup() {
//		return group;
//	}
//	public void setGroup(TestGroupEntity group) {
//		this.group = group;
//	}
//	
//	
//	
//}
//
