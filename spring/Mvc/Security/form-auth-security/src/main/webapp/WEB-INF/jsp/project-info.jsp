<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Project Information</title>
		<style type="text/css">
			* {
				font-family: consolas;
				font-size: 20px;
			}
		</style>
	</head>
	<body>
		<jsp:include page="authentication-details.jsp"/>
		<a href="${pageContext.request.contextPath}/home.htm">Home</a>
		Project Information
	</body>
</html>