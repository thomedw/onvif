
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
 *         &lt;element name="Certificate" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrivateKeyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "certificate",
    "alias",
    "keyAlias",
    "privateKeyRequired"
})
@XmlRootElement(name = "UploadCertificate")
public class UploadCertificate {

    @XmlElement(name = "Certificate", required = true)
    protected byte[] certificate;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "KeyAlias")
    protected String keyAlias;
    @XmlElement(name = "PrivateKeyRequired", defaultValue = "false")
    protected Boolean privateKeyRequired;

    /**
     * Recupera il valore della proprietà certificate.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Imposta il valore della proprietà certificate.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertificate(byte[] value) {
        this.certificate = value;
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

    /**
     * Recupera il valore della proprietà keyAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    /**
     * Imposta il valore della proprietà keyAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyAlias(String value) {
        this.keyAlias = value;
    }

    /**
     * Recupera il valore della proprietà privateKeyRequired.
     * This getter has been renamed from isPrivateKeyRequired() to getPrivateKeyRequired() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrivateKeyRequired() {
        return privateKeyRequired;
    }

    /**
     * Imposta il valore della proprietà privateKeyRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateKeyRequired(Boolean value) {
        this.privateKeyRequired = value;
    }

}
