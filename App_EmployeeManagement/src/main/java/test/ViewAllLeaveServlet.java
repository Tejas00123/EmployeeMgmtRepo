package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/viewAllLeave")
public class ViewAllLeaveServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  Cookie c[] = req.getCookies();
	  if(c==null)
	  {
		  req.setAttribute("msg", "Cookie Session expired..");
		  req.getRequestDispatcher("Home.jsp").forward(req, res);
	  }
	  else
	  {

		  ArrayList<LeaveBean> al =  new ViewAllLeaveDAO().retrieve();
		  req.setAttribute("aLeaveList", al);
		  req.getRequestDispatcher("ViewAllLeave.jsp").forward(req, res);
	  }
  }
}
