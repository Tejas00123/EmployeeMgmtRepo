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
@WebServlet("/view2")
public class ViewLeaveStatusServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  String eId = req.getParameter("eid");
		LeaveBean lb = new ViewLeaveStatusLDAO().retrive(eId);
	Cookie ck[] = req.getCookies();
	if(ck==null)
	{
		req.setAttribute("msg", "Cookie Session expired");
		req.getRequestDispatcher("Home.jsp").forward(req, res);
	}
	else
	{
		
		String ename = ck[0].getValue();
		req.setAttribute("ename", ename);
//		
//		ServletContext sct = req.getServletContext();
//		sct.setAttribute("lbeans", lb);
		if(eId.equals(lb.getEid()))
		{
		req.setAttribute("lbean", lb);
		}
		req.getRequestDispatcher("ViewLeaveStatus.jsp").forward(req, res);
	}
  }
}
