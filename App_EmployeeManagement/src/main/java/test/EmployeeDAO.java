package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class EmployeeDAO
{
 int k;
 public int insert(EmployeeBean eb)
 {
	try
	{
		 Connection con = DBConnection.getCon();
		 PreparedStatement ps = con.prepareStatement
				 ("insert into EmployeeTab57 values(?,?,?,?,?,?)");
		 ps.setString(1, eb.getEid());
		 ps.setString(2, eb.getEname());
		 ps.setString(3, eb.getDesg());
		 ps.setDouble(4, eb.getBsal());
		 ps.setDouble(5, eb.gettSal());
		 ps.setLong(6, eb.getPhno());
		 k = ps.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	 return k;
 }
}
