<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Logout</title>
		<style type="text/css">
			* {
				font-family: consolas;
				font-size: 20px;
			}
		</style>
	</head>
	<body>
		Logged out successfully. please login
		<a href="${pageContext.request.contextPath}/user-login.htm">here</a>
	</body>
</html>