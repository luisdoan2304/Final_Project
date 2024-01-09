<%@page import="entity.User"%>
<%@page import="java.util.List"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	//scriplet java code

	String username = request.getParameter("userName");
	String password = request.getParameter("password");

	UserDAO userDAO = new UserDAO();
	User user = new User(username, password);
	boolean isLogin = userDAO.validateUser(user);

	if (isLogin) {

		request.setAttribute("user", user);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

	} else {
		String message = "Username and Password are incorrect!!!";
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}
	%>

</body>
</html>