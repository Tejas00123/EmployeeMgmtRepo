<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "test.EmployeeBean ,java.util.*"%>
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
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<%

ArrayList<EmployeeBean> al = (ArrayList<EmployeeBean>)request.getAttribute("list");

if(al.size() == 0) {
    out.println("No employees available..<br>");  
} else {
%>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Designation</th>
                <th>Basic Salary</th>
                <th>Total Salary</th>
                <th>Phone Number</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <%
                Iterator<EmployeeBean> it = al.iterator();
                while(it.hasNext()) {
                    EmployeeBean eb = it.next();
            %>
                    <tr>
                        <td><%= eb.getEid() %></td>
                        <td><%= eb.getEname() %></td>
                        <td><%= eb.getDesg() %></td>
                        <td><%= eb.getBsal() %></td>
                        <td><%= eb.gettSal() %></td>
                        <td><%=eb.getPhno() %></td>
                        <td>
                            <a class=" btn btn-success" href='edit?eid=<%= eb.getEid() %>'>Edit</a>
                            <a class="btn btn-danger" href='delete?eid=<%= eb.getEid() %>'>Delete</a>
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
<a class="btn btn-success" href="Login.jsp">Back</a>
<a class="btn btn-danger" href="logout">Logout</a>
</body>
</html>




