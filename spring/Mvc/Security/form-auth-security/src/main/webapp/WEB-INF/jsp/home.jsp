<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home</title>
		<style type="text/css">
			* {
				font-family: consolas;
				font-size: 20px;
			}
		</style>
	</head>
	<body>
		<jsp:include page="authentication-details.jsp"/>
		<h2>Home</h2>
		<security:authorize access="hasAuthority('MANAGER')">
			<a href="${pageContext.request.contextPath}/project-info.htm">Project Information</a>
		</security:authorize>
		
	</body>
</html>












