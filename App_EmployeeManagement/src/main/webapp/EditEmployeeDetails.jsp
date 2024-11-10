<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.EmployeeBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" href="./style.css">
</head>
<body class="container-fluid">
<%
   String fname =(String) request.getAttribute("fname");
   out.println("Page belongs to:"+fname);
   EmployeeBean eb = (EmployeeBean)request.getAttribute("ebean");
   
%>
<div class="card">
<div class="card-header"><h3>Employee Correction Form</h3></div>
<form action="update" method="post">
   <input type="hidden" name="eid" value=<%=eb.getEid() %>>
  <p>Employee Name:<input type="text" name="ename" value=<%=eb.getEname() %>></p>
  <p>Employee Desg:<input type="text" name="edesg" value=<%=eb.getDesg() %>></p>
  <p>Employee bsal:<input type="text" name="bsal" value=<%=eb.getBsal() %>></p>
<input class="btn btn-outline-danger" type="submit" value="UpdateDetails">
</form>
</div>
</body>
</html>