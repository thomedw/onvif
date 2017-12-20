
package org.onvif.ver10.accesscontrol.wsdl;

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
 *         &lt;element name="AccessPointToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="CredentialToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Decision" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}Decision"/&gt;
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
    "accessPointToken",
    "credentialToken",
    "reason",
    "decision"
})
@XmlRootElement(name = "ExternalAuthorization")
public class ExternalAuthorization {

    @XmlElement(name = "AccessPointToken", required = true)
    protected String accessPointToken;
    @XmlElement(name = "CredentialToken")
    protected String credentialToken;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "Decision", required = true)
    @XmlSchemaType(name = "string")
    protected Decision decision;

    /**
     * Recupera il valore della proprietà accessPointToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPointToken() {
        return accessPointToken;
    }

    /**
     * Imposta il valore della proprietà accessPointToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPointToken(String value) {
        this.accessPointToken = value;
    }

    /**
     * Recupera il valore della proprietà credentialToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialToken() {
        return credentialToken;
    }

    /**
     * Imposta il valore della proprietà credentialToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialToken(String value) {
        this.credentialToken = value;
    }

    /**
     * Recupera il valore della proprietà reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Imposta il valore della proprietà reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Recupera il valore della proprietà decision.
     * 
     * @return
     *     possible object is
     *     {@link Decision }
     *     
     */
    public Decision getDecision() {
        return decision;
    }

    /**
     * Imposta il valore della proprietà decision.
     * 
     * @param value
     *     allowed object is
     *     {@link Decision }
     *     
     */
    public void setDecision(Decision value) {
        this.decision = value;
    }

}
