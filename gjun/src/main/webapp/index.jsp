<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Login</title>
</head>
<body>
	<form action="loginController" method="post">
		<table width="300" align="center" border="1">
			<tr>
				<td colspan="2" align="center">�|���޲z
			<tr align="center">
				<td>�b��
				<td><input type="text" name="username">
			<tr align="center">	
				<td>�K�X
				<td><input type="password" name="password">
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="�n�J">
				<a href="member/addMember.jsp">���U</a>
		</table>
	</form>
</body>
</html>