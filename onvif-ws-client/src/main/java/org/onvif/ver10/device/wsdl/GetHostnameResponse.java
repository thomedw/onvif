
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.HostnameInformation;


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
 *         &lt;element name="HostnameInformation" type="{http://www.onvif.org/ver10/schema}HostnameInformation"/&gt;
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
    "hostnameInformation"
})
@XmlRootElement(name = "GetHostnameResponse")
public class GetHostnameResponse {

    @XmlElement(name = "HostnameInformation", required = true)
    protected HostnameInformation hostnameInformation;

    /**
     * Recupera il valore della proprietà hostnameInformation.
     * 
     * @return
     *     possible object is
     *     {@link HostnameInformation }
     *     
     */
    public HostnameInformation getHostnameInformation() {
        return hostnameInformation;
    }

    /**
     * Imposta il valore della proprietà hostnameInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link HostnameInformation }
     *     
     */
    public void setHostnameInformation(HostnameInformation value) {
        this.hostnameInformation = value;
    }

}
