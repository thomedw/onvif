
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="WsdlUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
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
    "wsdlUrl"
})
@XmlRootElement(name = "GetWsdlUrlResponse")
public class GetWsdlUrlResponse {

    @XmlElement(name = "WsdlUrl", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String wsdlUrl;

    /**
     * Recupera il valore della proprietà wsdlUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlUrl() {
        return wsdlUrl;
    }

    /**
     * Imposta il valore della proprietà wsdlUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlUrl(String value) {
        this.wsdlUrl = value;
    }

}
