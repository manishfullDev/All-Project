<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Companies</title>
	</head>
	<body>
		<h2>Companies</h2>
		Hai Sriman
		<p style="color: red; font-family: consolas; font-size: 20px;">
			DevTools: ${devtools}
		</p>
		<table>
			<tr>
				<th>Company No</th>
				<th>Business Name</th>
				<th>Established Date</th>
			</tr>
			<c:forEach items="${companies}" var="company">
				<tr>
					<td>${company.companyNo}</td>
					<td>${company.companyName}</td>
					<td><fmt:formatDate value="${company.establishedDate}" pattern="dd/MM/yyyy"/> </td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>