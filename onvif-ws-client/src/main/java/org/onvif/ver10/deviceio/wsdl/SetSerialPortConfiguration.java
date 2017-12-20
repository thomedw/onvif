
package org.onvif.ver10.deviceio.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialPortConfiguration" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfiguration"/&gt;
 *         &lt;element name="ForcePersistance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serialPortConfiguration",
    "forcePersistance"
})
@XmlRootElement(name = "SetSerialPortConfiguration")
public class SetSerialPortConfiguration {

    @XmlElement(name = "SerialPortConfiguration", required = true)
    protected SerialPortConfiguration serialPortConfiguration;
    @XmlElement(name = "ForcePersistance")
    protected boolean forcePersistance;

    /**
     * Recupera il valore della proprietà serialPortConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public SerialPortConfiguration getSerialPortConfiguration() {
        return serialPortConfiguration;
    }

    /**
     * Imposta il valore della proprietà serialPortConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public void setSerialPortConfiguration(SerialPortConfiguration value) {
        this.serialPortConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà forcePersistance.
     * This getter has been renamed from isForcePersistance() to getForcePersistance() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getForcePersistance() {
        return forcePersistance;
    }

    /**
     * Imposta il valore della proprietà forcePersistance.
     * 
     */
    public void setForcePersistance(boolean value) {
        this.forcePersistance = value;
    }

}
