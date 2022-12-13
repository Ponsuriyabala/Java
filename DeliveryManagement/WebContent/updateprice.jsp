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
<div Style="align:center">${message}</div>
<form action="changeprice" method="post">
<h2 Style="width:200px">Change Menu</h2>
<table>
<tr><td ><label>Dish id</label></td><td><h3>:</h3></td><td><input type="text" name="id"></td></tr>
<tr><td><label>Price</label></td><td><h3>:</h3></td><td><input type="text" name="price"></td></tr>
<tr><td colspan="3" style="text-align:center;width:100%"><input type="submit"></td></tr>
</table>
</form>
</div>
</body>
</html>