
package com.hdfc.netbanking.types;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "accountNo", "accountHolderName", "balance" })
@XmlRootElement(name = "account")
public class Account {

    @XmlElement(required = true)
    protected String accountNo;
    @XmlElement(required = true)
    protected String accountHolderName;
    protected float balance;

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
     * Gets the value of the accountHolderName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the balance property.
     *
     */
    public float getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     *
     */
    public void setBalance(float value) {
        this.balance = value;
    }

}
