<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Job Sheet</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Job Sheet</h2>
		<form:form modelAttribute="jobSheetForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			<h3>Owner Information</h3>
			Owner Name: <form:input path="ownerName"/> <br/>
			Mobile Number: <form:input path="mobileNo"/><br/>
			Email Address: <form:input path="emailAddress"/><br/>
			<hr/>
			<h3>Vehicle Information</h3>
			Vehicle No: <form:input path="vehicleNo"/><br/>
			Manufacturer: <form:input path="manufacturer"/> <br/>
			Model: <form:input path="model"/><br/>
			Chasis No: <form:input path="chasisNo"/><br/>
			Engine No: <form:input path="engineNo"/><br/>
			<input type="submit" value="next"/>
		</form:form>
	</body>
</html>














