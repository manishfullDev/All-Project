<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Repair Information</title>
	</head>
	<body>
		<h2>Repair Information</h2>
		<h3>Vehicle Information</h3>
		<table>
			<tr>
				<td>Owner Name</td>
				<td>${jobSheetForm.ownerName}</td>
				<td>Mobile No</td>
				<td>${jobSheetForm.mobileNo}</td>
				<td>Email Address</td>
				<td>${jobSheetForm.emailAddress}</td>
			</tr>
			<tr>
				<td>Vehicle No:</td>
				<td>${jobSheetForm.vehicleNo}</td>
				<td>Model:</td>
				<td>${jobSheetForm.model}</td>
				<td>Manufacturer:</td>
				<td>${jobSheetForm.manufacturer}</td>
			</tr>
		</table>
		<hr>
		<h3>Add Repair</h3>
		<form:form action="add-repair-info.htm" modelAttribute="jobSheetForm">
			<p style="color: red;">
				<form:errors path="*"/>
			</p>
			Service Type: Free Service <form:radiobutton path="serviceType" value="Free"/> (or) Paid Service : <form:radiobutton path="serviceType" value="Paid"/>
			Kilometers Ran: <form:input path="kilometers"/><br/>
			Repair Information: <form:textarea path="repairInfo" cols="20" rows="5" />
			Estimated Delivery Date: <form:input path="estimatedDeliveryDate"/><br/>
			Estimated Cost: <form:input path="estimatedCost"/><br/>
			<input type="submit" value="next"/>			
		</form:form>
	</body>
</html>















