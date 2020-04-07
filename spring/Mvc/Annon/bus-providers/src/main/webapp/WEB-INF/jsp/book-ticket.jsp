<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Book Ticket</title>
	</head>
	<body>
		<h2>Book Ticket</h2>
		<form:form modelAttribute="ticketForm">
			<p style="color:red;">
				<form:errors path="*"/>
			</p>
			Source: <form:input path="source" readonly="true"/><br/>
			Destination: <form:input path="destination" readonly="true"/><br/>
			Bus Provider Name: <form:input path="busProviderName" readonly="true"/> <br/>
			Journey Date: <form:input path="journeyDate" readonly="true"/><br/>
			Price: <form:input path="price" readonly="true"/> <br/>
			<form:hidden path="journeyId" />
			Passenger Details
			<hr/>
			<br/>
			Passenger Name: <form:input path="passengerName" /><br/>
			Age: <form:input path="age" /><br/>
			Gender: Male : <form:radiobutton path="gender" value="M"/> (or) Female: <form:radiobutton path="gender" value="F" /><br/>
			Mobile No: <form:input path="mobileNo" /><br/>
			Email Address:<form:input path="emailAddress" /><br/>
			<input type="submit" value="book ticket"/>						
		</form:form>
	</body>
</html>


















