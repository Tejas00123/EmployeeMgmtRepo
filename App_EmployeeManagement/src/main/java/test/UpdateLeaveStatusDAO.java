package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class UpdateLeaveStatusDAO 
{ int k=0;
  int update(LeaveBean lb)
  {
	  try
	  {
		Connection con = DBConnection.getCon();  
		PreparedStatement ps = con.prepareStatement
		("Update LeaveApplications set Status = ? , ApprovalDate = ?  where eid  = ?");
	  
		ps.setString(1, lb.getStatus());
		ps.setDate(2, (Date) lb.getApprdate());
		ps.setString(3, lb.getEid());
		k = ps.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return k;
  }
}
