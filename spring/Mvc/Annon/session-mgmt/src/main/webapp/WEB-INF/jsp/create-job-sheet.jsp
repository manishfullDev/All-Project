<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Jobsheet Information</title>
		<style type="text/css">
			a {
				text-decoration: none;
				padding: 8px 12px;
				border: 1px solid black;
				background-color: green;
			}
			a:hover{
				background-color: gold; 
			}
		</style>
	</head>
	<body>
		<h2>Jobsheet Information</h2>
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
		<h3>Repair Information</h3>
		<h3>Vehicle Information</h3>
		<table>
			<tr>
				<td>Repair Information</td>
				<td>${jobSheetForm.repairInfo}</td>
				<td>Service Type</td>
				<td>${jobSheetForm.serviceType}</td>
				<td>Estimated Delivery Date</td>
				<td>${jobSheetForm.estimatedDeliveryDate}</td>
				<td>Estimated Cost</td>
				<td>${jobSheetForm.estimatedCost}</td>
			</tr>
			<a href="${pageContext.request.contextPath}/create-job-sheet.htm">Create Job Sheet</a>			
		</table>
	</body>
</html>











