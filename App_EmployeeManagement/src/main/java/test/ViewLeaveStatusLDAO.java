package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewLeaveStatusLDAO 
{
  public LeaveBean retrive(String eId)
  {
	  LeaveBean lb = null;
	  try
	  {
		  Connection con = DBConnection.getCon();
		  PreparedStatement ps = con.prepareStatement
				  ("Select * from LeaveApplications where eid = ?");
		   ps.setString(1, eId);
		   
		   ResultSet rs = ps.executeQuery();
		   
		   if(rs.next())
		   {
			 lb = new LeaveBean(); 
			 lb.setLid(rs.getString(1));
			 lb.setEid(rs.getString(2));
			 lb.setSdate(rs.getDate(3));
			 lb.setEdate(rs.getDate(4));
			 lb.setLtype(rs.getString(5));
			 lb.setStatus(rs.getString(6));
			 lb.setApprdate(rs.getDate(7));
		   }
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return lb;
  }
}
