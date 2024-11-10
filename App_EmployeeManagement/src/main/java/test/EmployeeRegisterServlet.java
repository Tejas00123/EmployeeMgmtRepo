package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/add")
public class EmployeeRegisterServlet extends HttpServlet {
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
 {
	EmployeeBean eb = new EmployeeBean();
	eb.setEid(req.getParameter("eid"));
	eb.setEname(req.getParameter("ename"));
	eb.setDesg(req.getParameter("edesg"));
	eb.setBsal(Double.parseDouble(req.getParameter("bsal")));
	eb.setPhno(Long.parseLong(req.getParameter("phno")));
	 int k = new EmployeeDAO().insert(eb);
	 if(k==0)
	 {
		req.setAttribute("msg", "Something went wrong please try again");
		RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
		rd.forward(req, res);
	 }
	 else {
		  ServletContext sct = req.getServletContext();//Getting the reference of ServletContext
		   sct.setAttribute("ebean", eb);//Adding the attribute to context
		   Cookie ck = new Cookie("name", eb.getEname());
		   res.addCookie(ck);//adding cookies to response
		 req.setAttribute("msg", "Employee registerd successfully");
		 RequestDispatcher rd = req.getRequestDispatcher("EmployeeRegister.jsp");
		 rd.forward(req, res);
	 }
 }
}
