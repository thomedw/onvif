
package org.xmlsoap.schemas.ws._2004._08.addressing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per EndpointReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EndpointReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://schemas.xmlsoap.org/ws/2004/08/addressing}AttributedURI"/&gt;
 *         &lt;element name="ReferenceProperties" type="{http://schemas.xmlsoap.org/ws/2004/08/addressing}ReferencePropertiesType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceParameters" type="{http://schemas.xmlsoap.org/ws/2004/08/addressing}ReferenceParametersType" minOccurs="0"/&gt;
 *         &lt;element name="PortType" type="{http://schemas.xmlsoap.org/ws/2004/08/addressing}AttributedQName" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName" type="{http://schemas.xmlsoap.org/ws/2004/08/addressing}ServiceNameType" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointReferenceType", propOrder = {
    "address",
    "referenceProperties",
    "referenceParameters",
    "portType",
    "serviceName",
    "any"
})
public class EndpointReferenceType {

    @XmlElement(name = "Address", required = true)
    protected AttributedURI address;
    @XmlElement(name = "ReferenceProperties")
    protected ReferencePropertiesType referenceProperties;
    @XmlElement(name = "ReferenceParameters")
    protected ReferenceParametersType referenceParameters;
    @XmlElement(name = "PortType")
    protected AttributedQName portType;
    @XmlElement(name = "ServiceName")
    protected ServiceNameType serviceName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURI }
     *     
     */
    public AttributedURI getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURI }
     *     
     */
    public void setAddress(AttributedURI value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà referenceProperties.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePropertiesType }
     *     
     */
    public ReferencePropertiesType getReferenceProperties() {
        return referenceProperties;
    }

    /**
     * Imposta il valore della proprietà referenceProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePropertiesType }
     *     
     */
    public void setReferenceProperties(ReferencePropertiesType value) {
        this.referenceProperties = value;
    }

    /**
     * Recupera il valore della proprietà referenceParameters.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceParametersType }
     *     
     */
    public ReferenceParametersType getReferenceParameters() {
        return referenceParameters;
    }

    /**
     * Imposta il valore della proprietà referenceParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceParametersType }
     *     
     */
    public void setReferenceParameters(ReferenceParametersType value) {
        this.referenceParameters = value;
    }

    /**
     * Recupera il valore della proprietà portType.
     * 
     * @return
     *     possible object is
     *     {@link AttributedQName }
     *     
     */
    public AttributedQName getPortType() {
        return portType;
    }

    /**
     * Imposta il valore della proprietà portType.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedQName }
     *     
     */
    public void setPortType(AttributedQName value) {
        this.portType = value;
    }

    /**
     * Recupera il valore della proprietà serviceName.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNameType }
     *     
     */
    public ServiceNameType getServiceName() {
        return serviceName;
    }

    /**
     * Imposta il valore della proprietà serviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNameType }
     *     
     */
    public void setServiceName(ServiceNameType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
