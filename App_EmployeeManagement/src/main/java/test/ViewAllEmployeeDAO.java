package test;
import java.sql.*;
import java.util.ArrayList;
public class ViewAllEmployeeDAO {

 public ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();
 public ArrayList<EmployeeBean> retrive()
 {
	 try
	 {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareCall
				("Select * from EmployeeTab57");
		  ResultSet rs = ps.executeQuery();
		  
		 while(rs.next())
		  {
			EmployeeBean eb = new EmployeeBean();
			  eb.setEid(rs.getString(1));
			  eb.setEname(rs.getString(2));
			  eb.setDesg(rs.getString(3));
			  eb.setBsal(rs.getDouble(4));
			  eb.setPhno(rs.getLong(6));
			  al.add(eb);
		  }
		  
		  
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return al;
 }
}
