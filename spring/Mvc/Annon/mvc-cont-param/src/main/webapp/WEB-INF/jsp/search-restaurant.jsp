<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Restaurants</title>
		<style type="text/css">
			* {
				font-family: consolas;
				font-size: 18px;
			}
			input[type='text'] {
				border: 1px solid black;
			}
		</style>
	</head>
	<body>
		<h2>Find Restaurants At your location</h2>
		<form action="${pageContext.request.contextPath}/getRestaurantsByLocation.htm" method="post">
			Location: <input type="text" name="location"/><br/>
			<input type="submit" value="Find"/>
		</form>
	</body>
</html>