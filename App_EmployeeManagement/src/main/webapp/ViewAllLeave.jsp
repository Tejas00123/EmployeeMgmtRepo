<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="test.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Leave List</title>
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
    </style>
</head>
<body>
    <%
        ArrayList<LeaveBean> al = (ArrayList<LeaveBean>) request.getAttribute("aLeaveList");

        if (al.size() == 0) {
            out.println("There is no leave..<br>");
        } else {
    %>
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
                    <%
                        Iterator<LeaveBean> it = al.iterator();
                        while (it.hasNext()) {
                            LeaveBean lb = it.next();
                    %>
                            <tr>
                                <td><%= lb.getLid() %></td>
                                <td><%= lb.getEid() %></td>
                                <td><%= lb.getSdate() %></td>
                                <td><%= lb.getEdate() %></td>
                                <td><%= lb.getLtype() %></td>
                                <td><%= lb.getStatus() %></td>
                                <td><%= lb.getApprdate() %></td>
                                <td>
                                    <a class=" btn btn-success"  href='action?eid=<%= lb.getEid()%>'>TakeAction</a>
                                    
                                </td>
                            </tr>
                     <% 
                        }
                    %>
                </tbody>
            </table>
    <%
        }
    %>
    
     <a class="btn btn-primary" href="Login.jsp">Back</a>
    <a class="btn btn-danger" href="logout">Logout</a>
   
</body>
</html>
