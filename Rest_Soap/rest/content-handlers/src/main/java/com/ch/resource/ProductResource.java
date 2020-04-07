package com.ch.resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.StreamingOutput;

@Path("/product")
public class ProductResource {
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/in")
	public StreamingOutput newProduct(final InputStream in) {
		return (output) -> {
			int b = 0;
			while ((b = in.read()) != -1) {
				output.write(b);
			}
			output.close();
		};
	}

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/reader")
	public String newProduct(Reader reader) {
		StringBuilder builder = new StringBuilder();

		Stream<String> stream = new BufferedReader(reader).lines();
		stream.forEach((l) -> {
			builder.append(l);
		});

		return builder.toString();
	}

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/byte")
	public byte[] newProduct(byte[] body) {
		return body;
	}

	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/string")
	public String newProduct(String body) {
		return body;
	}

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/form")
	public String newProduct(MultivaluedMap<String, String> formData) {
		return extractMultiValuedMap(formData);
	}

	@PUT
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.MULTIPART_FORM_DATA)
	@Path("/{productNo}/upload")
	public File uploadProductImage(@PathParam("productNo") String producNo, File file) {
		return file;
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
