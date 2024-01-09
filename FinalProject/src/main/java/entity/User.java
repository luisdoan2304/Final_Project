package entity;

public class User {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	
	public User() {
		super();
	}

		
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public User(int id, String userName, String password, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
