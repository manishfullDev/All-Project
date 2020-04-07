<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-family: consolas;font-size: 20px;">
	<p>
		Today : <fmt:formatDate value="${today}" pattern="dd/MM/yyyy hh:mm:ss"/>
	</p>
</body>
</html>