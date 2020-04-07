<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create Account</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/openAccount" method="post">
			Account Holder Name: <input type="text" name="accountHolderName"/><br/>
			Account Type: Savings: <input type="Radio" name="accountType" value="savings"/> (or) Current : <input type="Radio" name="accountType" value="current"/>
			<br/>
			Mobile No: <input type="text" name="mobileNo"/><br/>
			Email Address: <input type="text" name="emailAddress"/><br/>
			<input type="hidden" name="cToken" value="${cToken}"/>
			<input type="submit" value="open"/> 
		</form>
	</body>
</html>