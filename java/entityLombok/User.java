package entityLombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	private String gender;
	private String hobby;
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	
	




	



	
	
}
