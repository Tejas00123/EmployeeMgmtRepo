package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEmployeeDetaisDAO 
{
 int k = 0;
 public int delete(String eId)
 {
	 try
	 {
		Connection con = DBConnection.getCon(); 
		PreparedStatement ps = con.prepareStatement
				("Delete from EmployeeTab57 where eid = ?");
		ps.setString(1, eId);
		k = ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
}
