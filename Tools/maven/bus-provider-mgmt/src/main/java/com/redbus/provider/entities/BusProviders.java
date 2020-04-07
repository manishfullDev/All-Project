package com.redbus.provider.entities;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusProviders implements Serializable {
	private static final long serialVersionUID = -4299673073139544932L;
	protected int busProviderId;
	protected String businessName;
	protected Date associatedDate;
	protected String primaryBusinessContactNo;
	protected String primaryBusinessEmailAddress;
	protected String status;

}
