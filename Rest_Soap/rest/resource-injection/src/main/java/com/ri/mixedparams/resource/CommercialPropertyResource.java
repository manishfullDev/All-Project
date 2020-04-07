package com.ri.mixedparams.resource;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

@Path("/business")
public class CommercialPropertyResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{location}/commercial/{sqft}/{parkingLevels}")
	public String searchCommercialComplex(@PathParam("location") String location, @PathParam("sqft") int sqft,
			@MatrixParam("floor") List<Integer> floors, @PathParam("parkingLevels") int parkingLevels,
			@QueryParam("liftProvision") boolean liftProvision, @QueryParam("facing") List<String> facing,
			@MatrixParam("seatingCapacity") int seatingCapacity, @MatrixParam("norms") List<String> norms,
			@MatrixParam("place") List<String> place) {
		StringBuffer buffer = null;
		buffer = new StringBuffer();
		buffer.append("location : [").append(location).append("] sqft : [").append(sqft).append("] parkingLevels : [")
				.append(parkingLevels).append("] liftProvision : [").append(liftProvision).append("] floors : [")
				.append(floors.toString()).append("] facing : [").append(facing.toString())
				.append("] seatingCapacity : [").append(seatingCapacity).append("] norms : [").append(norms.toString())
				.append("] place : [").append(place.toString()).append("]");

		return buffer.toString();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{location}/commercial/{parkingLevels}")
	public String searchCommercialComplex(@PathParam("location") PathSegment locationSegment,
			@PathParam("parkingLevels") PathSegment parkingLevelsSegment) {
		StringBuffer buffer = null;
		MultivaluedMap<String, String> matrixParams = null;

		buffer = new StringBuffer();
		buffer.append("location : [").append(locationSegment.getPath()).append("] ");
		matrixParams = locationSegment.getMatrixParameters();
		buffer.append(extractMultiValuedMap(matrixParams)).append(" parkingLevels : [")
				.append(parkingLevelsSegment.getPath()).append(" ]");
		matrixParams = parkingLevelsSegment.getMatrixParameters();
		buffer.append(extractMultiValuedMap(matrixParams));

		return buffer.toString();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{location}/facing/comercial/{parkingLevels}")
	public String searchCommercialComplex(@PathParam("location") String location,
			@PathParam("parkingLevels") int parkingLevels, @QueryParam("facing") @DefaultValue("east") String facing) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		buffer.append("location : [").append(location).append("] ");
		buffer.append(" parkingLevels : [").append(parkingLevels).append(" ]");
		buffer.append(" facing : [ ").append(facing).append(" ]");
		return buffer.toString();
	}

	// location, parkingLevels, facing, floors, sqft, norms, liftProvision, area,
	// capacity
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/advanced/{location}/commercial/{parkingLevels}")
	public String advancedSearchCommercialComplex(@Context UriInfo uriInfo) {
		StringBuffer buffer = null;
		List<PathSegment> pathSegments = null;

		buffer = new StringBuffer();
		pathSegments = uriInfo.getPathSegments();
		for (int i = 0; i < pathSegments.size(); i++) {
			PathSegment ps = pathSegments.get(i);
			buffer.append(ps.getPath()).append("[").append(i).append("] matrix parameters : [")
					.append(extractMultiValuedMap(ps.getMatrixParameters())).append(" ] ");
		}
		buffer.append(" query parameters :[ ").append(extractMultiValuedMap(uriInfo.getQueryParameters()));

		return buffer.toString();
	}

	private String extractMultiValuedMap(MultivaluedMap<String, String> matrixParameters) {
		StringBuffer buffer = null;

		buffer = new StringBuffer();
		for (String paramName : matrixParameters.keySet()) {
			buffer.append(" ").append(paramName).append(": [ ").append(matrixParameters.get(paramName).toString())
					.append(" ] ");
		}

		return buffer.toString();
	}

}
