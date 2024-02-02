package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CategoryDAO;
import dao.ProductDAO;
import entity.Cart;
import entityLombok.Category;
import entityLombok.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/Cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("ACTION");
		
		switch (action) {
		case "ADD_TO_CART":{
			addToCart(request, response);
		}
			
			break;

		default:
			break;
		}
		
	}

	private void addToCart(HttpServletRequest request, HttpServletResponse response) {
		String productId = request.getParameter("productId");
		Integer productIdInteger = Integer.parseInt(productId);
		
		//ArrayList<Integer> shoppingCartItems;
		
		Cart cart;
		
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("cart") == null) {
			
			cart = new Cart();
			cart.setItems(new HashMap<Product, Integer>());
			
			
		}else {
			
			cart = (Cart) session.getAttribute("cart");
		}
		
		ProductDAO productDao = new ProductDAO();
		          
		Product productRemote = null;
		try {
			productRemote = productDao.getProductById(Integer.parseInt(productId));
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if(cart.getItems().containsKey(productRemote)){
			
			Integer newQuantity = cart.getItems().get(productRemote) + 1;
			cart.getItems().put(productRemote, newQuantity);
			
			
		}else {
			
			cart.getItems().put(productRemote, 1);
		}
		
				session.setAttribute("cart", cart);
		
		// Traverse the HashMap using keySet
        for (Map.Entry<Product, Integer>  entry: cart.getItems().entrySet()) {
            System.out.println("Prduct name: " + entry.getKey().getName());
            System.out.println("Prduct price: " + entry.getKey().getPrice());
            System.out.println("Prduct quantity: " + entry.getValue());
       }
		
		try {
			response.sendRedirect("ProductDetailController?productId=" + productId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
