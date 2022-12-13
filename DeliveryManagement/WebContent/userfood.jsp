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
		<form action="orderlist" method="post">
		<div style="margin-left: 42%">
		<select style="width: 200px" name="location" id="Location">
		<%
		ArrayList<objectHotel> loc=database.hotellist();
		for(objectHotel o:loc){
		%>
			<option value=<%=o.getLocation()%> > <%=o.getLocation()%> </option>
			<%
			}
			%>
		</select>
		</div>
			<div class="infotable">
				<table>
					<tr>
						<th>Dish name</th>
						<th>Price</th>
						<th>Order count</th>
						<%
							ArrayList<objectHotel> res = database.menufood();
							HttpSession sess = request.getSession();
							sess.setAttribute("arraylist", res);
							for (objectHotel o : res) {
						%>
					
					<tr>
						<td><%=o.getMenuname()%></td>
						<td><%=o.getPrice()%></td>
						<td Style="width: 10%"><input type="text"
							name="<%=o.getMenuname()%>" value="0"></td>
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