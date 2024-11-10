package test;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class LeaveBean implements Serializable{
 private String lid;
 private String eid;

private Date sdate;
 
private Date edate ;
 private String ltype;
 private String status;
 private Date apprdate;
 
 public Date getApprdate() {
	return apprdate;
}

public void setApprdate(Date apprdate) {
	this.apprdate = apprdate;
}

LeaveBean(){}
 
 public Date getSdate() {
	return sdate;
}

public void setSdate(Date sdate) {
	this.sdate = sdate;
}

public Date getEdate() {
	return edate;
}

public void setEdate(Date edate) {
	this.edate = edate;
}
public String getEid() {
	return eid;
}

public void setEid(String eid) {
	this.eid = eid;
}


public String getLtype() {
	return ltype;
}

public void setLtype(String ltype) {
	this.ltype = ltype;
}

public String getLid() {
	return lid;
}

public void setLid(String lid) {
	this.lid = lid;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}





 
}
