<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.EmployeeBean"
    %>
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
  EmployeeBean eb = (EmployeeBean) application.getAttribute("ebeans");
 // out.println("Welcome Employee"+eb.getEname()+"<br>");
%><h5>Welcome Employee:<span ><%=eb.getEname() %> :)</span></h5>
      
    
        <div class="topnav" id="myTopnav">
            <a class="active" href="view1">ViewProfile</a> 
            <a href="leave.html">ApplyLeave</a> 
            <a href="LeaveStatus.html">ViewLeaveStatus</a>
            <a href="logout">Logout</a>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
               <i class="bi bi-justify"></i>
            </a>
        </div>
       

</body>
</html>



  