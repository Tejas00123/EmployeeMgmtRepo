package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteEmployeeDetailsServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  Cookie ck[] = req.getCookies();
	  if(ck==null)
	  {
		  req.setAttribute("msg", "Cookie session expired...");
		  req.getRequestDispatcher("Home.jsp").forward(req, res);
	  }
	  else
	  {
		  String eId = req.getParameter("eid");
		int k =  new DeleteEmployeeDetaisDAO().delete(eId); 
		if(k>0)
		{
			req.setAttribute("msg", "Employee details deleted from the databse successfully");
	
		}
		req.getRequestDispatcher("DeleteEmployeeDetails.jsp").forward(req, res);
	  }
  }
}
