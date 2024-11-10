<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
<style>
    .card{
        background-color: #F2F2F2;   
    }
   a{
    text-decoration: none;
    color: black;
    padding: 20px;
   }
   a:hover{
      color: #EA1010;
   }
    
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
<%
   String msg = (String) request.getAttribute("msg");
   out.println(msg);
%>
<header>
     <nav class="card">
         <div class="card-header">
            <span><a href="EmployeeRegister.html">AddEmployee</a></span> 
            <span><a href="view">ViewAllEmployee</a></span> 
            <span><a href="viewAllLeave">ViewAllLeave</a></span>
            <span><a href="logout">Logout</a></span>
        </div>
       
     </nav>
    </header>
</body>
</html>