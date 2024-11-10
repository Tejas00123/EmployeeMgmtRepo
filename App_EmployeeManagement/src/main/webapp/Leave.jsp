<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
</head>
<body>
<%
 String msg = (String)request.getAttribute("msg");
out.println(msg+"<br>");

%>
<a class="bi bi-box-arrow-right btn btn-danger"  href="logout">Logout</a>
</body>
</html>