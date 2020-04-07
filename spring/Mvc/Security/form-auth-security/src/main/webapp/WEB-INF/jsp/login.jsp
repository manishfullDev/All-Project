<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
		<style type="text/css">
			* {
				font-family: consolas;
				font-size: 20px;
			}
		</style>
	</head>
	<body>
		<h2>Login</h2>
		<p style="color:red;">
			<%--
			<c:if test="${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message ne null}">
				<c:out value="${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}"/>
			</c:if>
			 --%>
			<c:if test="${param.bad ne null}">
				Username and Password is not valid
			</c:if>
			<c:if test="${param.locked ne null}">
				User is locked
			</c:if>
			<c:if test="${param.disabled ne null}">
				User is disabled
			</c:if>
			<c:if test="${param.expired ne null}">
				User is expired
			</c:if>
		</p>		
		<form action="${pageContext.request.contextPath}/j_security_check" method="post">
			Username : <input type="text" name="j_username"/><br/>
			Password: <input type="password" name="j_password"/><br/>
			<input type="submit" value="Login"/>
		</form>
	</body>
</html>







