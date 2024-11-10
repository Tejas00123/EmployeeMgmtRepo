package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpLoginDAO 
{
	EmployeeBean eb = null;
  public EmployeeBean login(String uName,String eId)
  {
	  try
	  {
		 Connection con = DBConnection.getCon();
		 PreparedStatement ps = con.prepareStatement
				 ("Select * from EmployeeTab57 where ename = ? and eid = ?");
		 ps.setString(1, uName);
		 ps.setString(2, eId);
		 
		 ResultSet rs = ps.executeQuery();
		 
		 if(rs.next())
		 {
			 eb = new EmployeeBean();
			 eb.setEid(rs.getString(1));
			 eb.setEname(rs.getString(2));
			 eb.setDesg(rs.getString(3));
			 eb.setBsal(rs.getDouble(4));
			 
		 }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return eb;
  }
}
