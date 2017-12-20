
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
 *         &lt;element name="CertificationPath" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPath"/&gt;
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
    "certificationPath"
})
@XmlRootElement(name = "GetCertificationPathResponse")
public class GetCertificationPathResponse {

    @XmlElement(name = "CertificationPath", required = true)
    protected CertificationPath certificationPath;

    /**
     * Recupera il valore della proprietà certificationPath.
     * 
     * @return
     *     possible object is
     *     {@link CertificationPath }
     *     
     */
    public CertificationPath getCertificationPath() {
        return certificationPath;
    }

    /**
     * Imposta il valore della proprietà certificationPath.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationPath }
     *     
     */
    public void setCertificationPath(CertificationPath value) {
        this.certificationPath = value;
    }

}
