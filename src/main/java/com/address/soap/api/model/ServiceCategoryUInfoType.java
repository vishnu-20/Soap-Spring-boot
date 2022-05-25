//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.25 at 08:19:28 pm IST 
//


package com.address.soap.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceCategoryUInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCategoryUInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Marketability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketingText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MieterBonus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCategoryUInfoType", propOrder = {
    "serviceCategory",
    "providerType",
    "marketability",
    "marketingText",
    "mieterBonus"
})
public class ServiceCategoryUInfoType {

    @XmlElement(name = "ServiceCategory", required = true)
    protected String serviceCategory;
    @XmlElement(name = "ProviderType", required = true)
    protected String providerType;
    @XmlElement(name = "Marketability", required = true)
    protected String marketability;
    @XmlElement(name = "MarketingText", required = true)
    protected String marketingText;
    @XmlElement(name = "MieterBonus")
    protected boolean mieterBonus;

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the marketability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketability() {
        return marketability;
    }

    /**
     * Sets the value of the marketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketability(String value) {
        this.marketability = value;
    }

    /**
     * Gets the value of the marketingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingText() {
        return marketingText;
    }

    /**
     * Sets the value of the marketingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingText(String value) {
        this.marketingText = value;
    }

    /**
     * Gets the value of the mieterBonus property.
     * 
     */
    public boolean isMieterBonus() {
        return mieterBonus;
    }

    /**
     * Sets the value of the mieterBonus property.
     * 
     */
    public void setMieterBonus(boolean value) {
        this.mieterBonus = value;
    }

}
