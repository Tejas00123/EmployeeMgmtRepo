<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.LeaveBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <link rel="stylesheet" href="./bootstrap-icons/font/bootstrap-icons.css">
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.css">
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }

        a {
            text-decoration: none;
            padding: 4px 8px;
            margin-right: 4px;
            border: 1px solid #ddd;
            background-color: #f9f9f9;
            color: #333;
            border-radius: 4px;
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
  LeaveBean lb = (LeaveBean) request.getAttribute("lbean");
 String ename = (String)request.getAttribute("ename");

%>
<h5>This page belongs to:<span><%=ename %></span></h5>
<table>
                <thead>
                    <tr>
                        <th>Leave ID</th>
                        <th>Employee ID</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Leave Type</th>
                        <th>Status</th>
                        <th>Approval Date</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                 <tr>
                                <td><%= lb.getLid() %></td>
                                <td><%= lb.getEid() %></td>
                                <td><%= lb.getSdate() %></td>
                                <td><%= lb.getEdate() %></td>
                                <td><%= lb.getLtype() %></td>
                                <td style="color:green; font-weight: bold;"><%= lb.getStatus() %></td>
                                <td><%= lb.getApprdate() %></td>
                                <td> <a class="btn btn-danger" href='delete2?lid=<%= lb.getLid() %>'>Delete</a></td>
                            </tr>
                               </tbody>
            </table>
    
<a href="logout" class="btn btn-danger">Logout</a>
</body>
</html>