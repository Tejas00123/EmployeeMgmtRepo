package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEmployeeDetailsDAO {
	int k = 0;
  public int update(EmployeeBean eb)
  {
	  try 
	  {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement
				("Update EmployeeTab57 set ename = ?,edesg=?,bsal=? where eid=?");
	   ps.setString(1, eb.getEname());
	   ps.setString(2, eb.getDesg());
	   ps.setDouble(3, eb.getBsal());
	   ps.setString(4, eb.getEid());
	   
	  k = ps.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return k;
  }

}
