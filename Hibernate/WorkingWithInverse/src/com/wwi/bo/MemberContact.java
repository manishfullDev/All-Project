package com.wwi.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MemberContact {
	protected String memberName;
	protected String emailAddress;
	protected String mobileNo;

}
