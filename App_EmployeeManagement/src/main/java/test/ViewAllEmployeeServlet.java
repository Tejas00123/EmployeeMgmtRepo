package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllEmployeeServlet extends HttpServlet{
 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
 {
	 ArrayList<EmployeeBean> al = new ViewAllEmployeeDAO().retrive();
	  req.setAttribute("list", al);
//	  HttpSession hs = req.getSession(true);
//		 hs.setAttribute("list", al);
	  RequestDispatcher rd = req.getRequestDispatcher("ViewAllEmployee.jsp");
	  rd.forward(req, res);
 }
}
