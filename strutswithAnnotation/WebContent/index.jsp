<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts 2 Application - Welcome</title>
</head>
<body>
	<s:form action="restrutAnno">
	<h1>Validate with Annotation</h1>
		<s:textfield name="name"/>
		<s:textfield name="email" />
		<s:textfield  name="salary" />
		<s:submit value="Register"/>
	</s:form> 
</body>
</html> 