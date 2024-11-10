<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.LeaveBean , java.util.Date , java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" href="./style.css">
<style>
span{
    font-size: 20px;
    font-weight: bold;
    text-align: center;
    background: linear-gradient(to right,blue,red);
    color: transparent;
    -webkit-background-clip: text;
    }
</style>
</head>
<body>
<body class="container-fluid">
<%
     String fname = (String)request.getAttribute("fname");
      LeaveBean lb = (LeaveBean) request.getAttribute("lbean");
      SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
      Date date = new Date();
%>
  <h5>This page belongs to Admin : <span><%=request.getAttribute("fname")%></span></h5>;
<div class="card">
<div class="card-header"><h3>Leave Approval/Rejection Form</h3></div>
<form action="updateLeave" method="post">
<p>EID : <input type="text" name="eid" value=<%=lb.getEid() %>></p>
  <p>LeaveStatus : <select name="status">
     <option value="pending">Pending</option>
     <option value="approved">Approved</option>
     <option value="rejected">Rejected</option>
  </select></p>
 <p> Approved Date : <input type="date" name="adate" ></p>
 <p> LeaveType : <input type="text" name="ltype" value="<%=lb.getLtype()%>" disabled></p>
	
	<input class="btn btn-success" type="submit" value="UpdateStatus">
</form>
</div>
</body>
</body>
</html>