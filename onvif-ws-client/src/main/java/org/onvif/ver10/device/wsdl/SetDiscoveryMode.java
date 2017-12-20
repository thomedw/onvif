
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DiscoveryMode;


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
 *         &lt;element name="DiscoveryMode" type="{http://www.onvif.org/ver10/schema}DiscoveryMode"/&gt;
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
    "discoveryMode"
})
@XmlRootElement(name = "SetDiscoveryMode")
public class SetDiscoveryMode {

    @XmlElement(name = "DiscoveryMode", required = true)
    @XmlSchemaType(name = "string")
    protected DiscoveryMode discoveryMode;

    /**
     * Recupera il valore della proprietà discoveryMode.
     * 
     * @return
     *     possible object is
     *     {@link DiscoveryMode }
     *     
     */
    public DiscoveryMode getDiscoveryMode() {
        return discoveryMode;
    }

    /**
     * Imposta il valore della proprietà discoveryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscoveryMode }
     *     
     */
    public void setDiscoveryMode(DiscoveryMode value) {
        this.discoveryMode = value;
    }

}
