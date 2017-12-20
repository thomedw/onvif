
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per NetworkHost complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkHost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.onvif.org/ver10/schema}NetworkHostType"/&gt;
 *         &lt;element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}IPv4Address" minOccurs="0"/&gt;
 *         &lt;element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}IPv6Address" minOccurs="0"/&gt;
 *         &lt;element name="DNSname" type="{http://www.onvif.org/ver10/schema}DNSName" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkHostExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkHost", propOrder = {
    "type",
    "iPv4Address",
    "iPv6Address",
    "dnSname",
    "extension"
})
public class NetworkHost {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkHostType type;
    @XmlElement(name = "IPv4Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv4Address;
    @XmlElement(name = "IPv6Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv6Address;
    @XmlElement(name = "DNSname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dnSname;
    @XmlElement(name = "Extension")
    protected NetworkHostExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link NetworkHostType }
     *     
     */
    public NetworkHostType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkHostType }
     *     
     */
    public void setType(NetworkHostType value) {
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

    /**
     * Recupera il valore della proprietà dnSname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNSname() {
        return dnSname;
    }

    /**
     * Imposta il valore della proprietà dnSname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNSname(String value) {
        this.dnSname = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link NetworkHostExtension }
     *     
     */
    public NetworkHostExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkHostExtension }
     *     
     */
    public void setExtension(NetworkHostExtension value) {
        this.extension = value;
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
