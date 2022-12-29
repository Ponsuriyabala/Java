<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="regstruct">
		<s:textfield name="name"/>
		<s:textfield name="email" />
		<s:textfield name="salary" />
		<s:submit value="Register"/>
	</s:form>
</body>
</html>