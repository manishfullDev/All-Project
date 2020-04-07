package in.airtel.recharge.service;

import java.util.UUID;

import javax.jws.WebService;

import in.airtel.recharge.types.Cause;
import in.airtel.recharge.types.Receipt;
import in.airtel.recharge.types.Topup;

@WebService(endpointInterface = "in.airtel.recharge.service.RechargeGatewayPartner")
public class RechargeGatewayPartnerImpl implements RechargeGatewayPartner {

	@Override
	public Receipt recharge(Topup in) throws MobileNotValidFault {
		Receipt receipt = null;
		Cause cause = null;

		if (in.getMobileNo().trim().length() < 10) {
			cause = new Cause();
			cause.setErrorCause("Mobile No Not Valid");
			cause.setErrorType("Validation");
			throw new MobileNotValidFault("Mobile No not valid", cause);
		}
		receipt = new Receipt();
		receipt.setReferenceNo(UUID.randomUUID().toString());
		receipt.setStatus("Success");

		return receipt;
	}

}
