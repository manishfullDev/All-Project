<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Bus Providers</title>
		<script type="text/javascript">
			function go(action) {
				var busProviderForm = null;
				var actionHidden = null;

				busProviderForm = document.getElementById("busProvidersForm");
				actionHidden = document.getElementById("action");

				actionHidden.value=action;
				
				busProviderForm.submit();
			}
		</script>
	</head>
	<body style="font-size: 24px;">
		<h2>Bus Providers</h2>
		<form id="busProvidersForm" action="${pageContext.request.contextPath}/busProviders" method="post">
			<table>
				<tr>
					<td colspan="3">
						<table border="1">
							<tr>
								<th>Business Name</th>
								<th>Contact No</th>
								<th>Email Address</th>
							</tr>
							<c:forEach items="${busProviders}" var="busProvider">
								<tr>
									<td>${busProvider.businessName}</td>
									<td>${busProvider.contactNo}</td>
									<td>${busProvider.emailAddress}</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
				<tr>
					<td align="left">
						<c:if test="${pageNo gt 1}">
							<input type="button" value="&lt;" onclick="go('prev')"/>
						</c:if>
					</td>
					<td align="center">
						${pageNo}&nbsp; of&nbsp; ${totalPages}
					</td>
					<td align="right">
						<c:if test="${pageNo lt totalPages}">
							<input type="button" value="&gt;" onclick="go('next')"/>
						</c:if>
					</td>
				</tr>
			</table>
			
			
			<input type="hidden" id="pageNo" name="pageNo" value="${pageNo}"/>
			<input type="hidden" id="action" name="action"/>
		</form>
	</body>
</html>



















