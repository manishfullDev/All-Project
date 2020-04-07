<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Package Details</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Package Details</h2>
		Package Name: ${subscription.packageName}
		<br/>
		Topups:
		<c:forEach items="${subscription.topups}" var="topup">
			${topup}&nbsp;&nbsp;
		</c:forEach>
		<br/>
		Channels:
		<c:forEach items="${subscription.channels}" var="channel">
			${channel}&nbsp;&nbsp;
		</c:forEach>
		<br/>
		Subscription Amount: ${subscription.amount}
		<br/>
		Validity Days: ${subscription.days}		
	</body>
</html>

















