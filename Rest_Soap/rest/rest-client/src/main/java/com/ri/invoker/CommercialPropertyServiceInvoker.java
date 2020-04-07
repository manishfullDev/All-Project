package com.ri.invoker;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class CommercialPropertyServiceInvoker {
	private Client client;
	private final String ROOT_RESOURCE_URI = "http://localhost:8082/resource-injection/services/business";
	private final String SEARCH_COMMERCIAL_COMPLEX__SUB_URI = "/{location}/facing/comercial/{parkingLevels}";
	private final String SEARCH_COMMERCIAL_COMPLEX_WITH_FILTERS = "/{location}";

	public CommercialPropertyServiceInvoker() {
		client = ClientBuilder.newClient();
	}

	public String searchCommercialComplex(String location, int parkingLevels, String facing) {
		String complexes = null;
		WebTarget target = null;
		Response response = null;
		Invocation invocation = null;
		Invocation.Builder builder = null;

		target = client.target(ROOT_RESOURCE_URI).path(SEARCH_COMMERCIAL_COMPLEX__SUB_URI)
				.resolveTemplate("location", location).resolveTemplate("parkingLevels", parkingLevels)
				.queryParam("facing", facing);
		System.out.println(target.toString());
		builder = target.request();
		invocation = builder.buildGet();
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			complexes = response.readEntity(String.class);
		}
		return complexes;
	}

	public String searchCommercialComplex(String location, int sqft, int parkingLevels, List<Integer> floors,
			int seatingCapacity, List<String> norms, List<String> places, boolean liftProvision, String facing) {
		WebTarget target = null;
		Response response = null;
		Invocation invocation = null;
		String matchingComplexes = null;
		Invocation.Builder builder = null;

		target = client.target(ROOT_RESOURCE_URI).path(SEARCH_COMMERCIAL_COMPLEX_WITH_FILTERS)
				.resolveTemplate("location", location).matrixParam("norms", norms).matrixParam("place", places)
				.path("/commercial/{sqft}").resolveTemplate("sqft", sqft).matrixParam("floor", floors.get(0))
				.matrixParam("seatingCapacity", seatingCapacity).path("{parkingLevels}")
				.resolveTemplate("parkingLevels", parkingLevels).matrixParam("floor", floors.get(1))
				.queryParam("liftProvision", liftProvision).queryParam("facing", facing);
		System.out.println(target.toString());
		builder = target.request();
		invocation = builder.buildGet();
		response = invocation.invoke();
		if (response.getStatus() == 200) {
			response.bufferEntity();
			matchingComplexes = response.readEntity(String.class);
		}

		return matchingComplexes;
	}
}
