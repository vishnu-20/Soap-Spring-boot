//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.25 at 08:19:28 pm IST 
//


package com.address.soap.api.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AvailabilityDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Resale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Upstream" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DownStream" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="AvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AvailabilityReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RfoDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BandwidthEnhancementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PortingEnhancementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CriticalAbsorbability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BandwidthDeterminationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Customertype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CurrentOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AvailabilityOption" type="{http://www.api.soap.address.com/model}AviailabilityOptionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityDetailType", propOrder = {
    "product",
    "resale",
    "upstream",
    "downStream",
    "availabilityIndicator",
    "availabilityReason",
    "rfoDate",
    "bandwidthEnhancementDate",
    "portingEnhancementDate",
    "criticalAbsorbability",
    "bandwidthDeterminationType",
    "customertype",
    "priority",
    "currentOffer",
    "availabilityOption"
})
public class AvailabilityDetailType {

    @XmlElement(name = "Product", required = true)
    protected String product;
    @XmlElement(name = "Resale")
    protected boolean resale;
    @XmlElement(name = "Upstream", required = true)
    protected BigInteger upstream;
    @XmlElement(name = "DownStream", required = true)
    protected BigInteger downStream;
    @XmlElement(name = "AvailabilityIndicator", required = true)
    protected String availabilityIndicator;
    @XmlElement(name = "AvailabilityReason", required = true)
    protected String availabilityReason;
    @XmlElement(name = "RfoDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rfoDate;
    @XmlElement(name = "BandwidthEnhancementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bandwidthEnhancementDate;
    @XmlElement(name = "PortingEnhancementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar portingEnhancementDate;
    @XmlElement(name = "CriticalAbsorbability")
    protected boolean criticalAbsorbability;
    @XmlElement(name = "BandwidthDeterminationType", required = true)
    protected String bandwidthDeterminationType;
    @XmlElement(name = "Customertype", required = true)
    protected String customertype;
    @XmlElement(name = "Priority", required = true)
    protected BigInteger priority;
    @XmlElement(name = "CurrentOffer")
    protected boolean currentOffer;
    @XmlElement(name = "AvailabilityOption", required = true)
    protected List<AviailabilityOptionType> availabilityOption;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the resale property.
     * 
     */
    public boolean isResale() {
        return resale;
    }

    /**
     * Sets the value of the resale property.
     * 
     */
    public void setResale(boolean value) {
        this.resale = value;
    }

    /**
     * Gets the value of the upstream property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpstream() {
        return upstream;
    }

    /**
     * Sets the value of the upstream property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpstream(BigInteger value) {
        this.upstream = value;
    }

    /**
     * Gets the value of the downStream property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDownStream() {
        return downStream;
    }

    /**
     * Sets the value of the downStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDownStream(BigInteger value) {
        this.downStream = value;
    }

    /**
     * Gets the value of the availabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityIndicator() {
        return availabilityIndicator;
    }

    /**
     * Sets the value of the availabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityIndicator(String value) {
        this.availabilityIndicator = value;
    }

    /**
     * Gets the value of the availabilityReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityReason() {
        return availabilityReason;
    }

    /**
     * Sets the value of the availabilityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityReason(String value) {
        this.availabilityReason = value;
    }

    /**
     * Gets the value of the rfoDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRfoDate() {
        return rfoDate;
    }

    /**
     * Sets the value of the rfoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRfoDate(XMLGregorianCalendar value) {
        this.rfoDate = value;
    }

    /**
     * Gets the value of the bandwidthEnhancementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBandwidthEnhancementDate() {
        return bandwidthEnhancementDate;
    }

    /**
     * Sets the value of the bandwidthEnhancementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBandwidthEnhancementDate(XMLGregorianCalendar value) {
        this.bandwidthEnhancementDate = value;
    }

    /**
     * Gets the value of the portingEnhancementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPortingEnhancementDate() {
        return portingEnhancementDate;
    }

    /**
     * Sets the value of the portingEnhancementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPortingEnhancementDate(XMLGregorianCalendar value) {
        this.portingEnhancementDate = value;
    }

    /**
     * Gets the value of the criticalAbsorbability property.
     * 
     */
    public boolean isCriticalAbsorbability() {
        return criticalAbsorbability;
    }

    /**
     * Sets the value of the criticalAbsorbability property.
     * 
     */
    public void setCriticalAbsorbability(boolean value) {
        this.criticalAbsorbability = value;
    }

    /**
     * Gets the value of the bandwidthDeterminationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidthDeterminationType() {
        return bandwidthDeterminationType;
    }

    /**
     * Sets the value of the bandwidthDeterminationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidthDeterminationType(String value) {
        this.bandwidthDeterminationType = value;
    }

    /**
     * Gets the value of the customertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
     * Sets the value of the customertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomertype(String value) {
        this.customertype = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the currentOffer property.
     * 
     */
    public boolean isCurrentOffer() {
        return currentOffer;
    }

    /**
     * Sets the value of the currentOffer property.
     * 
     */
    public void setCurrentOffer(boolean value) {
        this.currentOffer = value;
    }

    /**
     * Gets the value of the availabilityOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AviailabilityOptionType }
     * 
     * 
     */
    public List<AviailabilityOptionType> getAvailabilityOption() {
        if (availabilityOption == null) {
            availabilityOption = new ArrayList<AviailabilityOptionType>();
        }
        return this.availabilityOption;
    }

}
