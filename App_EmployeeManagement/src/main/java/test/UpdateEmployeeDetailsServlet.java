package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateEmployeeDetailsServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  Cookie ck[] = req.getCookies();
	  if(ck==null)
	  {
		  req.setAttribute("msg", "Cookie expired...");
		  req.getRequestDispatcher("Home.jsp").forward(req, res);
	  }
	  else
	  { 
		  String eId = req.getParameter("eid");
			 ArrayList<EmployeeBean> al = new ViewAllEmployeeDAO().retrive();
             Iterator<EmployeeBean> it = al.iterator();
             EmployeeBean eb = null;
             while(it.hasNext())
             {
            	 eb = it.next();
            	 if(eId.equals(eb.getEid()))
            	 {
            		 break;
            	 }
             }//end of while
             
             eb.setEname(req.getParameter("eid"));
             eb.setDesg(req.getParameter("edesg"));
             eb.setBsal(Double.parseDouble(req.getParameter("bsal")));
            int k = new UpdateEmployeeDetailsDAO().update(eb);
            if(k>0)
            {   
            	req.setAttribute("msg", "Employee Details Updated Successfully...");
            }
            req.getRequestDispatcher("UpdateEmployeeDetails.jsp").forward(req, res);
	  }
  }
}
