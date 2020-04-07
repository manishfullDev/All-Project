
package com.railenquiry.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "pnrStatusResponse", namespace = "http://www.irctc.co.in/enquiry/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pnrStatusResponse", namespace = "http://www.irctc.co.in/enquiry/service")
public class PnrStatusResponse {

    @XmlElement(name = "status", namespace = "http://www.irctc.co.in/enquiry/types")
    private String status;

    /**
     * 
     * @return
     *     returns String
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * 
     * @param status
     *     the value for the status property
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
