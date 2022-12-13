<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital Entry Management</title>
</head>
<body>
<h1>Welcome Deposit Hospital</h1>
<form action="Login" method ="post">
	<h2>Login</h2>
	Enter Patient Id         : <input type="text" name="pat_id"><br>
	Enter in_time(HH:mm) : <input type="text" name="in_time"><br>
	<input type="submit" ><br>
	<a href="register.jsp" >Create</a> an account</a><br>
	</form>
	<form action="list" method="post">
	<input type="submit" value="list">
	</form>
</body>
</html>