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
	<h3><%=m.getName() %>�A�n�J���\!</h3>
	<a href="../porder/index.jsp">�e���ʪ�~</a>
</body>
</html>