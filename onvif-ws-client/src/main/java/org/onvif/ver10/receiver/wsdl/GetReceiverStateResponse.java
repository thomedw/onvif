
package org.onvif.ver10.receiver.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReceiverStateInformation;


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
 *         &lt;element name="ReceiverState" type="{http://www.onvif.org/ver10/schema}ReceiverStateInformation"/&gt;
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
    "receiverState"
})
@XmlRootElement(name = "GetReceiverStateResponse")
public class GetReceiverStateResponse {

    @XmlElement(name = "ReceiverState", required = true)
    protected ReceiverStateInformation receiverState;

    /**
     * Recupera il valore della proprietà receiverState.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverStateInformation }
     *     
     */
    public ReceiverStateInformation getReceiverState() {
        return receiverState;
    }

    /**
     * Imposta il valore della proprietà receiverState.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverStateInformation }
     *     
     */
    public void setReceiverState(ReceiverStateInformation value) {
        this.receiverState = value;
    }

}
