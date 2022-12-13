<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body class="logbody">
<div class="navigation">
<a href="mainpage.jsp" style="padding-left: 4px;">Home</a>
<a href="#contact" >Contact</a>
<a href="#about" >About us</a>
</div>
<h1 class="h1log">Welcome</h1>
<div class="logdetail" align="center">
<h3 style="font-size: 20px;color: White">Registration</h3>
<form action="register" method="post">
<table>
<tr><td><label for="firstname">First Name</label></td><td><h3>:</h3></td><td><input type="text" name="firstname"></td></tr>
<tr><td><label for="lastname">Last Name</label></td><td><h3>:</h3></td><td><input type="text" name="lastname"></td></tr>
<tr><td><label for="mobile">MobileNumber</label></td><td><h3>:</h3></td><td><input type="text" name="mobile"></td></tr>
<tr><td><label for="mobile">Address</label></td><td><h3>:</h3></td><td><input type="text" name="address"></td></tr>
<tr><td><label for="password">password</label></td><td><h3>:</h3></td><td><input type="text" name="password"></td></tr>
<tr><td colspan="3" style="text-align:center;width:100%"><input type="submit"></td></tr>
</table>
</form>
<label Style=" color:White;font-size: 20px">Already have a <a href="mainpage.jsp" Style=" color:White">account</a> ?</label>
</div>
</body>
</html>