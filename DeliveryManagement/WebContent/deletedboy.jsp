<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: grey">
<div class="logdetail" align="center">
<h3 style="font-size: 20px;color:black">Registration</h3>
<div Style="align:center">${message}</div>
<h3>Delete Menu</h3>
<form action="deletedboy" method="post">
<table>
<tr><td><label>Id</label></td><td><h3>:</h3></td><td><input type="text" name="id"></td></tr>
<tr><td><label>DeliveryBoy name</label></td><td><h3>:</h3></td><td><input type="text" name="name"></td></tr>
<tr><td colspan="3" style="text-align:center;width:100%"><input type="submit"></td></tr>
</table>
</form>
</div>
</body>
</html>