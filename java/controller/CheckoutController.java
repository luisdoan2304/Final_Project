package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entityLombok.User;

/**
 * Servlet implementation class CheckoutController
 */
@WebServlet("/Checkout")
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession loginSession = request.getSession(false);
		
		
		User user = (User) loginSession.getAttribute("user");
		
		if(user != null) {
			
			Date currentDate = new Date();
			
			SimpleDateFormat formatSimple = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
					
			String newFormatDate = formatSimple.format(currentDate);
			
			RequestDispatcher rd = request.getRequestDispatcher("/checkout.jsp");
			
			request.setAttribute("currentDate", newFormatDate);
			
			rd.forward(request, response);
			
			//response.sendRedirect(request.getContextPath() + "/checkout.jsp");
			
		}else {
			
			response.sendRedirect(request.getContextPath() + "/LoginController");
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
