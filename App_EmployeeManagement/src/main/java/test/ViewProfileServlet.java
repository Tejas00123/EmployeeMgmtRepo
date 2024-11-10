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
@WebServlet("/view1")
public class ViewProfileServlet extends HttpServlet
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
 {
	Cookie c[] = req.getCookies();
	if(c==null)
	{
		req.setAttribute("msg", "Cookie Sessoin expired...");
		req.getRequestDispatcher("Home.jsp").forward(req, res);
	}
	else {
	      String fname = c[0].getValue();
	      req.setAttribute("fname", fname);
	     
	      req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
	}
 }
}
