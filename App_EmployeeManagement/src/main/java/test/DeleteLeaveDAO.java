package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteLeaveDAO {
int k = 0;
int delete(String lId)
{
	try
	{
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement
				("Delete From LeaveApplications where leaveId = ?");
		ps.setString(1, lId);
		k = ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return k;
}
}
