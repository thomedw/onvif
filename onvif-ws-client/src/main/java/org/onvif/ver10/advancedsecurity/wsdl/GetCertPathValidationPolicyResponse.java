
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
 *         &lt;element name="CertPathValidationPolicy" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicy"/&gt;
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
    "certPathValidationPolicy"
})
@XmlRootElement(name = "GetCertPathValidationPolicyResponse")
public class GetCertPathValidationPolicyResponse {

    @XmlElement(name = "CertPathValidationPolicy", required = true)
    protected CertPathValidationPolicy certPathValidationPolicy;

    /**
     * Recupera il valore della proprietà certPathValidationPolicy.
     * 
     * @return
     *     possible object is
     *     {@link CertPathValidationPolicy }
     *     
     */
    public CertPathValidationPolicy getCertPathValidationPolicy() {
        return certPathValidationPolicy;
    }

    /**
     * Imposta il valore della proprietà certPathValidationPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link CertPathValidationPolicy }
     *     
     */
    public void setCertPathValidationPolicy(CertPathValidationPolicy value) {
        this.certPathValidationPolicy = value;
    }

}
