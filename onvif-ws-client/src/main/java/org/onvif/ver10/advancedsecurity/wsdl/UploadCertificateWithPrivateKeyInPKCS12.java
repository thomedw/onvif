
package org.onvif.ver10.advancedsecurity.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="CertWithPrivateKey" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/&gt;
 *         &lt;element name="CertificationPathAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreAdditionalCertificates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntegrityPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/&gt;
 *         &lt;element name="EncryptionPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/&gt;
 *         &lt;element name="Passphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "certWithPrivateKey",
    "certificationPathAlias",
    "keyAlias",
    "ignoreAdditionalCertificates",
    "integrityPassphraseID",
    "encryptionPassphraseID",
    "passphrase"
})
@XmlRootElement(name = "UploadCertificateWithPrivateKeyInPKCS12")
public class UploadCertificateWithPrivateKeyInPKCS12 {

    @XmlElement(name = "CertWithPrivateKey", required = true)
    protected byte[] certWithPrivateKey;
    @XmlElement(name = "CertificationPathAlias")
    protected String certificationPathAlias;
    @XmlElement(name = "KeyAlias")
    protected String keyAlias;
    @XmlElement(name = "IgnoreAdditionalCertificates", defaultValue = "false")
    protected Boolean ignoreAdditionalCertificates;
    @XmlElement(name = "IntegrityPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String integrityPassphraseID;
    @XmlElement(name = "EncryptionPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String encryptionPassphraseID;
    @XmlElement(name = "Passphrase")
    protected String passphrase;

    /**
     * Recupera il valore della proprietà certWithPrivateKey.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertWithPrivateKey() {
        return certWithPrivateKey;
    }

    /**
     * Imposta il valore della proprietà certWithPrivateKey.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertWithPrivateKey(byte[] value) {
        this.certWithPrivateKey = value;
    }

    /**
     * Recupera il valore della proprietà certificationPathAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationPathAlias() {
        return certificationPathAlias;
    }

    /**
     * Imposta il valore della proprietà certificationPathAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationPathAlias(String value) {
        this.certificationPathAlias = value;
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
     * Recupera il valore della proprietà ignoreAdditionalCertificates.
     * This getter has been renamed from isIgnoreAdditionalCertificates() to getIgnoreAdditionalCertificates() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreAdditionalCertificates() {
        return ignoreAdditionalCertificates;
    }

    /**
     * Imposta il valore della proprietà ignoreAdditionalCertificates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAdditionalCertificates(Boolean value) {
        this.ignoreAdditionalCertificates = value;
    }

    /**
     * Recupera il valore della proprietà integrityPassphraseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrityPassphraseID() {
        return integrityPassphraseID;
    }

    /**
     * Imposta il valore della proprietà integrityPassphraseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrityPassphraseID(String value) {
        this.integrityPassphraseID = value;
    }

    /**
     * Recupera il valore della proprietà encryptionPassphraseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionPassphraseID() {
        return encryptionPassphraseID;
    }

    /**
     * Imposta il valore della proprietà encryptionPassphraseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionPassphraseID(String value) {
        this.encryptionPassphraseID = value;
    }

    /**
     * Recupera il valore della proprietà passphrase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * Imposta il valore della proprietà passphrase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassphrase(String value) {
        this.passphrase = value;
    }

}
