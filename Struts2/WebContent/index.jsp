<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<s:form action="regstrut">
	<h1>Validate with method</h1>
		<s:textfield name="name"/>
		<s:textfield name="email" />
		<s:textfield name="salary" />
		<s:submit value="Register"/>
	</s:form> 
</body>
</html>