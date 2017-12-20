
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayLogicalState;


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
 *         &lt;element name="LogicalState" type="{http://www.onvif.org/ver10/schema}RelayLogicalState"/&gt;
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
    "logicalState"
})
@XmlRootElement(name = "SetRelayOutputState")
public class SetRelayOutputState {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;
    @XmlElement(name = "LogicalState", required = true)
    @XmlSchemaType(name = "string")
    protected RelayLogicalState logicalState;

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
     * Recupera il valore della proprietà logicalState.
     * 
     * @return
     *     possible object is
     *     {@link RelayLogicalState }
     *     
     */
    public RelayLogicalState getLogicalState() {
        return logicalState;
    }

    /**
     * Imposta il valore della proprietà logicalState.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayLogicalState }
     *     
     */
    public void setLogicalState(RelayLogicalState value) {
        this.logicalState = value;
    }

}
