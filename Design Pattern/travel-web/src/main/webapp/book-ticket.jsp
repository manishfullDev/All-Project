<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Book Ticket</title>
	</head>
	<body style="font-family: Tahoma; font-size: 24px;">
		<h2>Book Ticket</h2>
		<form action="${pageContext.request.contextPath}/bookTicket.web" method="post">
			Source: <input type="text" name="source"/><br/>
			Destination: <input type="Text" name="destination"/><br/>
			Journey Date: <input type="Text" name="journeyDate"/><br/>
			Passenger Name: <input type="text" name="passengerName"/><br/>
			<input type="submit" value="book ticket"/>
		</form>
	</body>
</html>