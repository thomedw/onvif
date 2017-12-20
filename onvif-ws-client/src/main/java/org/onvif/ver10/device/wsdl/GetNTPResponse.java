
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.NTPInformation;


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
 *         &lt;element name="NTPInformation" type="{http://www.onvif.org/ver10/schema}NTPInformation"/&gt;
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
    "ntpInformation"
})
@XmlRootElement(name = "GetNTPResponse")
public class GetNTPResponse {

    @XmlElement(name = "NTPInformation", required = true)
    protected NTPInformation ntpInformation;

    /**
     * Recupera il valore della proprietà ntpInformation.
     * 
     * @return
     *     possible object is
     *     {@link NTPInformation }
     *     
     */
    public NTPInformation getNTPInformation() {
        return ntpInformation;
    }

    /**
     * Imposta il valore della proprietà ntpInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link NTPInformation }
     *     
     */
    public void setNTPInformation(NTPInformation value) {
        this.ntpInformation = value;
    }

}
