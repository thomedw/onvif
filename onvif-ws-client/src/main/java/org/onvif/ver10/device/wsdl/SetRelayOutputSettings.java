
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayOutputSettings;


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
 *         &lt;element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Properties" type="{http://www.onvif.org/ver10/schema}RelayOutputSettings"/&gt;
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
    "relayOutputToken",
    "properties"
})
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;
    @XmlElement(name = "Properties", required = true)
    protected RelayOutputSettings properties;

    /**
     * Recupera il valore della proprietà relayOutputToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayOutputToken() {
        return relayOutputToken;
    }

    /**
     * Imposta il valore della proprietà relayOutputToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    /**
     * Recupera il valore della proprietà properties.
     * 
     * @return
     *     possible object is
     *     {@link RelayOutputSettings }
     *     
     */
    public RelayOutputSettings getProperties() {
        return properties;
    }

    /**
     * Imposta il valore della proprietà properties.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayOutputSettings }
     *     
     */
    public void setProperties(RelayOutputSettings value) {
        this.properties = value;
    }

}
