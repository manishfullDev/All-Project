<%@page import="com.delicious.dto.OfferDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Restaurant Offers</title>
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
		  <h2>Restaurant With Offers</h2>
		  <p>Nearest Restaurants with offers</p>
		  <div class="row">
			  <c:forEach items="${restaurantOffers}" var="restaurantOffer" varStatus="loopStatus" >
			  		<c:set var="offers" value="${restaurantOffer.offers}" scope="request"/>
			  	<c:if test="${loopStatus.index % 3 eq 0}">
			  		</div>
			  		<div class="row">
			  	</c:if>
					    <div class="col-md-4">
					      <div class="thumbnail">
					        <a href="#" data-toggle="modal" data-target="#restaurantOffer${restaurantOffer.restaurantNo}-model" target="_blank">
					          <img src="${pageContext.request.contextPath}/images/restaurant-image${restaurantOffer.restaurantNo}.jpg" alt="restaurant" style="width:100%">
					          <div class="caption">
					            <p><b>${restaurantOffer.restaurantName}</b></p>
					            <p>Cusine: ${restaurantOffer.restaurantType} &nbsp; Hours: ${restaurantOffer.openingHours} hrs - ${restaurantOffer.closingHours} &nbsp; Area: ${restaurantOffer.area}</p>
					          </div>
					        </a>
					      </div>
					    </div>
						<div class="modal fade" id="restaurantOffer${restaurantOffer.restaurantNo}-model" role="dialog">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">&times;</button>
										<h4 class="modal-title">${restaurantOffer.restaurantName}</h4>
									</div>
									<div class="modal-body">
										<%
											List<OfferDto> offers =(List<OfferDto>) request.getAttribute("offers");
											for(OfferDto dto : offers) {%>
												<p><%=dto.getDescription()%></p>
										<%		
											}
										%>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
			</c:forEach>
		  </div>
		</div>	
	</body>
</html>