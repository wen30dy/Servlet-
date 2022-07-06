<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- jdbc steps
import sql
register and load driver
initiate string url username password and query statement
connection with url usrnme pass
statement
Resultset
show results
 -->
 <%
 	String url="jdbc:mysql://localhost:3306/vanditadb";
	String usr="root";
	String pass="password";
	String sql="select * from table1";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,usr,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(sql);
	rs.next();
 %>
 <br>Rollno:<%=rs.getString(1)%>
 <br>Name:<%= rs.getString(2)%>
 <%st.close();
 con.close();%>
</body>
</html>