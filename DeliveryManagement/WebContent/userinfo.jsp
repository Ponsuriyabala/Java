<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    
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
<div class="dropdown"">
        <a href="#" class="dropbtn" >User info<i class="arrow down"></i></a>
        <div class="dropdown-content">
        <a href="merchant.jsp">Order info</a>
          <a href="hotelinfo.jsp">Hotel info</a>
           <a href="deliveryinfo.jsp">DeliveryBoy info</a>
           <a href="userinfo.jsp">User info</a>
        </div>
</div>
<div class="dropdown"">
        <a href="#" class="dropbtn" >Add <i class="arrow down"></i></a>
        <div class="dropdown-content">
        <a href="addhotel.jsp">Hotel</a>
          <a href="addmenu.jsp">Menu</a>
           <a href="adddboy.jsp">DBoy</a>
        </div>
</div>
<div class="dropdown" >
        <a href="#" class="dropbtn" >Update <i class="arrow down"></i></a>
        <div class="dropdown-content">
        <a href="updateprice.jsp">Price</a>
          <a href="changeaddress.jsp">Address</a>
          <a href="changephoneno.jsp">Mobile No</a>
            <a href="chngdboyph.jsp">D.mobile No</a>
              <a href="chngdboyloc.jsp">D.location</a>
        </div>
</div> 
<div class="dropdown" >
        <a href="#" class="dropbtn" >Delete <i class="arrow down"></i></a>
        <div class="dropdown-content">
        <a href="deletehotel.jsp">Hotel</a>
          <a href="deletemenu.jsp">Menu</a>
            <a href="deletedboy.jsp">DBoy</a>
        </div>
</div>
<a href="payment.jsp" >Payment</a>
</div>
<h1 align="center">User Information</h1>
<div class="info">
<div class="infotable"><table style="width: 90%;margin-left: 5%;margin-right: 5%;border-radius: 20px"><tr>
<td><label>Id</label></td><td><label>HotelName</label></td><td><label>Phone No</label></td><td><label>Address</label></td></tr>
<%
ArrayList<objectHotel> res=database.userlist();
for(objectHotel o:res){
	%>
	<tr><td><%=o.getId()%></td><td><%=o.getName()%></td><td><%=o.getPhoneno()%></td><td><%=o.getAddress()%></td></tr>
	<%
}
%>
</table>
</div>
</div>
</body>
</html>