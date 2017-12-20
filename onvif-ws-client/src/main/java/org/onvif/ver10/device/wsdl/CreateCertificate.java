
package org.onvif.ver10.device.wsdl;

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
 *         &lt;element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidNotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ValidNotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "certificateID",
    "subject",
    "validNotBefore",
    "validNotAfter"
})
@XmlRootElement(name = "CreateCertificate")
public class CreateCertificate {

    @XmlElement(name = "CertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "ValidNotBefore")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validNotBefore;
    @XmlElement(name = "ValidNotAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validNotAfter;

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
     * Recupera il valore della proprietà subject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Imposta il valore della proprietà subject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Recupera il valore della proprietà validNotBefore.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidNotBefore() {
        return validNotBefore;
    }

    /**
     * Imposta il valore della proprietà validNotBefore.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidNotBefore(XMLGregorianCalendar value) {
        this.validNotBefore = value;
    }

    /**
     * Recupera il valore della proprietà validNotAfter.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidNotAfter() {
        return validNotAfter;
    }

    /**
     * Imposta il valore della proprietà validNotAfter.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidNotAfter(XMLGregorianCalendar value) {
        this.validNotAfter = value;
    }

}
