
package com.railenquiry.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "pnrStatus", namespace = "http://www.irctc.co.in/enquiry/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pnrStatus", namespace = "http://www.irctc.co.in/enquiry/service")
public class PnrStatus {

    @XmlElement(name = "pnrNo", namespace = "http://www.irctc.co.in/enquiry/types")
    private String pnrNo;

    /**
     * 
     * @return
     *     returns String
     */
    public String getPnrNo() {
        return this.pnrNo;
    }

    /**
     * 
     * @param pnrNo
     *     the value for the pnrNo property
     */
    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }

}
