<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" href="./navbarStyle.css">
<script src="./navbarScript.js"></script>
</head>
<body>
<%
 String msg = (String)request.getAttribute("msg");
out.println(msg+"<br>");

%>
      
     <div class="topnav" id="myTopnav">
    <a class="active" href="EmployeeRegister.html">AddEmployee</a>
    <a href="view">ViewAllEmployee</a>
    <a href="viewAllLeave">ViewAllLeave</a>
    <a href="logout">Logout</a>
    <a href="javascript:void(0);" class="icon" onclick="myFunction()">
      <i class="bi bi-justify"></i>
  </a>
 </div>
</body>
</html>