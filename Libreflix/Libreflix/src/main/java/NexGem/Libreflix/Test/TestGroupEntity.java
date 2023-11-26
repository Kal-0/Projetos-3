//package NexGem.Libreflix.Test;
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class TestGroupEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	private String name;
//	@OneToMany(targetEntity = TestUserEntity.class, cascade = CascadeType.ALL)
//	private List<TestUserEntity> users = new ArrayList<TestUserEntity>();
//	
//	public TestGroupEntity() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//	
//	
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void addUser(TestUserEntity user) {
//		user.setGroup(this);
//		users.add(user);
//	}
//	public void removeUser(TestUserEntity user) {
//		users.remove(user);
//	}
//	
//}
