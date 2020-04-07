<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<h2>Login</h2>
		<c:if test="${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message ne null}">
			<p style="color:red;">
				${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}
			</p>
		</c:if>
		<form action="${pageContext.request.contextPath}/login" method="post">
			Username: <input type="Text" name="j_username"/><br/>
			Password: <input type="password" name="j_password"/><br/>
			<input type="submit" value="login"/>
		</form>
	</body>
</html>
















