package com.fjr.boot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(description = "Railway Services", title = "Railway Service"), servers = {
		@Server(url = "http://localhost:8080/first-jersey-rest/", description = "development") })
public class Bootstrap {

}
