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
				<td colspan="2" align="center">會員管理
			<tr align="center">
				<td>帳號
				<td><input type="text" name="username">
			<tr align="center">	
				<td>密碼
				<td><input type="password" name="password">
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="登入">
				<a href="member/addMember.jsp">註冊</a>
		</table>
	</form>
</body>
</html>