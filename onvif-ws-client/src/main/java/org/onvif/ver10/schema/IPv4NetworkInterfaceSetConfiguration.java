
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IPv4NetworkInterfaceSetConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IPv4NetworkInterfaceSetConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv4Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DHCP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4NetworkInterfaceSetConfiguration", propOrder = {
    "enabled",
    "manual",
    "dhcp"
})
public class IPv4NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "Manual")
    protected List<PrefixedIPv4Address> manual;
    @XmlElement(name = "DHCP")
    protected Boolean dhcp;

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
     * Gets the value of the manual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv4Address }
     * 
     * 
     */
    public List<PrefixedIPv4Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv4Address>();
        }
        return this.manual;
    }

    /**
     * Recupera il valore della proprietà dhcp.
     * This getter has been renamed from isDHCP() to getDHCP() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDHCP() {
        return dhcp;
    }

    /**
     * Imposta il valore della proprietà dhcp.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDHCP(Boolean value) {
        this.dhcp = value;
    }

}
