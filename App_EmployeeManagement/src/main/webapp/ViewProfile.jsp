<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
<style>
        img{
         position: relative;
        }
        body{
            background-color: #F8F9FE;
             position: relative;
        }
        .card
        {
            margin-top:-150px;
            margin-left: 50px;
        }
        .row {
            display: flex;
            margin-right: 15px;
            margin-left: 15px;
            flex-wrap: wrap;
          }
          
    </style>
</head>
<body class="container-fluid">

<%
String fname = (String) request.getAttribute("fname");
EmployeeBean eb = (EmployeeBean)application.getAttribute("ebeans");
out.println("This page belongs to:"+fname+"<br>");

%>
<div>

<img src="./banner2.jpg" alt="banner" width="100%" height="35%">
   <div class="card w-50 h-100">
    <div class="card-header form-group">
        <h5>my account</h5>
        
        <span class="float-end">EmployeeID<input class="form-control"type="text" name="eid" value="<%=eb.getEid()%>"></span>
    </div>

   <div class="row">
    <div class="col-lg-6">
      <div class="form-group focused">
        <label for="ename" class="form-control-label">Name</label>
        <input type="text" name="ename" class="form-control" value="<%=eb.getEname()%>">
      </div>
    </div>
    <div class="col-lg-6">
      <div class="form-group focused">
        <label for="edesg"class="form-control-label">Designation</label>
        <input type="text" name="edesg" class="form-control" value="<%=eb.getDesg()%>">
      </div>
    </div>
   </div>
      
   <div class="row">
    <div class="col-lg-6">
        <div class="form-group focused">
            <label for="bsal" class="form-control-label">Basic Salary</label>
            <input type="text" name="bsal" class="form-control" value="<%=eb.getBsal()%>">
        </div>
    </div>
    <div class="col-lg-6">
        <div class="form-group focused">
            <label for="text" name="tsal" class="form-control-label">Total Salary</label>
             <input type="text" name="tsal" class="form-control" value="<%=eb.gettSal()%>">
        </div>
    </div>
   </div>
  
   </div>
  
</div>
<a class="btn btn-success"href="EmpLogin.jsp">Back</a>
<a class="btn btn-danger"href="logout">Logout</a>
</body>
</html>