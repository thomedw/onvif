
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
 * <p>Classe Java per NetworkInterface complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Info" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceInfo" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceLink" minOccurs="0"/&gt;
 *         &lt;element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterface" minOccurs="0"/&gt;
 *         &lt;element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterface" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterface", propOrder = {
    "enabled",
    "info",
    "link",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterface
    extends DeviceEntity
{

    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "Info")
    protected NetworkInterfaceInfo info;
    @XmlElement(name = "Link")
    protected NetworkInterfaceLink link;
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterface iPv4;
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterface iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà enabled.
     * This getter has been renamed from isEnabled() to getEnabled() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietà enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Recupera il valore della proprietà info.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceInfo }
     *     
     */
    public NetworkInterfaceInfo getInfo() {
        return info;
    }

    /**
     * Imposta il valore della proprietà info.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceInfo }
     *     
     */
    public void setInfo(NetworkInterfaceInfo value) {
        this.info = value;
    }

    /**
     * Recupera il valore della proprietà link.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceLink }
     *     
     */
    public NetworkInterfaceLink getLink() {
        return link;
    }

    /**
     * Imposta il valore della proprietà link.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceLink }
     *     
     */
    public void setLink(NetworkInterfaceLink value) {
        this.link = value;
    }

    /**
     * Recupera il valore della proprietà iPv4.
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterface }
     *     
     */
    public IPv4NetworkInterface getIPv4() {
        return iPv4;
    }

    /**
     * Imposta il valore della proprietà iPv4.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterface }
     *     
     */
    public void setIPv4(IPv4NetworkInterface value) {
        this.iPv4 = value;
    }

    /**
     * Recupera il valore della proprietà iPv6.
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterface }
     *     
     */
    public IPv6NetworkInterface getIPv6() {
        return iPv6;
    }

    /**
     * Imposta il valore della proprietà iPv6.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterface }
     *     
     */
    public void setIPv6(IPv6NetworkInterface value) {
        this.iPv6 = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceExtension }
     *     
     */
    public NetworkInterfaceExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceExtension }
     *     
     */
    public void setExtension(NetworkInterfaceExtension value) {
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
