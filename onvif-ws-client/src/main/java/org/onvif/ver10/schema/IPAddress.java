
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per IPAddress complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IPAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.onvif.org/ver10/schema}IPType"/&gt;
 *         &lt;element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}IPv4Address" minOccurs="0"/&gt;
 *         &lt;element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}IPv6Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddress", propOrder = {
    "type",
    "iPv4Address",
    "iPv6Address"
})
public class IPAddress {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected IPType type;
    @XmlElement(name = "IPv4Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv4Address;
    @XmlElement(name = "IPv6Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv6Address;

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link IPType }
     *     
     */
    public IPType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link IPType }
     *     
     */
    public void setType(IPType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà iPv4Address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv4Address() {
        return iPv4Address;
    }

    /**
     * Imposta il valore della proprietà iPv4Address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv4Address(String value) {
        this.iPv4Address = value;
    }

    /**
     * Recupera il valore della proprietà iPv6Address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv6Address() {
        return iPv6Address;
    }

    /**
     * Imposta il valore della proprietà iPv6Address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv6Address(String value) {
        this.iPv6Address = value;
    }

}
