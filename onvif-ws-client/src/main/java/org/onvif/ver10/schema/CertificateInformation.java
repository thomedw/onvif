
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per CertificateInformation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertificateInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="IssuerDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubjectDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyUsage" type="{http://www.onvif.org/ver10/schema}CertificateUsage" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedKeyUsage" type="{http://www.onvif.org/ver10/schema}CertificateUsage" minOccurs="0"/&gt;
 *         &lt;element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignatureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Validity" type="{http://www.onvif.org/ver10/schema}DateTimeRange" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}CertificateInformationExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateInformation", propOrder = {
    "certificateID",
    "issuerDN",
    "subjectDN",
    "keyUsage",
    "extendedKeyUsage",
    "keyLength",
    "version",
    "serialNum",
    "signatureAlgorithm",
    "validity",
    "extension"
})
public class CertificateInformation {

    @XmlElement(name = "CertificateID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    @XmlElement(name = "IssuerDN")
    protected String issuerDN;
    @XmlElement(name = "SubjectDN")
    protected String subjectDN;
    @XmlElement(name = "KeyUsage")
    protected CertificateUsage keyUsage;
    @XmlElement(name = "ExtendedKeyUsage")
    protected CertificateUsage extendedKeyUsage;
    @XmlElement(name = "KeyLength")
    protected Integer keyLength;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "SerialNum")
    protected String serialNum;
    @XmlElement(name = "SignatureAlgorithm")
    protected String signatureAlgorithm;
    @XmlElement(name = "Validity")
    protected DateTimeRange validity;
    @XmlElement(name = "Extension")
    protected CertificateInformationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà certificateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateID() {
        return certificateID;
    }

    /**
     * Imposta il valore della proprietà certificateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * Recupera il valore della proprietà issuerDN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerDN() {
        return issuerDN;
    }

    /**
     * Imposta il valore della proprietà issuerDN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerDN(String value) {
        this.issuerDN = value;
    }

    /**
     * Recupera il valore della proprietà subjectDN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectDN() {
        return subjectDN;
    }

    /**
     * Imposta il valore della proprietà subjectDN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectDN(String value) {
        this.subjectDN = value;
    }

    /**
     * Recupera il valore della proprietà keyUsage.
     * 
     * @return
     *     possible object is
     *     {@link CertificateUsage }
     *     
     */
    public CertificateUsage getKeyUsage() {
        return keyUsage;
    }

    /**
     * Imposta il valore della proprietà keyUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateUsage }
     *     
     */
    public void setKeyUsage(CertificateUsage value) {
        this.keyUsage = value;
    }

    /**
     * Recupera il valore della proprietà extendedKeyUsage.
     * 
     * @return
     *     possible object is
     *     {@link CertificateUsage }
     *     
     */
    public CertificateUsage getExtendedKeyUsage() {
        return extendedKeyUsage;
    }

    /**
     * Imposta il valore della proprietà extendedKeyUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateUsage }
     *     
     */
    public void setExtendedKeyUsage(CertificateUsage value) {
        this.extendedKeyUsage = value;
    }

    /**
     * Recupera il valore della proprietà keyLength.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyLength() {
        return keyLength;
    }

    /**
     * Imposta il valore della proprietà keyLength.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyLength(Integer value) {
        this.keyLength = value;
    }

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Recupera il valore della proprietà serialNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * Imposta il valore della proprietà serialNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNum(String value) {
        this.serialNum = value;
    }

    /**
     * Recupera il valore della proprietà signatureAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Imposta il valore della proprietà signatureAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Recupera il valore della proprietà validity.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRange }
     *     
     */
    public DateTimeRange getValidity() {
        return validity;
    }

    /**
     * Imposta il valore della proprietà validity.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRange }
     *     
     */
    public void setValidity(DateTimeRange value) {
        this.validity = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link CertificateInformationExtension }
     *     
     */
    public CertificateInformationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateInformationExtension }
     *     
     */
    public void setExtension(CertificateInformationExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
