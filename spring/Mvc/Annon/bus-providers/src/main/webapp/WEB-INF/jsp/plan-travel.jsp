<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Plan Travel</title>
		<style type="text/css">
			* {
				font-family: Tahoma;
				font-size: 20px;
			}
			select {
				font-family: Tahoma;
				font-size: 20px;
				padding: 5px 10px;
				border: 1px solid black;
			}
			input[type='text'] {
				font-family: Tahoma;
				font-size: 20px;
				padding: 5px 10px;
				border: 1px solid black;
			}
			input[type='submit'] {
				font-family: Tahoma;
				font-size: 20px;
			}
		</style>
	</head>
	<body>
		<h2>Plan Travel</h2>
		<form action="${pageContext.request.contextPath}/plan-travel.htm" method="post">
			Bus Providers:
			<select name="busProviderId">
				<option></option>
				<c:forEach items="${busProviders}" var="busProvider">
					<option value="${busProvider.busProviderId}">${busProvider.busProviderName}</option>
				</c:forEach>
			</select>
			<br/>
			Source:
			<input type="text" name="source"/><br/>
			Destination: <input type="text" name="destination"/><br/>
			Travel Date (dd/mm/yyyy): <input type="text" name="travelDate"/><br/>
			Min Price: <input type="text" name="minPrice"/> - Max Price: <input type="text" name="maxPrice"/> <br/>
			<input type="submit" value="plan travel"/>			
		</form>
	</body>
</html>















