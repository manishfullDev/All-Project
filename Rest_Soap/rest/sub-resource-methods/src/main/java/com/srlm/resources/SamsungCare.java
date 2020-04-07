package com.srlm.resources;

import javax.ws.rs.Path;

@Path("/samsungCare")
public class SamsungCare {

	@Path("/appliances")
	public HomeAppliancesCare getHomeAppliancesSupport() {
		return new HomeAppliancesCare();
	}

	@Path("/electronics")
	public ElectronicsCare getElectronicsSupport() {
		return new ElectronicsCare();
	}

}
