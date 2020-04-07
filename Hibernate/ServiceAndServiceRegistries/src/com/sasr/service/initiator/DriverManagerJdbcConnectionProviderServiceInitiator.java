package com.sasr.service.initiator;

import java.util.Map;

import org.hibernate.engine.jdbc.connections.internal.ConnectionProviderInitiator;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;

import com.sasr.service.DriverManagerJdbcConnectionProvider;

public class DriverManagerJdbcConnectionProviderServiceInitiator extends ConnectionProviderInitiator {

	@Override
	public Class<ConnectionProvider> getServiceInitiated() {
		return super.getServiceInitiated();
	}

	@Override
	public ConnectionProvider initiateService(Map configurationMap, ServiceRegistryImplementor serviceRegistry) {
		DriverManagerJdbcConnectionProvider driverManagerJdbcConnectionProvider = null;
		driverManagerJdbcConnectionProvider = new DriverManagerJdbcConnectionProvider();

		return driverManagerJdbcConnectionProvider;
	}

}
