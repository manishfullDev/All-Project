<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Doctor</title>
	</head>
	<body>
		<h2>Add Doctor</h2>
		<form action="${pageContext.request.contextPath}/add-doctor.web" method="post">
			Doctor Name: <input type="Text" name="doctorName"/><br/>
			Specialization: <input type="Text" name="specialization"/><br/>
			Experience: <input type="Text" name="experience"/><br/>
			Mobile No: <input type="text" name="mobileNo"/><br/>
			Email Address: <input type="Text" name="emailAddress"/><br/>
			<input type="submit" value="add doctor"/>
		</form>
	
	</body>
</html>