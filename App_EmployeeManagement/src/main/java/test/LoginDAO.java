package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginDAO {
	UserBean ub = null;
 public UserBean login(String uName , String pWord)
 {
	 try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement
				("select * from AdminTab57 where uname = ? and pword = ?");
		ps.setString(1,uName);
		ps.setString(2,pWord);
		ResultSet rs = ps.executeQuery();
		
		 ub = new UserBean();
		 while(rs.next())
		 {
			ub.setUname(rs.getString(1)); 
			ub.setPword(rs.getString(2));
			ub.setFname(rs.getString(3));
			ub.setLname(rs.getString(4));
			ub.setAddr(rs.getString(5));
			ub.setMid(rs.getString(6));
			ub.setPhno(rs.getLong(7));
		 }
	 }
	 catch(Exception e) {e.printStackTrace();}
	 return ub;
 }
}
