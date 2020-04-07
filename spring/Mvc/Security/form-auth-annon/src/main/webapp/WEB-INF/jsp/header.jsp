<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
	<c:when test="${not empty pageContext.request.userPrincipal.name }">
		<b>${pageContext.request.userPrincipal.name}</b> &nbsp; <a href="${pageContext.request.contextPath}/logout">Logout</a>
	</c:when>
	<c:otherwise>
		<a href="${pageContext.request.contextPath}/login-page.htm">Login</a>
	</c:otherwise>
</c:choose>
 