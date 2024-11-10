package test;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
	 UserBean ub = new UserBean();
	 ub.setUname(req.getParameter("uname"));
	 ub.setPword(req.getParameter("pword"));
	 ub.setFname(req.getParameter("fname"));
	 ub.setLname(req.getParameter("lname"));
	 ub.setAddr(req.getParameter("addr"));
	 ub.setMid(req.getParameter("mid"));
	 ub.setPhno(Long.parseLong(req.getParameter("phno")));
	 
	 int k = new RegisterDAO().insert(ub);
	 
	 if(k==0)
	 {
		 req.setAttribute("msg", "Something went wrong please try again..");
		 RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
		 rd.forward(req, res);
	 }
	 else {
		 req.setAttribute("msg", "Record inserted Successfully..");
		 RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
		 rd.forward(req, res);
	 }
  }
}
