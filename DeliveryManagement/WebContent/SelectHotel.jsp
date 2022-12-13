<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>

<%@ page import="deliveryServlet.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="indexbody">
	<div class="navigation">
		<a href="mainpage.jsp">Home</a> <a href="#Order">Place Order</a> <a
			href="history">Previous Orders</a> <a href="#about">About us</a>
		<!-- 
<a href="#sign up" style="float:right">Sign up</a>-->
	</div>
	<h1 align="center">Order</h1>
	<div class="info">
		<form  action="orderlist" method="post">
			<div class="infotable">
				<table>
					<tr>
						<th>Hotel name</th>
						<th>Location</th>
						<%
							ArrayList<objectHotel> res = database.hotellist();
							HttpSession sess = request.getSession();
							for (objectHotel o : res) {
						%>
					
					<tr>
						<td><%=o.getName()%></td>
						<td><%=o.getLocation()%></td>
						<td Style="width: 10%"><input type="button"
							name="<%=o.getName()%>" value="0"></td>
					</tr>
					<%
						//k++;
						}
					%>
				</table>

				<div Style="margin-left: 45%">
					<input type="submit" name="value">
				</div>
			</div>
		</form>

	</div>
</body>
</html>