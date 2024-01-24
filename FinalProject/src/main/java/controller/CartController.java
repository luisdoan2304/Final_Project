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
		
		Map<Integer, Integer>shoppingCartItems;
		
		Integer itemQuantity = null;
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("cart") == null) {
			
			shoppingCartItems = new HashMap<Integer, Integer>();
			
			
		}else {
			
			shoppingCartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
		}
		
		if(shoppingCartItems.containsKey(productIdInteger)){
			
			Integer oldItemQuantity;
			
			oldItemQuantity = shoppingCartItems.get(productIdInteger);
			
			 itemQuantity = oldItemQuantity +1;
			
			
		}else {
			
			itemQuantity = 1;
		}
		
		shoppingCartItems.put(productIdInteger, itemQuantity);
		session.setAttribute("cart", shoppingCartItems);
		
		// Traverse the HashMap using keySet
       // for (Integer key : shoppingCartItems.keySet()) {
        //    System.out.println("Key: " + key + ", Value: " + shoppingCartItems.get(key));
       // }
		
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
