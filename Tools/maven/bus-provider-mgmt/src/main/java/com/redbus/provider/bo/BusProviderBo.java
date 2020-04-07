package com.redbus.provider.bo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BusProviderBo implements Serializable {
	protected int busProviderId;
	protected String businessName;
	protected String primaryBusinessContactNo;
	protected String primaryBusinessEmailAddress;

}
