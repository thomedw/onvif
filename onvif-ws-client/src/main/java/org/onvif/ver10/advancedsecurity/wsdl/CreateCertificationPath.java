
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
 *         &lt;element name="CertificateIDs" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificateIDs"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "certificateIDs",
    "alias"
})
@XmlRootElement(name = "CreateCertificationPath")
public class CreateCertificationPath {

    @XmlElement(name = "CertificateIDs", required = true)
    protected CertificateIDs certificateIDs;
    @XmlElement(name = "Alias")
    protected String alias;

    /**
     * Recupera il valore della proprietà certificateIDs.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIDs }
     *     
     */
    public CertificateIDs getCertificateIDs() {
        return certificateIDs;
    }

    /**
     * Imposta il valore della proprietà certificateIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIDs }
     *     
     */
    public void setCertificateIDs(CertificateIDs value) {
        this.certificateIDs = value;
    }

    /**
     * Recupera il valore della proprietà alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Imposta il valore della proprietà alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

}
