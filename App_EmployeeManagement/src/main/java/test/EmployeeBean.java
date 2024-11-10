package test;
import java.io.Serializable;
@SuppressWarnings("serial")
public class EmployeeBean implements Serializable
{
 private String eid;
 private String ename;
 private String desg;
 private double bsal;
 private long phno;
 public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

private double tSal;
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public double getBsal() {
	return bsal;
}
public void setBsal(double bsal) {
	this.bsal = bsal;
}

//Calculating tSal
public double gettSal() {
	tSal = bsal + (0.93*bsal)+(0.61*bsal);
	return tSal;
}

	
}
