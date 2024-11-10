package test;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/addLeave")
public class LeaveServlet extends HttpServlet
{
  @SuppressWarnings("deprecation")
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  LeaveBean lb = new LeaveBean();
	  
	  lb.setEid(req.getParameter("eid"));
	  //lb.setSdate(new Date(req.getParameter("sdate")));
	  String dateString1 = req.getParameter("sdate");
	  Date sdate = java.sql.Date.valueOf(dateString1);
      lb.setSdate(sdate);
	  //lb.setEdate(new Date(req.getParameter("edate")));
	  String dateString2 = req.getParameter("edate");
	  Date edate = java.sql.Date.valueOf(dateString2);
      lb.setEdate(edate);
	  lb.setLtype(req.getParameter("ltype"));
	  lb.setStatus(req.getParameter("status"));
	  int k = new LeaveDAO().insert(lb);
	  if(k==0)
	  {
		  req.setAttribute("msg", "Cookie session expired");
		  req.getRequestDispatcher("Home.jsp").forward(req, res);
	  }
	  else
	  {
		  ServletContext sct = req.getServletContext();
		  sct.setAttribute("lbean", lb);
		  
		  Cookie ck = new Cookie("eId",lb.getEid());
		  res.addCookie(ck);
		  
		  req.setAttribute("msg", "applied for leave Successfully");
		  req.getRequestDispatcher("Leave.jsp").forward(req, res);
	  }
  }
}
