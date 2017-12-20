
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
 *         &lt;element name="PresetTourToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
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
    "presetTourToken"
})
@XmlRootElement(name = "CreatePresetTourResponse")
public class CreatePresetTourResponse {

    @XmlElement(name = "PresetTourToken", required = true)
    protected String presetTourToken;

    /**
     * Recupera il valore della proprietà presetTourToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetTourToken() {
        return presetTourToken;
    }

    /**
     * Imposta il valore della proprietà presetTourToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresetTourToken(String value) {
        this.presetTourToken = value;
    }

}
