
package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PTZConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
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
    "ptzConfigurationToken"
})
@XmlRootElement(name = "GetConfiguration")
public class GetConfiguration {

    @XmlElement(name = "PTZConfigurationToken", required = true)
    protected String ptzConfigurationToken;

    /**
     * Recupera il valore della proprietà ptzConfigurationToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTZConfigurationToken() {
        return ptzConfigurationToken;
    }

    /**
     * Imposta il valore della proprietà ptzConfigurationToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTZConfigurationToken(String value) {
        this.ptzConfigurationToken = value;
    }

}
