package com.rm.resources;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.rm.dto.MemberDto;
import com.rm.dto.NewMemberRequestDto;
import com.rm.dto.NewMemberResponseDto;
import com.rm.dto.RedeemPointsRequestDto;
import com.rm.dto.RedeemPointsResponseDto;

@Path("/payback-merchant-service")
public class MerchantPaybackService {
	private static Map<String, MemberDto> memberMap = new ConcurrentHashMap<String, MemberDto>();

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput newMember(InputStream in) throws ParserConfigurationException, SAXException, IOException {
		NewMemberRequestDto newMemberRequestDto = null;
		NewMemberResponseDto newMemberResponseDto = null;
		MemberDto memberDto = null;
		NewMemberResponseStreamingOuput newMemberResponseStreamingOuput = null;

		newMemberRequestDto = buildNewMemberRequestDto(in);

		// database insert logic
		memberDto = new MemberDto();
		memberDto.setPaybackCardNo(UUID.randomUUID().toString());
		memberDto.setCardHolderName(newMemberRequestDto.getCardHolderName());
		memberDto.setIssuedDate(new Date());
		memberDto.setMobileNo(newMemberRequestDto.getMobileNo());
		memberDto.setPointsInAmount(100);
		memberDto.setTotalPoints(100);
		memberMap.put(memberDto.getPaybackCardNo(), memberDto);

		newMemberResponseDto = new NewMemberResponseDto();
		newMemberResponseDto.setCardHolderName(newMemberRequestDto.getCardHolderName());
		newMemberResponseDto.setPaybackCardNo(memberDto.getPaybackCardNo());
		newMemberResponseDto.setIssuedDate(memberDto.getIssuedDate());
		newMemberResponseDto.setMobileNo(newMemberRequestDto.getMobileNo());
		newMemberResponseDto.setMessage("Your card will activte in 24 hours");
		newMemberResponseDto.setStatus("Pending");

		newMemberResponseStreamingOuput = new NewMemberResponseStreamingOuput(newMemberResponseDto);

		return newMemberResponseStreamingOuput;
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput getMember(@QueryParam("paybackCardNo") String paybackCardNo,
			@QueryParam("muic") String merchantUniqueIdentificationCode, @QueryParam("apiSecret") String apiSecret) {
		MemberDto memberDto = null;
		MemberStreamingOutput memberStreamingOutput = null;

		if (memberMap.containsKey(paybackCardNo)) {
			memberDto = memberMap.get(paybackCardNo);
		} else {
			throw new IllegalArgumentException("paybackCardNo not found");
		}
		memberStreamingOutput = new MemberStreamingOutput(memberDto);
		return memberStreamingOutput;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public StreamingOutput redeemPoints(InputStream in) throws ParserConfigurationException, SAXException, IOException {
		RedeemPointsRequestDto redeemPointsRequestDto = null;
		RedeemPointsResponseDto redeemPointsResponseDto = null;
		MemberDto memberDto = null;
		RedeemPointsResponseStreamingOutput redeemPointsResponseStreamingOutput = null;

		redeemPointsRequestDto = buildRedeemPointsRequestDto(in);
		if (memberMap.containsKey(redeemPointsRequestDto.getPaybackCardNo()) == false) {
			throw new IllegalArgumentException("paybackCardNo not found");
		}

		memberDto = memberMap.get(redeemPointsRequestDto.getPaybackCardNo());
		memberDto.setTotalPoints((int) (memberDto.getTotalPoints() - (redeemPointsRequestDto.getInvoiceAmount())));
		memberDto.setPointsInAmount(memberDto.getTotalPoints());
		memberMap.put(memberDto.getPaybackCardNo(), memberDto);

		redeemPointsResponseDto = new RedeemPointsResponseDto();
		redeemPointsResponseDto.setPaybackCardNo(redeemPointsRequestDto.getPaybackCardNo());
		redeemPointsResponseDto.setInvoiceNo(redeemPointsRequestDto.getInvoiceNo());
		redeemPointsResponseDto.setPointsRedeemed((int) (redeemPointsRequestDto.getInvoiceAmount()));
		redeemPointsResponseDto.setRedeemReferenceNo(UUID.randomUUID().toString());
		redeemPointsResponseDto.setBillingCustomerName(redeemPointsRequestDto.getBillingCustomerName());
		redeemPointsResponseDto.setStatus("approved");
		redeemPointsResponseStreamingOutput = new RedeemPointsResponseStreamingOutput(redeemPointsResponseDto);
		return redeemPointsResponseStreamingOutput;
	}

	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String blockCard(@QueryParam("paybackCardNo") String paybackCardNo,
			@QueryParam("muic") String merchantUniqueIdentificationCode, @QueryParam("apiSecret") String apiSecret,
			@QueryParam("reason") String reason) {
		if (memberMap.containsKey(paybackCardNo)) {
			return "blocked";
		}
		throw new IllegalArgumentException("paybackCardNo not found");
	}

	private NewMemberRequestDto buildNewMemberRequestDto(InputStream in)
			throws ParserConfigurationException, SAXException, IOException {
		NewMemberRequestDto newMemberRequestDto = null;
		DocumentBuilderFactory documentBuilderFactory = null;
		DocumentBuilder builder = null;
		Node rootElement = null;
		NodeList children = null;
		Document doc = null;
		Node child = null;
		String elementName = null;
		String elementValue = null;

		documentBuilderFactory = DocumentBuilderFactory.newInstance();
		builder = documentBuilderFactory.newDocumentBuilder();
		doc = builder.parse(in);
		rootElement = doc.getFirstChild();
		children = rootElement.getChildNodes();

		newMemberRequestDto = new NewMemberRequestDto();
		for (int i = 0; i < children.getLength(); i++) {
			child = children.item(i);
			if (child.getNodeType() == Node.ELEMENT_NODE) {
				elementName = child.getNodeName();
				elementValue = child.getFirstChild().getNodeValue();

				if (elementName.equals("card-holder-name")) {
					newMemberRequestDto.setCardHolderName(elementValue);
				} else if (elementName.equals("mobile-no")) {
					newMemberRequestDto.setMobileNo(elementValue);
				} else if (elementName.equals("email-address")) {
					newMemberRequestDto.setEmailAddress(elementValue);
				} else if (elementName.equals("age")) {
					newMemberRequestDto.setAge(Integer.parseInt(elementValue));
				} else if (elementName.equals("gender")) {
					newMemberRequestDto.setGender(elementValue);
				} else if (elementName.equals("referral-merchant-unique-identification-code")) {
					newMemberRequestDto.setReferralMerchantUniqueIdentificationCode(elementValue);
				}
			}
		}

		return newMemberRequestDto;
	}

	private RedeemPointsRequestDto buildRedeemPointsRequestDto(InputStream in)
			throws ParserConfigurationException, SAXException, IOException {
		RedeemPointsRequestDto redeemPointsRequestDto = null;
		DocumentBuilderFactory documentBuilderFactory = null;
		DocumentBuilder builder = null;
		Document doc = null;
		Node rootElement = null;
		NodeList children = null;
		Node child = null;
		String elementName = null;
		String elementValue = null;

		documentBuilderFactory = DocumentBuilderFactory.newInstance();
		builder = documentBuilderFactory.newDocumentBuilder();
		doc = builder.parse(in);

		redeemPointsRequestDto = new RedeemPointsRequestDto();
		rootElement = doc.getFirstChild();
		children = rootElement.getChildNodes();

		for (int i = 0; i < children.getLength(); i++) {
			child = children.item(i);
			if (child.getNodeType() == Node.ELEMENT_NODE) {
				elementName = child.getNodeName();
				elementValue = child.getFirstChild().getNodeValue();

				if (elementName.equals("payback-card-no")) {
					redeemPointsRequestDto.setPaybackCardNo(elementValue);
				} else if (elementName.equals("invoice-no")) {
					redeemPointsRequestDto.setInvoiceNo(elementValue);
				} else if (elementName.equals("billing-customer-name")) {
					redeemPointsRequestDto.setBillingCustomerName(elementValue);
				} else if (elementName.equals("invoice-amount")) {
					redeemPointsRequestDto.setInvoiceAmount(Double.parseDouble(elementValue));
				} else if (elementName.equals("pin")) {
					redeemPointsRequestDto.setPin(Integer.parseInt(elementValue));
				}
			}
		}

		return redeemPointsRequestDto;
	}

	private final class NewMemberResponseStreamingOuput implements StreamingOutput {
		private NewMemberResponseDto newMemberResponseDto;

		public NewMemberResponseStreamingOuput(NewMemberResponseDto newMemberResponseDto) {
			this.newMemberResponseDto = newMemberResponseDto;
		}

		@Override
		public void write(OutputStream output) throws IOException, WebApplicationException {
			StringBuffer buffer = null;

			buffer = new StringBuffer();
			buffer.append("<new-member-response><payback-card-no>").append(newMemberResponseDto.getPaybackCardNo())
					.append("</payback-card-no><card-holder-name>").append(newMemberResponseDto.getCardHolderName())
					.append("</card-holder-name><mobile-no>").append(newMemberResponseDto.getMobileNo())
					.append("</mobile-no><issued-date>").append(newMemberResponseDto.getIssuedDate())
					.append("</issued-date><message>").append(newMemberResponseDto.getMessage())
					.append("</message><status>").append(newMemberResponseDto.getStatus())
					.append("</status></new-member-response>");
			output.write(buffer.toString().getBytes());
			output.close();
		}
	}

	private final class MemberStreamingOutput implements StreamingOutput {
		private MemberDto memberDto;

		public MemberStreamingOutput(MemberDto memberDto) {
			this.memberDto = memberDto;
		}

		@Override
		public void write(OutputStream output) throws IOException, WebApplicationException {
			StringBuffer buffer = null;

			buffer = new StringBuffer();
			buffer.append("<member><payback-card-no>").append(memberDto.getPaybackCardNo())
					.append("</payback-card-no><card-holder-name>").append(memberDto.getCardHolderName())
					.append("</card-holder-name><mobile-no>").append(memberDto.getMobileNo())
					.append("</mobile-no><total-points>").append(memberDto.getTotalPoints())
					.append("</total-points></member>");
			output.write(buffer.toString().getBytes());
			output.close();
		}
	}

	private final class RedeemPointsResponseStreamingOutput implements StreamingOutput {
		private RedeemPointsResponseDto redeemPointsResponseDto;

		public RedeemPointsResponseStreamingOutput(RedeemPointsResponseDto redeemPointsResponseDto) {
			this.redeemPointsResponseDto = redeemPointsResponseDto;
		}

		@Override
		public void write(OutputStream output) throws IOException, WebApplicationException {
			StringBuffer buffer = null;

			buffer = new StringBuffer();
			buffer.append("<redeem-points-response><payback-card-no>")
					.append(redeemPointsResponseDto.getPaybackCardNo()).append("</payback-card-no><invoice-no>")
					.append(redeemPointsResponseDto.getInvoiceNo()).append("</invoice-no><billing-customer-name>")
					.append(redeemPointsResponseDto.getBillingCustomerName())
					.append("</billing-customer-name><points-redeemed>")
					.append(redeemPointsResponseDto.getPointsRedeemed()).append("</points-redeemed><status>")
					.append(redeemPointsResponseDto.getStatus()).append("</status></redeem-points-response>");
			output.write(buffer.toString().getBytes());
			output.close();
		}

	}
}
