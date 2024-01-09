package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class ProductDAO {
		
	public List<Product> getLatestProducts(){
		List<Product> list = new ArrayList<Product>();
		//connect DB MySQL
		Connection conn = null;
		String sql = "";
		ResultSet rs = null;
		try {
			 conn = MySQLConnUtils.getMySQLConnection();
			//execute SQL get ALL products from table products
				sql = "select * from product where is_new = 1";
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int price = rs.getInt("price");
					String imgName =  rs.getString("img_Name");
					boolean isNew = rs.getBoolean("is_new");
					int quantity = rs.getInt("quantity");
					String description = rs.getString("description");
					
					Product product = new Product(id, name, price, imgName, isNew, quantity, description);
					
					list.add(product);
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


	public static Product getProductById(int productId) throws SQLException {
		Connection conn = null;;
		try {
			conn = MySQLConnUtils.getMySQLConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String SQL = "select * from product where id = ?";

		PreparedStatement preStmt = conn.prepareStatement(SQL);
		preStmt.setInt(1, productId);

		ResultSet rs = preStmt.executeQuery();

		if (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			String imgName = rs.getString("img_name");
			boolean isNew=rs.getBoolean("is_new");
			int quantity = rs.getInt("quantity");
			String description = rs.getString("description");


			return new Product(id, name, price, imgName, isNew, quantity, description);
		}
		return null;
}
	
	public static List<Product> showAllProducts() throws SQLException {
		Connection conn = null;
		try {
			conn = MySQLConnUtils.getMySQLConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement stmt = conn.createStatement();

		String showProductSQL = "select * from product";
		ResultSet resultSet = stmt.executeQuery(showProductSQL);

		List<Product> list = new ArrayList<Product>();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int price = resultSet.getInt("price");
			String imgName = resultSet.getString("img_name");
			boolean isNew=resultSet.getBoolean("is_new");
			Product product = new Product(id, name, price, imgName,isNew);
			list.add(product);
		}
		return list;
	}
	
	public  List<Product> getProductByCategoryId(String categoryId) throws SQLException {
		Connection conn = null;
		try {
			conn = MySQLConnUtils.getMySQLConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//String SQL = "Select * from product Where category_id = " + categoryId;
		
		String SQL = "Select * from product Where category_id = ?";

		PreparedStatement preStmt = conn.prepareStatement(SQL);
		//'100%20or%202=2'
		preStmt.setString(1, categoryId);
		
		ResultSet rs = preStmt.executeQuery();

		List<Product> list = new ArrayList<Product>();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			String imgName = rs.getString("img_name");
			Product product = new Product(id, name, price, imgName);
			list.add(product);
		}
		return list;
	}
	
	public List<Product> getAllProducts(){
		List<Product> list = new ArrayList<Product>();
		//connect DB MySQL
		Connection conn = null;
		String sql = "";
		ResultSet rs = null;
		try {
			 conn = MySQLConnUtils.getMySQLConnection();
			//execute SQL get ALL products from table products
				sql = "select * from product ";
				Statement stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					int price = rs.getInt("price");
					String imgName =  rs.getString("img_Name");
					boolean isNew = rs.getBoolean("is_new");
					int quantity = rs.getInt("quantity");
					String description = rs.getString("description");
					
					Product product = new Product(id, name, price, imgName, isNew, quantity, description);
					
					list.add(product);
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
	
	public  List<Product> search(String value) throws SQLException {
		Connection conn = null;
		try {
			conn = MySQLConnUtils.getMySQLConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//String SQL = "Select * from product Where category_id = " + categoryId;
		
		String SQL = "Select * from product Where name  like ?";

		PreparedStatement preStmt = conn.prepareStatement(SQL);
		//'100%20or%202=2'
		preStmt.setString(1, "%" +value + "%");
		
		ResultSet rs = preStmt.executeQuery();

		List<Product> list = new ArrayList<Product>();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			String imgName = rs.getString("img_name");
			Product product = new Product(id, name, price, imgName);
			list.add(product);
		}
		return list;
	}
}