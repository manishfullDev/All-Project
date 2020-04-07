<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add Journey</title>
		<style type="text/css">
			* {
				font-family: consolas;
				font-size: 20px;
			}
		</style>
	</head>
	<body>
		<h2>Add Journey</h2>
		<form:form modelAttribute="addJourneyForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			Bus Providers: 
			<form:select path="busProviderId">
				<form:options items="${busProviders}" itemLabel="busProviderName" itemValue="busProviderId"/>
			</form:select><br/>
			Source: <form:input path="source" /><br/>
			Destination:<form:input path="destination" /><br/>
			Journey Date (dd/mm/yyyy): <form:input path="journeyDate" /><br/>
			Price: <form:input path="price" /><br/>
			Bus No : <form:input path="busNo" /><br/>
			<input type="submit" value="add journey"/>			
		</form:form>
	</body>
</html>















