package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class LeaveDAO
{
	int k=0;
 int insert(LeaveBean lb)
 {
	try
	{
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement
				( "INSERT INTO LeaveApplications (eid, LeaveStartDate, LeaveEndDate, LeaveType, Status, ApprovalDate) " +
		                 "VALUES (?, ?, ?, ?, ?, ?)");
		
		ps.setString(1, lb.getEid());
		ps.setDate(2, (Date) lb.getSdate());
		ps.setDate(3, (Date) lb.getEdate());
		ps.setString(4, lb.getLtype());
		ps.setString(5,lb.getStatus());
		ps.setDate(6, (Date) lb.getApprdate());
		
		k = ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	 return k;
 }
}
