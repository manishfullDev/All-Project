<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Personal Loan</title>
	</head>
	<body>
		<h1>Personal Loan</h1>
		<form action="personalLoan" method="post">
			<h2>Loan Information</h2>
			Loan Amount: <input type="text" name="loanAmount"/><br/>
			Tenure : <input type="Text" name="tenure"/><br/>
			Interest Rate: <input type="Text" name="interestRate"/><br/>
			Purpose: <input type="Text" name="purpose"/><br/>
			<br/>
			<h2>Personal Information</h2>
			Applicant Name: <input type="text" name="applicantName"/><br/>
			Dob (dd/mm/yyyy): <input type="text" name="dob"/><br/>
			Gender: Male <input type="Radio" name="gender" value="male"/> (or) Female <input type="radio" name="gender" value="female"/><br/>
			Mobile No: <input type="text" name="mobileNo"/><br/>
			Email Address: <input type="text" name="emailAddress"/><br/>
			<input type="submit" value="apply"/>		
		</form>
	</body>
</html>















