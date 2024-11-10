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
@WebServlet("/action")
public class EditLeaveServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	 Cookie ck[] =  req.getCookies();
	  if(ck==null)
	  {
		  req.setAttribute("msg", "Cookie session expired");
		  req.getRequestDispatcher("Home.jsp").forward(req, res);
		  
	  }
	  else
	  {
		   String eId = req.getParameter("eid");
		  ArrayList<LeaveBean> al = new ViewAllLeaveDAO().retrieve();
		  
		  Iterator<LeaveBean> it =  al.iterator();
		  LeaveBean lb = null;
		  while(it.hasNext())
		  {
			  lb = it.next();
			  if(eId.equals(lb.getEid()))
			  {
				  break;
			  }
		  }//end of loop
		  req.setAttribute("lbean", lb);
	  }
	 String fName = ck[0].getValue();
	  req.setAttribute("fname", fName);
	  req.getRequestDispatcher("EditLeaveDetails.jsp").forward(req, res);
  }
}
