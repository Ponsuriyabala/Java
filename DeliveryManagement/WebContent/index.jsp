<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ShopZone</title>
</head>
<body class="indexbody">
<%
		if(session.getAttribute("id")==null){
			response.sendRedirect("mainpage.jsp");
		}
%>
<!-- 
<div class="navigation">
<a href="mainpage.jsp" >Home</a>
<a href="#Order" >Place Order</a>
<a href="history" >Previous Orders</a>
<a href="#about" >About us</a>
<a href="#sign up" style="float:right">Sign up</a>
</div>
-->
<h1>Welcome ShopZone</h1>
<div class="choice">
<form action="userfood.jsp">
<button  name="food">Food</button></form>
<br>
<button  name="grocery">Grocery</button>
<br>
<button  name="pharmacy">Pharmacy</button>
</div>

</body>
</html>