<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="indexbody">
<!-- 
<div class="navigation">
<a href="admin.jsp" >Order</a>
<a href="merchant.jsp" >Merchant</a>
<a href="delivery.jsp" >Delivery</a>
<a href="payment.jsp" >Payment</a>
<a href="#about" >About us</a>
<a href="#sign up" style="float:right">Sign up</a>
</div>
<div class="choice">
<br>
<form action="addmenu.jsp">
<button  name="add">Add dish</button></form>
<br>
<form action="changemenu.jsp">
<button name="delete">Remove dish</button></form>
</div>
<div style="float: left">
<div class="logdetail" align="center">
<div Style="align:center">${message}</div>
<form action="changemenu" method="post">
<h2 Style="width:200px">Change Menu</h2>
<table>
<tr><td ><label>Dish id</label></td><td><h3>:</h3></td><td><input type="text" name="id"></td></tr>
<tr><td><label>Price</label></td><td><h3>:</h3></td><td><input type="text" name="price"></td></tr>
<tr><td colspan="3" style="text-align:center;width:100%"><input type="submit"></td></tr>
</table>
</form>
</div>
</div>
-->

<div class="navigation">
<div class="dropdown"">
        <a href="#" class="dropbtn" >Order info<i class="arrow down"></i></a>
        <div class="dropdown-content">
        <a href="merchant.jsp">Order info</a>
          <a href="hotelinfo.jsp">Hotel info</a>
           <a href="deliveryinfo.jsp">DeliveryBoy info</a>
           <a href="userinfo.jsp">User info</a>
        </div>
</div>
<div class="dropdown">
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
<div style="align:center">${message}</div>
</body>
</html>