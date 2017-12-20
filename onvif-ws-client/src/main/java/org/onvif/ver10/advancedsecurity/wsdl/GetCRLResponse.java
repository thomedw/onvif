
package org.onvif.ver10.advancedsecurity.wsdl;

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
 *         &lt;element name="Crl" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CRL"/&gt;
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
    "crl"
})
@XmlRootElement(name = "GetCRLResponse")
public class GetCRLResponse {

    @XmlElement(name = "Crl", required = true)
    protected CRL crl;

    /**
     * Recupera il valore della proprietà crl.
     * 
     * @return
     *     possible object is
     *     {@link CRL }
     *     
     */
    public CRL getCrl() {
        return crl;
    }

    /**
     * Imposta il valore della proprietà crl.
     * 
     * @param value
     *     allowed object is
     *     {@link CRL }
     *     
     */
    public void setCrl(CRL value) {
        this.crl = value;
    }

}
