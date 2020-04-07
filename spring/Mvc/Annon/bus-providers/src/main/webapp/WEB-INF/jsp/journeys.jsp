<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Journeys</title>
		<style type="text/css">
			h2 {
				font-family: consolas;
			}
			table.dataTable {
				border-collapse: collapse;
				font-family: consolas;
				font-size: 18px;
			}
			table.dataTable tr:nth-child(even) {
				background-color: RGB(232, 248, 255);
			}
			table.dataTable tr:nth-child(odd) {
				background-color: RGB(225, 255, 225);
			}
			table.dataTable tr td {
				padding: 8px;
			}
			table.dataTable tr th {
				padding: 12px 8px;
				background-color: RGB(255, 155, 155);
			}
		</style>
	</head>
	<body>
		<h2>Matching Journeys</h2>
		<p>Found for the search criteria</p>
		<table class="dataTable" border="1">
			<tr>
				<th>Source</th>
				<th>Destination</th>
				<th>Travel Date</th>
				<th>Price</th>
				<th>Bus Provider Name</th>
				<th>Book</th>
			</tr>
			<c:forEach items="${journeys}" var="journey">
				<tr>
					<td>${journey.source}</td>
					<td>${journey.destination}</td>
					<td><fmt:formatDate value="${journey.travelDate}" pattern="dd/MM/yyyy"/></td>
					<td>${journey.price}</td>
					<td>${journey.busProviderName}</td>
					<td>
						<a href="${pageContext.request.contextPath}/bookTicket.htm?journeyId=${journey.journeyId}">Book Ticket</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>











