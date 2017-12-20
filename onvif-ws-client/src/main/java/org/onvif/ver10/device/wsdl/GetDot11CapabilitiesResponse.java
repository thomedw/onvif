
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Dot11Capabilities;


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
 *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/schema}Dot11Capabilities"/&gt;
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
    "capabilities"
})
@XmlRootElement(name = "GetDot11CapabilitiesResponse")
public class GetDot11CapabilitiesResponse {

    @XmlElement(name = "Capabilities", required = true)
    protected Dot11Capabilities capabilities;

    /**
     * Recupera il valore della proprietà capabilities.
     * 
     * @return
     *     possible object is
     *     {@link Dot11Capabilities }
     *     
     */
    public Dot11Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Imposta il valore della proprietà capabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11Capabilities }
     *     
     */
    public void setCapabilities(Dot11Capabilities value) {
        this.capabilities = value;
    }

}
