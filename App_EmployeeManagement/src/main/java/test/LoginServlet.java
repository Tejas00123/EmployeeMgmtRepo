package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
 {
	 UserBean ub = new LoginDAO().login(req.getParameter("uname"),req.getParameter("pword"));
	 
	 if(ub==null)
	 {
		req.setAttribute("msg", "Invalid uname or pword"); 
		RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
		rd.forward(req, res);
	 }
	 else {
		 ServletContext sc = req.getServletContext();
		//Getting the reference of ServletContext
		 sc.setAttribute("ubean", ub);
		//Adding the attribute to ServletContext
		 
		 Cookie ck = new Cookie("name",ub.getFname());
		 res.addCookie(ck);
		 
		 RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		 rd.forward(req, res);
	 }
 }
}
