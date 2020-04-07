package com.profile.annon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component("productAccessor")*/
public class ProductAccessor {
	/* @Autowired */
	private ConnectionManager connectionManager;

	public void setConnectionManager(ConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}

	public void showConnection() {
		System.out.println(connectionManager);
	}
}
