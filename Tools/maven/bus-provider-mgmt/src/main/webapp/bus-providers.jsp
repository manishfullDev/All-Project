<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Bus Providers</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Bus Providers</h2>
		<table>
			<tr>
				<th>Business Name</th>
				<th>Contact No</th>
				<th>Email Address</th>
			</tr>
			<c:forEach items="${busProviders}" var="busProvider">
				<tr>
					<td>${busProvider.businessName}</td>
					<td>${busProvider.primaryBusinessContactNo}</td>
					<td>${busProvider.primaryBusinessEmailAddress}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>















