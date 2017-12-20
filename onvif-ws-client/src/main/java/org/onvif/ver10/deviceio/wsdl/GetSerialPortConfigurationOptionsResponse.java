
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
 *         &lt;element name="SerialPortOptions" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfigurationOptions"/&gt;
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
    "serialPortOptions"
})
@XmlRootElement(name = "GetSerialPortConfigurationOptionsResponse")
public class GetSerialPortConfigurationOptionsResponse {

    @XmlElement(name = "SerialPortOptions", required = true)
    protected SerialPortConfigurationOptions serialPortOptions;

    /**
     * Recupera il valore della proprietà serialPortOptions.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfigurationOptions }
     *     
     */
    public SerialPortConfigurationOptions getSerialPortOptions() {
        return serialPortOptions;
    }

    /**
     * Imposta il valore della proprietà serialPortOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfigurationOptions }
     *     
     */
    public void setSerialPortOptions(SerialPortConfigurationOptions value) {
        this.serialPortOptions = value;
    }

}
