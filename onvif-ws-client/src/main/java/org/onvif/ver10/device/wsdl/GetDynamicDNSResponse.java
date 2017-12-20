
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.DynamicDNSInformation;


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
 *         &lt;element name="DynamicDNSInformation" type="{http://www.onvif.org/ver10/schema}DynamicDNSInformation"/&gt;
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
    "dynamicDNSInformation"
})
@XmlRootElement(name = "GetDynamicDNSResponse")
public class GetDynamicDNSResponse {

    @XmlElement(name = "DynamicDNSInformation", required = true)
    protected DynamicDNSInformation dynamicDNSInformation;

    /**
     * Recupera il valore della proprietà dynamicDNSInformation.
     * 
     * @return
     *     possible object is
     *     {@link DynamicDNSInformation }
     *     
     */
    public DynamicDNSInformation getDynamicDNSInformation() {
        return dynamicDNSInformation;
    }

    /**
     * Imposta il valore della proprietà dynamicDNSInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicDNSInformation }
     *     
     */
    public void setDynamicDNSInformation(DynamicDNSInformation value) {
        this.dynamicDNSInformation = value;
    }

}
