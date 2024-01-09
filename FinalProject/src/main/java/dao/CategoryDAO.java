package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Category;
import entity.Product;

public class CategoryDAO {
	
	public List<Category> getAllCategories(){
		List<Category> list = new ArrayList<Category>();
		//connect DB MySQL
		Connection conn = null;
		String sql = "";
		ResultSet rs = null;
		try {
			 conn = MySQLConnUtils.getMySQLConnection();
			//execute SQL get ALL products from table products
				sql = "select * from category order by priority";
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int priority = rs.getInt("priority");
					
					Category category = new Category(id, name, priority);
					
					list.add(category);
				}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
