
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeviceServiceCapabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceServiceCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Network" type="{http://www.onvif.org/ver10/device/wsdl}NetworkCapabilities"/&gt;
 *         &lt;element name="Security" type="{http://www.onvif.org/ver10/device/wsdl}SecurityCapabilities"/&gt;
 *         &lt;element name="System" type="{http://www.onvif.org/ver10/device/wsdl}SystemCapabilities"/&gt;
 *         &lt;element name="Misc" type="{http://www.onvif.org/ver10/device/wsdl}MiscCapabilities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceServiceCapabilities", propOrder = {
    "network",
    "security",
    "system",
    "misc"
})
public class DeviceServiceCapabilities {

    @XmlElement(name = "Network", required = true)
    protected NetworkCapabilities network;
    @XmlElement(name = "Security", required = true)
    protected SecurityCapabilities security;
    @XmlElement(name = "System", required = true)
    protected SystemCapabilities system;
    @XmlElement(name = "Misc")
    protected MiscCapabilities misc;

    /**
     * Recupera il valore della proprietà network.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCapabilities }
     *     
     */
    public NetworkCapabilities getNetwork() {
        return network;
    }

    /**
     * Imposta il valore della proprietà network.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCapabilities }
     *     
     */
    public void setNetwork(NetworkCapabilities value) {
        this.network = value;
    }

    /**
     * Recupera il valore della proprietà security.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilities }
     *     
     */
    public SecurityCapabilities getSecurity() {
        return security;
    }

    /**
     * Imposta il valore della proprietà security.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilities }
     *     
     */
    public void setSecurity(SecurityCapabilities value) {
        this.security = value;
    }

    /**
     * Recupera il valore della proprietà system.
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilities }
     *     
     */
    public SystemCapabilities getSystem() {
        return system;
    }

    /**
     * Imposta il valore della proprietà system.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilities }
     *     
     */
    public void setSystem(SystemCapabilities value) {
        this.system = value;
    }

    /**
     * Recupera il valore della proprietà misc.
     * 
     * @return
     *     possible object is
     *     {@link MiscCapabilities }
     *     
     */
    public MiscCapabilities getMisc() {
        return misc;
    }

    /**
     * Imposta il valore della proprietà misc.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscCapabilities }
     *     
     */
    public void setMisc(MiscCapabilities value) {
        this.misc = value;
    }

}
