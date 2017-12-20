
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
    "serialPortConfiguration"
})
@XmlRootElement(name = "GetSerialPortConfigurationResponse")
public class GetSerialPortConfigurationResponse {

    @XmlElement(name = "SerialPortConfiguration", required = true)
    protected SerialPortConfiguration serialPortConfiguration;

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

}
