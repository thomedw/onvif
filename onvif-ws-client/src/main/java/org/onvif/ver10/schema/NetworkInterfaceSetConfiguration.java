
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per NetworkInterfaceSetConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceSetConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting" minOccurs="0"/&gt;
 *         &lt;element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterfaceSetConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterfaceSetConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkInterfaceSetConfiguration", propOrder = {
    "enabled",
    "link",
    "mtu",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "Link")
    protected NetworkInterfaceConnectionSetting link;
    @XmlElement(name = "MTU")
    protected Integer mtu;
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterfaceSetConfiguration iPv4;
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterfaceSetConfiguration iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceSetConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà enabled.
     * This getter has been renamed from isEnabled() to getEnabled() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietà enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Recupera il valore della proprietà link.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getLink() {
        return link;
    }

    /**
     * Imposta il valore della proprietà link.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setLink(NetworkInterfaceConnectionSetting value) {
        this.link = value;
    }

    /**
     * Recupera il valore della proprietà mtu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTU() {
        return mtu;
    }

    /**
     * Imposta il valore della proprietà mtu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTU(Integer value) {
        this.mtu = value;
    }

    /**
     * Recupera il valore della proprietà iPv4.
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv4NetworkInterfaceSetConfiguration getIPv4() {
        return iPv4;
    }

    /**
     * Imposta il valore della proprietà iPv4.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public void setIPv4(IPv4NetworkInterfaceSetConfiguration value) {
        this.iPv4 = value;
    }

    /**
     * Recupera il valore della proprietà iPv6.
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv6NetworkInterfaceSetConfiguration getIPv6() {
        return iPv6;
    }

    /**
     * Imposta il valore della proprietà iPv6.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public void setIPv6(IPv6NetworkInterfaceSetConfiguration value) {
        this.iPv6 = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public NetworkInterfaceSetConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public void setExtension(NetworkInterfaceSetConfigurationExtension value) {
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
