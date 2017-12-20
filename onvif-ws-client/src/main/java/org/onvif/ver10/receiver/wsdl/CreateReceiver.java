
package org.onvif.ver10.receiver.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ReceiverConfiguration;


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
 *         &lt;element name="Configuration" type="{http://www.onvif.org/ver10/schema}ReceiverConfiguration"/&gt;
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
    "configuration"
})
@XmlRootElement(name = "CreateReceiver")
public class CreateReceiver {

    @XmlElement(name = "Configuration", required = true)
    protected ReceiverConfiguration configuration;

    /**
     * Recupera il valore della proprietà configuration.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverConfiguration }
     *     
     */
    public ReceiverConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Imposta il valore della proprietà configuration.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverConfiguration }
     *     
     */
    public void setConfiguration(ReceiverConfiguration value) {
        this.configuration = value;
    }

}
