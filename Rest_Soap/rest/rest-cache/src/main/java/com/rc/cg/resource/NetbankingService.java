package com.rc.cg.resource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import com.rc.cg.dto.Account;
import com.rc.cg.dto.Error;

@Path("/netbanking")
public class NetbankingService {
	private Map<Long, Account> accountsMap;

	public NetbankingService() {
		Account account = null;

		accountsMap = new ConcurrentHashMap<Long, Account>();

		account = new Account();
		account.setAccountNo(12345);
		account.setAccountHolderName("Ricky Jr");
		account.setAccountType("savings");
		account.setBranchCode("ba039");
		account.setAddressLine1("Fire Station Road");
		account.setCity("Banglore");
		account.setState("KN");
		account.setZip(93834);
		account.setCountry("India");
		account.setBalance(2300);

		accountsMap.put(12345L, account);

		account = new Account();
		account.setAccountNo(98765);
		account.setAccountHolderName("Renold Jr");
		account.setAccountType("savings");
		account.setBranchCode("ba038");
		account.setAddressLine1("Church Street");
		account.setCity("Chennai");
		account.setState("tn");
		account.setZip(93433);
		account.setCountry("India");
		account.setBalance(12300);

		accountsMap.put(98765L, account);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/account/{accountNo}/details")
	public Response getAccountDetails(@PathParam("accountNo") long accountNo, @Context Request request) {
		long eTagNo = 0;
		EntityTag entityTag = null;
		Account account = null;
		Response response = null;
		CacheControl cacheControl = null;

		if (accountsMap.containsKey(accountNo) == false) {
			com.rc.cg.dto.Error error = new Error("100", "account no not exists");
			response = Response.status(Status.BAD_REQUEST).entity(Entity.json(error)).build();
			throw new WebApplicationException(response);
		}
		account = accountsMap.get(accountNo);
		eTagNo = account.hashCode();
		entityTag = new EntityTag(String.valueOf(eTagNo));

		ResponseBuilder builder = request.evaluatePreconditions(entityTag);
		if (builder != null) {
			return builder.build();
		}

		cacheControl = new CacheControl();
		cacheControl.setPrivate(true);
		cacheControl.setMaxAge(1000 * 60 * 10);
		cacheControl.setMustRevalidate(true);

		response = Response.ok(account).cacheControl(cacheControl).tag(entityTag).build();
		return response;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateAccount(Account account) {
		Response response = null;

		if (accountsMap.containsKey(account.getAccountNo()) == false) {
			com.rc.cg.dto.Error error = new Error("100", "account no not exists");
			response = Response.status(Status.BAD_REQUEST).entity(Entity.json(error)).build();
			throw new WebApplicationException(response);
		}
		accountsMap.put(account.getAccountNo(), account);
		response = Response.noContent().build();
		return response;
	}

}
