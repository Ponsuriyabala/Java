<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="logbody">
<!-- 	<div class="navigation">
<a href="mainpage.jsp" style="padding-left: 4px;">Home</a>
<a href="#login">Sign in</a>
</div>-->
<h1 class="h1log">Welcome</h1>
<form action="admin" method="post">
<div class="logdetail" align="center">
<h3>Login</h3>
<div Style="align:center">${message}</div>
<table>
<tr>
					<td><label>Admin</label></td>
					<td><h3>:</h3></td>
					<td><input type="text" name="admin"></td>
				</tr>
<tr>
					<td><label for="password">Password</label></td>
					<td><h3>:</h3></td>
					<td><input type="text" name="password"></td>
				</tr>
<tr>
					<td colspan="3" style="text-align:center;width:100%"><input
						type="submit"></td>
				</tr>
</table>
</div>
</form>
</body>


</html>