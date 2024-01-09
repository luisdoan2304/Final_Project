package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import entity.User;

public class UserDAO {
	
	public boolean validateUser(User user){
		boolean isLogined = false;
		
		//connect DB MySQL
		Connection conn = null;
		String sql = "";
		ResultSet rs = null;
		try {
			 conn = MySQLConnUtils.getMySQLConnection();
			//execute SQL get ALL products from table products
				sql = "select * from user where user_name = ? and password = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getPassword());
				rs = ps.executeQuery();
				
				if(rs.next()) {
					isLogined = true;
					
				}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isLogined;
	}
}
