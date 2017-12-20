
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="MessageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "timeout",
    "messageLimit",
    "any"
})
@XmlRootElement(name = "PullMessages")
public class PullMessages {

    @XmlElement(name = "Timeout", required = true)
    protected Duration timeout;
    @XmlElement(name = "MessageLimit")
    protected int messageLimit;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Recupera il valore della proprietà timeout.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Imposta il valore della proprietà timeout.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }

    /**
     * Recupera il valore della proprietà messageLimit.
     * 
     */
    public int getMessageLimit() {
        return messageLimit;
    }

    /**
     * Imposta il valore della proprietà messageLimit.
     * 
     */
    public void setMessageLimit(int value) {
        this.messageLimit = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
