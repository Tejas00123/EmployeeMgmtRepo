package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/updateLeave")
public class UpdateLeaveStatusServlet extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
 {
	Cookie ck[] = req.getCookies();
	if(ck==null)
	{
		req.setAttribute("msg", "Cookie Session expired..");
		req.getRequestDispatcher("Home.jsp").forward(req, res);
	}
	else
	{
		
		String eId = req.getParameter("eid");
		
		ArrayList<LeaveBean> al = new ViewAllLeaveDAO().retrieve();
		Iterator<LeaveBean> it = al.iterator();
		LeaveBean lb = null;
		while(it.hasNext())
		{
			lb = it.next();
			if(eId.equals(lb.getEid()))
			{
				break;
			}
		}//end of while
		String aDate =  req.getParameter("adate");
		String status = req.getParameter("status");
		Date adate = java.sql.Date.valueOf(aDate);
		
		lb.setEid(eId);;
		lb.setApprdate(adate);
	    lb.setStatus(status);
		int k = new UpdateLeaveStatusDAO().update(lb);
		if(k>0)
		{
			req.setAttribute("msg", "leave status updated Successfully");
		}
		req.getRequestDispatcher("UpdateLeaveStatus.jsp").forward(req, res);
	}
 }
}
