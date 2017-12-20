
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
 *         &lt;element name="KeyPair" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EncryptionPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/&gt;
 *         &lt;element name="EncryptionPassphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "keyPair",
    "alias",
    "encryptionPassphraseID",
    "encryptionPassphrase"
})
@XmlRootElement(name = "UploadKeyPairInPKCS8")
public class UploadKeyPairInPKCS8 {

    @XmlElement(name = "KeyPair", required = true)
    protected byte[] keyPair;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "EncryptionPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String encryptionPassphraseID;
    @XmlElement(name = "EncryptionPassphrase")
    protected String encryptionPassphrase;

    /**
     * Recupera il valore della proprietà keyPair.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyPair() {
        return keyPair;
    }

    /**
     * Imposta il valore della proprietà keyPair.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyPair(byte[] value) {
        this.keyPair = value;
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
     * Recupera il valore della proprietà encryptionPassphrase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionPassphrase() {
        return encryptionPassphrase;
    }

    /**
     * Imposta il valore della proprietà encryptionPassphrase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionPassphrase(String value) {
        this.encryptionPassphrase = value;
    }

}
