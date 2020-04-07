<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Bus Providers</title>
	</head>
	<body style="font-family: Tahoma; font-size: 24px;">
		<h2>Search Bus Providers</h2>
		<form action="${pageContext.request.contextPath}/doSearchBusProviders.htm" method="post">
			From : <input type="text" name="fromDate"/><br/>
			To : <input type="Text" name="toDate"/>
			<input type="submit" value="go"/>
		</form>
		<c:if test="${busProviders ne null}">
			
			<table>
				<tr>
					<td align="right">
						<a href="${pageContext.request.contextPath}/doSearchBusProviders.htm?fromDate=<fmt:formatDate value="${fromDate}" pattern="dd-mm-yyyy"/>&toDate=<fmt:formatDate value="${toDate}" pattern="dd-mm-yyyy"/>&view=xls">xls</a>
					</td>
					<td align="right">
						<a href="${pageContext.request.contextPath}/doSearchBusProviders.htm?fromDate=<fmt:formatDate value="${fromDate}" pattern="dd-mm-yyyy"/>&toDate=<fmt:formatDate value="${toDate}" pattern="dd-mm-yyyy"/>&view=pdf">pdf</a>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<table>
							<tr>
								<th>Bus Provider Name</th>
								<th>Contact No</th>
								<th>Email Address</th>
							</tr>
							<c:forEach items="${busProviders}" var="busProvider">
								<tr>
									<td>${busProvider.businessName}</td>
									<td>${busProvider.contactNo}</td>
									<td>${busProvider.emailAddress}</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
			</table>
		</c:if>
	</body>
</html>




















