
package org.onvif.ver10.deviceio.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayOutput;


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
 *         &lt;element name="RelayOutput" type="{http://www.onvif.org/ver10/schema}RelayOutput"/&gt;
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
    "relayOutput"
})
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    @XmlElement(name = "RelayOutput", required = true)
    protected RelayOutput relayOutput;

    /**
     * Recupera il valore della proprietà relayOutput.
     * 
     * @return
     *     possible object is
     *     {@link RelayOutput }
     *     
     */
    public RelayOutput getRelayOutput() {
        return relayOutput;
    }

    /**
     * Imposta il valore della proprietà relayOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayOutput }
     *     
     */
    public void setRelayOutput(RelayOutput value) {
        this.relayOutput = value;
    }

}
