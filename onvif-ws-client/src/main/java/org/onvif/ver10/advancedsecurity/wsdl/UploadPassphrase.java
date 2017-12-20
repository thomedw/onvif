
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
 *         &lt;element name="Passphrase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PassphraseAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "passphrase",
    "passphraseAlias"
})
@XmlRootElement(name = "UploadPassphrase")
public class UploadPassphrase {

    @XmlElement(name = "Passphrase", required = true)
    protected String passphrase;
    @XmlElement(name = "PassphraseAlias")
    protected String passphraseAlias;

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

    /**
     * Recupera il valore della proprietà passphraseAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphraseAlias() {
        return passphraseAlias;
    }

    /**
     * Imposta il valore della proprietà passphraseAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassphraseAlias(String value) {
        this.passphraseAlias = value;
    }

}
