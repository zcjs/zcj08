package zcj; 
 

 import java.io.IOException; 
import java.io.PrintWriter; 
 import javax.servlet.ServletException; 
 import javax.servlet.http.HttpServlet; 
 import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse; 
 import zcj.UserInfoBean; 
 
 
 public class LoginServlet extends HttpServlet { 
 	private static final long serialVersionUID = 1L; 
 
 
 	 
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 		doPost(request, response); 
 	} 
 
 
 	 
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 		response.setCharacterEncoding("UTF-8"); 
 		PrintWriter out = response.getWriter(); 
 		request.setCharacterEncoding("UTF-8"); 
 		String username = request.getParameter("username"); 
 		UserInfoBean userBean = new UserInfoBean(); 
 		boolean isExist = userBean.isExist(username); 
 		if(isExist) 
 		{ 
 			request.setAttribute("username", username); 
 			request.getRequestDispatcher("/success.jsp").forward(request, response); 
 		} 
 		else 
 		{ 
 			request.getRequestDispatcher("/error.jsp").forward(request, response); 
 		} 
 		out.flush(); 
 		out.close(); 
 	} 
 	} 
