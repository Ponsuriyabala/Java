<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image:url('deliveryhome.jpg');background-position: top;background-repeat: no-repeat;background-size: 100%">
<div class="navigation">
<a href="mainpage.jsp">Home</a>
<!--  <div class="dropdown"> -->
<!--         <a href="mainpage.jsp" class="dropbtn">Order<i class="arrow down"></i></a> -->
<!--         <div class="dropdown-content"> -->
<!--           <a href="mainpage.jsp">Order</a> -->
<!--           <a href="merchantLog.jsp">Add</a> -->
<!--           <a href="deliverylog.jsp">delivery</a> -->
<!--         </div> -->
<!--       </div>  -->
<a href="#contact" >Contact us</a>
<a href="#about" >About</a>
<div class="dropdown" style="float: right">
        <a href="mainpage.jsp" class="dropbtn" >Sign in <i class="arrow down"></i></a>
        <div class="dropdown-content">
        <a href="mainpage.jsp">Sign in</a>
          <a href="register.jsp">Sign up</a>
        </div>
      </div> 
</div>
<h1 align="center">Welcome Shopzone</h1>
<div class="logdetail" align="center">
<h3>Login</h3>
<div Style="align:center">${message}</div>
<form action="login" method="post">
<table>
<tr><td><label for="userid">Mobile</label></td><td><h3>:</h3></td><td><input type="text" name="userid" placeholder="Enter your mobile"></td></tr>
<tr><td><label for="password">Password</label></td><td><h3>:</h3></td><td><input type="text" name="password"></td></tr>
<tr><td colspan="3" style="text-align:center;width:100%"><input type="submit"></td></tr>
</table>
</form>
<label Style=" color:black;font-size: 20px">Create<a href="register.jsp"> New </a>amount</label>
</div>
</body>
</html>