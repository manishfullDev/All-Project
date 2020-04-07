<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Albums</title>
		<script type="text/javascript">
			function go(action) {
				var form = null;
				var actionHidden = null;
				
				form = document.getElementById("albumForm");
				actionHidden = document.getElementById("action");
				actionHidden.value=action;

				
				form.submit();
			}
		</script>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Album</h2>
		<form id="albumForm" action="${pageContext.request.contextPath}/browse" method="post">
			Album: 
			<select name="album">
				<c:forEach items="${albums}" var="album">
					<c:choose>
						<c:when test="${album.albumNo eq albumNo}">
							<option value="${album.albumNo}" selected="selected">${album.description}</option>
						</c:when>
						<c:otherwise>
							<option value="${album.albumNo}">${album.description}</option>	
						</c:otherwise>
					</c:choose>
					
				</c:forEach>
			</select>
			&nbsp;&nbsp;&nbsp;<input type="button" value="go" onclick="go('album')"/>
			<br/><br/>
			<hr style="border: 1px"/>
			
			<div style="border: 1px">
				<table>
					<tr>
						<td colspan="2">
							<img src="${pageContext.request.contextPath}/photo?photoNo=${photo.photoNo}&mediaType=${photo.photoMediaType}" width="400" height="200"/>
						</td>
					</tr>
					<tr>
						<td align="left">
							<c:if test="${firstPhotoNo ne photo.photoNo}">
								<input type="button" value="&lt;" onClick="go('prev')"/>
							</c:if>
						</td>
						<td align="right">
							<c:if test="${lastPhotoNo ne photo.photoNo}">
								<input type="button" value="&gt;" onclick="go('next')"/>
							</c:if>
						</td>
					</tr>
					
				</table>
			</div>
			
			<input type="hidden" id="action" name="action"/>
			<input type="hidden" id="cPhotoNo" name="cPhotoNo" value="${photo.photoNo}"/>
		</form>
	</body>
</html>











