<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Form Parameters</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/services/person/form" method="post">
			Person Name: <input type="text" name="personName"/><br/>
			Age: <input type="text" name="age"/><br/>
			Gender: <input type="text" name="gender"/><br/>
			<input type="submit" value="add"/>
		</form>
	</body>
</html>