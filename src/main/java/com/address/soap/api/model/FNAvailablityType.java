//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.25 at 08:19:28 pm IST 
//


package com.address.soap.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNAvailablityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FNAvailablityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Resulttext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AvailabilityInformation" type="{http://www.api.soap.address.com/model}AvilabilityInformationType" maxOccurs="unbounded"/>
 *         &lt;element name="NumberHits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdditionalInformation" type="{http://www.api.soap.address.com/model}AdditionalInformationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNAvailablityType", propOrder = {
    "resultCode",
    "resulttext",
    "availabilityInformation",
    "numberHits",
    "additionalInformation"
})
public class FNAvailablityType {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "Resulttext", required = true)
    protected String resulttext;
    @XmlElement(name = "AvailabilityInformation", required = true)
    protected List<AvilabilityInformationType> availabilityInformation;
    @XmlElement(name = "NumberHits", required = true)
    protected String numberHits;
    @XmlElement(name = "AdditionalInformation", required = true)
    protected List<AdditionalInformationType> additionalInformation;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resulttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResulttext() {
        return resulttext;
    }

    /**
     * Sets the value of the resulttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResulttext(String value) {
        this.resulttext = value;
    }

    /**
     * Gets the value of the availabilityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvilabilityInformationType }
     * 
     * 
     */
    public List<AvilabilityInformationType> getAvailabilityInformation() {
        if (availabilityInformation == null) {
            availabilityInformation = new ArrayList<AvilabilityInformationType>();
        }
        return this.availabilityInformation;
    }

    /**
     * Gets the value of the numberHits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberHits() {
        return numberHits;
    }

    /**
     * Sets the value of the numberHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberHits(String value) {
        this.numberHits = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationType }
     * 
     * 
     */
    public List<AdditionalInformationType> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformationType>();
        }
        return this.additionalInformation;
    }

}