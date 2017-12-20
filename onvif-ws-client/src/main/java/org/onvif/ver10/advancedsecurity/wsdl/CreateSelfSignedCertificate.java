
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="X509Version" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DistinguishedName"/&gt;
 *         &lt;element name="KeyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyID"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notValidBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="notValidAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SignatureAlgorithm" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}AlgorithmIdentifier"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509v3Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "x509Version",
    "subject",
    "keyID",
    "alias",
    "notValidBefore",
    "notValidAfter",
    "signatureAlgorithm",
    "extension"
})
@XmlRootElement(name = "CreateSelfSignedCertificate")
public class CreateSelfSignedCertificate {

    @XmlElement(name = "X509Version")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger x509Version;
    @XmlElement(name = "Subject", required = true)
    protected DistinguishedName subject;
    @XmlElement(name = "KeyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String keyID;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notValidBefore;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notValidAfter;
    @XmlElement(name = "SignatureAlgorithm", required = true)
    protected AlgorithmIdentifier signatureAlgorithm;
    @XmlElement(name = "Extension")
    protected List<X509V3Extension> extension;

    /**
     * Recupera il valore della proprietà x509Version.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getX509Version() {
        return x509Version;
    }

    /**
     * Imposta il valore della proprietà x509Version.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setX509Version(BigInteger value) {
        this.x509Version = value;
    }

    /**
     * Recupera il valore della proprietà subject.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedName }
     *     
     */
    public DistinguishedName getSubject() {
        return subject;
    }

    /**
     * Imposta il valore della proprietà subject.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedName }
     *     
     */
    public void setSubject(DistinguishedName value) {
        this.subject = value;
    }

    /**
     * Recupera il valore della proprietà keyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Imposta il valore della proprietà keyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyID(String value) {
        this.keyID = value;
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
     * Recupera il valore della proprietà notValidBefore.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Imposta il valore della proprietà notValidBefore.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidBefore(XMLGregorianCalendar value) {
        this.notValidBefore = value;
    }

    /**
     * Recupera il valore della proprietà notValidAfter.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Imposta il valore della proprietà notValidAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidAfter(XMLGregorianCalendar value) {
        this.notValidAfter = value;
    }

    /**
     * Recupera il valore della proprietà signatureAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *     
     */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Imposta il valore della proprietà signatureAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *     
     */
    public void setSignatureAlgorithm(AlgorithmIdentifier value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X509V3Extension }
     * 
     * 
     */
    public List<X509V3Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<X509V3Extension>();
        }
        return this.extension;
    }

}
