package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditEmployeeDetailsServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	 Cookie c[] = req.getCookies();
	 if(c==null)
	 {
		 req.setAttribute("msg", "Cookie session expired");
		 req.getRequestDispatcher("Home.jsp").forward(req, res);
	 }
	 else
	 {
	//	HttpSession hs = req.getSession(false);
		String eId = req.getParameter("eid");
		
		 ArrayList<EmployeeBean> al1 = new ViewAllEmployeeDAO().retrive();
//		  req.setAttribute("list", al1);
//		  
//		ArrayList<EmployeeBean> al = (ArrayList<EmployeeBean>)req.getAttribute("list");
	Iterator<EmployeeBean> it = al1.iterator();//just change al1 to al
		EmployeeBean eb = null;
		 while(it.hasNext())
		 {
		    eb = it.next();
		     if(eId.equals(eb.getEid()))
		     {
		    	 break;
		     }
	     }//end of loop
		 req.setAttribute("ebean", eb);
		 
		 String fName = c[0].getValue();
		 req.setAttribute("fname", fName);
		
		 req.getRequestDispatcher("EditEmployeeDetails.jsp").forward(req, res);
	}
		
		
		
	 }
  }
