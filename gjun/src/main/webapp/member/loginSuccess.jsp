<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.member"%>
 <%
 	member m=(member)session.getAttribute("M");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Login Success</title>
</head>
<body>
	<h3><%=m.getName() %>，登入成功!</h3>
	<a href="../porder/index.jsp">前往購物~</a>
</body>
</html>