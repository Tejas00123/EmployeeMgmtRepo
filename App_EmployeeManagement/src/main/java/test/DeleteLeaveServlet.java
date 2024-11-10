package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete2")
public class DeleteLeaveServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException , IOException
  {
	 Cookie c[] = req.getCookies();
	 if(c==null)
	 {
		 req.setAttribute("msg", "Cookie session expired...");
		 req.getRequestDispatcher("Home.jsp").forward(req, res);
	 }
	 else
	 {
		 String lId = req.getParameter("lid");
		 int k = new DeleteLeaveDAO().delete(lId);
		 if(k>0)
		 {
			 req.setAttribute("msg", "Leave deleted Successfully...");
		 }
		 req.getRequestDispatcher("DeleteLeave.jsp").forward(req, res);
	 }
  }
}
