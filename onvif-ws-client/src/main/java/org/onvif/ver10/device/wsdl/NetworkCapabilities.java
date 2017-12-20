
package org.onvif.ver10.device.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per NetworkCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IPFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ZeroConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IPVersion6" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DynDNS" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dot11Configuration" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Dot1XConfigurations" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="HostnameFromDHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NTP" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="DHCPv6" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilities")
public class NetworkCapabilities {

    @XmlAttribute(name = "IPFilter")
    protected Boolean ipFilter;
    @XmlAttribute(name = "ZeroConfiguration")
    protected Boolean zeroConfiguration;
    @XmlAttribute(name = "IPVersion6")
    protected Boolean ipVersion6;
    @XmlAttribute(name = "DynDNS")
    protected Boolean dynDNS;
    @XmlAttribute(name = "Dot11Configuration")
    protected Boolean dot11Configuration;
    @XmlAttribute(name = "Dot1XConfigurations")
    protected Integer dot1XConfigurations;
    @XmlAttribute(name = "HostnameFromDHCP")
    protected Boolean hostnameFromDHCP;
    @XmlAttribute(name = "NTP")
    protected Integer ntp;
    @XmlAttribute(name = "DHCPv6")
    protected Boolean dhcPv6;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà ipFilter.
     * This getter has been renamed from isIPFilter() to getIPFilter() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIPFilter() {
        return ipFilter;
    }

    /**
     * Imposta il valore della proprietà ipFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPFilter(Boolean value) {
        this.ipFilter = value;
    }

    /**
     * Recupera il valore della proprietà zeroConfiguration.
     * This getter has been renamed from isZeroConfiguration() to getZeroConfiguration() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getZeroConfiguration() {
        return zeroConfiguration;
    }

    /**
     * Imposta il valore della proprietà zeroConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroConfiguration(Boolean value) {
        this.zeroConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà ipVersion6.
     * This getter has been renamed from isIPVersion6() to getIPVersion6() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIPVersion6() {
        return ipVersion6;
    }

    /**
     * Imposta il valore della proprietà ipVersion6.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIPVersion6(Boolean value) {
        this.ipVersion6 = value;
    }

    /**
     * Recupera il valore della proprietà dynDNS.
     * This getter has been renamed from isDynDNS() to getDynDNS() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynDNS() {
        return dynDNS;
    }

    /**
     * Imposta il valore della proprietà dynDNS.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynDNS(Boolean value) {
        this.dynDNS = value;
    }

    /**
     * Recupera il valore della proprietà dot11Configuration.
     * This getter has been renamed from isDot11Configuration() to getDot11Configuration() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDot11Configuration() {
        return dot11Configuration;
    }

    /**
     * Imposta il valore della proprietà dot11Configuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDot11Configuration(Boolean value) {
        this.dot11Configuration = value;
    }

    /**
     * Recupera il valore della proprietà dot1XConfigurations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDot1XConfigurations() {
        return dot1XConfigurations;
    }

    /**
     * Imposta il valore della proprietà dot1XConfigurations.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDot1XConfigurations(Integer value) {
        this.dot1XConfigurations = value;
    }

    /**
     * Recupera il valore della proprietà hostnameFromDHCP.
     * This getter has been renamed from isHostnameFromDHCP() to getHostnameFromDHCP() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHostnameFromDHCP() {
        return hostnameFromDHCP;
    }

    /**
     * Imposta il valore della proprietà hostnameFromDHCP.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostnameFromDHCP(Boolean value) {
        this.hostnameFromDHCP = value;
    }

    /**
     * Recupera il valore della proprietà ntp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNTP() {
        return ntp;
    }

    /**
     * Imposta il valore della proprietà ntp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTP(Integer value) {
        this.ntp = value;
    }

    /**
     * Recupera il valore della proprietà dhcPv6.
     * This getter has been renamed from isDHCPv6() to getDHCPv6() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDHCPv6() {
        return dhcPv6;
    }

    /**
     * Imposta il valore della proprietà dhcPv6.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHCPv6(Boolean value) {
        this.dhcPv6 = value;
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
