<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty pageContext.request.userPrincipal.name}">
			${pageContext.request.userPrincipal.name}<a href="${pageContext.request.contextPath}/logout">logout</a>
		</c:when>
		<c:otherwise>
			<a href="${pageContext.request.contextPath}/user-login.htm">login</a>
		</c:otherwise>
	</c:choose>
</body>
</html>