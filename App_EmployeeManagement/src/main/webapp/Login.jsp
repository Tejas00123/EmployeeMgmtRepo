<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="test.UserBean"%>
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
<body class="container-fluid">
<%
  UserBean ub = (UserBean) application.getAttribute("ubean");
  //out.println("Welcome :"+ub.getFname()+"<br>");
  
%>
      <h5>Welcome user:<span ><%=ub.getFname() %> :)</span></h5>
      
  <div class="topnav" id="myTopnav">
    <a class="active" href="EmployeeRegister.html">AddEmployee</a>
    <a href="view">ViewAllEmployee</a>
    <a href="viewAllLeave">ViewAllLeave</a>
    <a href="logout">Logout</a>
    <a href="javascript:void(0);" class="icon" onclick="myFunction()">
      <i class="bi bi-justify"></i>
  </a>
    <script src="./jquery/dist/jquery.js"></script>
    <script src="./bootstrap/dist/js/bootstrap.bundle.js"></script>
  
 </div>
</body>
</html>