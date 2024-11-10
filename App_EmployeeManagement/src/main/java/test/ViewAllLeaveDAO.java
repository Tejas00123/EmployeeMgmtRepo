package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllLeaveDAO 
{
	ArrayList<LeaveBean> al = new ArrayList<LeaveBean>();
  public ArrayList<LeaveBean> retrieve()
  {
	  try 
	  {
		 Connection con = DBConnection.getCon();
		 PreparedStatement ps = con.prepareStatement
				 ("Select * from leaveApplications"	);
		 
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			LeaveBean lb = new LeaveBean();
			lb.setLid(rs.getString(1));
			lb.setEid(rs.getString(2));
			lb.setSdate(rs.getDate(3));
			lb.setEdate(rs.getDate(4));
			lb.setLtype(rs.getString(5));
			lb.setStatus(rs.getString(6));
			lb.setApprdate(rs.getDate(7));
			
			al.add(lb);
		}
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return al;
  }
}
