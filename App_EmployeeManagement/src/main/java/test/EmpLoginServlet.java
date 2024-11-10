package test;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log1")
public class EmpLoginServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	 EmployeeBean eb = new EmpLoginDAO().login
	  (req.getParameter("ename"), req.getParameter("eid"));
	 
	 if(eb==null)
	 {
		 req.setAttribute("msg", "Invalid username or password..");
		 req.getRequestDispatcher("Home.jsp").forward(req, res);
	 }
	 else {
		ServletContext sct = req.getServletContext();
		sct.setAttribute("ebeans", eb);
		
		Cookie ck = new Cookie("name",eb.getEname());
		res.addCookie(ck);
		
		req.getRequestDispatcher("EmpLogin.jsp").forward(req, res);
	 }
  }
}
