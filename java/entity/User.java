package entity;

public class User {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	private String gender;
	private String hobby;
	
	public User() {
		super();
	}

		
	
	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getHobby() {
		return hobby;
	}



	public void setHobby(String hobby) {
		this.hobby = hobby;
	}



	public User(int id, String userName, String password, String email, String gender, String hobby) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.hobby = hobby;
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
