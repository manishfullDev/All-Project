<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Doctor</title>
	</head>
	<body>
		<h2>Add Doctor</h2>
		<form:form modelAttribute="addDoctorForm">
			<p style="color: red">
				<form:errors path="*"/>
			</p>
			Doctor Name: <form:input path="doctorName" /> <br/>
			Specialization: <form:input path="specialization" /> <br/>
			Qualification: <form:input path="qualification" /><br/>
			Experience: <form:input path="experience" /><br/>
			Age: <form:input path="age"/><br/>
			Gender: Male: <form:radiobutton path="gender" value="Male" /> (or) Female: <form:radiobutton path="gender" value="Female" /><br/>
			Contact No: <form:input path="contactNo" /><br/>
			Email Address: <form:input path="emailAddress" /><br/>
			<input type="submit" value="add doctor"/>		
		</form:form>	
	</body>
</html>




















