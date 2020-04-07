<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Choose Package</title>
	</head>
	<body>
		<h2>Choose Packages</h2>
		<br/>
		<form action="${pageContext.request.contextPath}/showPackageDetails" method="post">
			Packages:
			<hr style="border: 1px;">
			<br/>
			South Super value Package: <input type="radio" name="package" value="south super value"/> &nbsp; &nbsp; North Dhamal Mix Package <input type="radio" name="package" value="north dhamal mix"/>
			<br/>
			Top ups:
			<hr style="border: 1px;">
			<br/>
			Kids: <input type="checkbox" name="topup" value="kids"/> &nbsp; &nbsp; Sports: <input type="checkbox" name="topup" value="sports"/>
			<br/>
			<input type="submit" value="show"/>			
		</form>
	</body>
</html>












