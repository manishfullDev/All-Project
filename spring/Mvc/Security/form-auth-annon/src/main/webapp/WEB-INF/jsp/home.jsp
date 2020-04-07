<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<security:authorize access="hasAuthority('MANAGER')">
			<a href="${pageContext.request.contextPath}/list-projects.htm">List Projects</a>
		</security:authorize>
				
	</body>
</html>














