
package org.onvif.ver10.receiver.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReceiverMode;


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
 *         &lt;element name="ReceiverToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ReceiverMode"/&gt;
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
    "receiverToken",
    "mode"
})
@XmlRootElement(name = "SetReceiverMode")
public class SetReceiverMode {

    @XmlElement(name = "ReceiverToken", required = true)
    protected String receiverToken;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiverMode mode;

    /**
     * Recupera il valore della proprietà receiverToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverToken() {
        return receiverToken;
    }

    /**
     * Imposta il valore della proprietà receiverToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverToken(String value) {
        this.receiverToken = value;
    }

    /**
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverMode }
     *     
     */
    public ReceiverMode getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverMode }
     *     
     */
    public void setMode(ReceiverMode value) {
        this.mode = value;
    }

}
