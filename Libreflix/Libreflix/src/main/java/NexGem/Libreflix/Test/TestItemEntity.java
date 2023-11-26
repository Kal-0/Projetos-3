//package NexGem.Libreflix.Test;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
//
//@Entity
//public class TestItemEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	private String name;
//	@ManyToOne
//	@JoinColumn(name = "user_id", nullable = true)
//	private TestUserEntity user;
//	
//	public TestItemEntity() {
//		super();
//	}
//
//	
//	
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	public TestUserEntity getUser() {
//		return user;
//	}
//	public void setUser(TestUserEntity user) {
//		this.user = user;
//	}
//	
//}
