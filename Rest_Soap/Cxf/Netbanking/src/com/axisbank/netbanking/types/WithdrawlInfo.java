
package com.axisbank.netbanking.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="atmNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="debitCardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountNo",
    "atmNo",
    "debitCardNo",
    "amount",
    "accountType"
})
@XmlRootElement(name = "withdrawlInfo")
public class WithdrawlInfo {

    @XmlElement(required = true)
    protected String accountNo;
    @XmlElement(required = true)
    protected String atmNo;
    @XmlElement(required = true)
    protected String debitCardNo;
    protected int amount;
    @XmlElement(required = true)
    protected String accountType;

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the atmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmNo() {
        return atmNo;
    }

    /**
     * Sets the value of the atmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmNo(String value) {
        this.atmNo = value;
    }

    /**
     * Gets the value of the debitCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCardNo() {
        return debitCardNo;
    }

    /**
     * Sets the value of the debitCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCardNo(String value) {
        this.debitCardNo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

}
