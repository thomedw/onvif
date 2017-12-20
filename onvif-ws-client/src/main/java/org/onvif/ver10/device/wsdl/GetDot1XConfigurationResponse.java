
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Dot1XConfiguration;


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
 *         &lt;element name="Dot1XConfiguration" type="{http://www.onvif.org/ver10/schema}Dot1XConfiguration"/&gt;
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
    "dot1XConfiguration"
})
@XmlRootElement(name = "GetDot1XConfigurationResponse")
public class GetDot1XConfigurationResponse {

    @XmlElement(name = "Dot1XConfiguration", required = true)
    protected Dot1XConfiguration dot1XConfiguration;

    /**
     * Recupera il valore della proprietà dot1XConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link Dot1XConfiguration }
     *     
     */
    public Dot1XConfiguration getDot1XConfiguration() {
        return dot1XConfiguration;
    }

    /**
     * Imposta il valore della proprietà dot1XConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot1XConfiguration }
     *     
     */
    public void setDot1XConfiguration(Dot1XConfiguration value) {
        this.dot1XConfiguration = value;
    }

}
