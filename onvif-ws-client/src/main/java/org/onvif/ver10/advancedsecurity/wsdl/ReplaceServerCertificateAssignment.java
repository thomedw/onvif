
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
 *         &lt;element name="OldCertificationPathID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPathID"/&gt;
 *         &lt;element name="NewCertificationPathID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertificationPathID"/&gt;
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
    "oldCertificationPathID",
    "newCertificationPathID"
})
@XmlRootElement(name = "ReplaceServerCertificateAssignment")
public class ReplaceServerCertificateAssignment {

    @XmlElement(name = "OldCertificationPathID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String oldCertificationPathID;
    @XmlElement(name = "NewCertificationPathID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String newCertificationPathID;

    /**
     * Recupera il valore della proprietà oldCertificationPathID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCertificationPathID() {
        return oldCertificationPathID;
    }

    /**
     * Imposta il valore della proprietà oldCertificationPathID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCertificationPathID(String value) {
        this.oldCertificationPathID = value;
    }

    /**
     * Recupera il valore della proprietà newCertificationPathID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCertificationPathID() {
        return newCertificationPathID;
    }

    /**
     * Imposta il valore della proprietà newCertificationPathID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCertificationPathID(String value) {
        this.newCertificationPathID = value;
    }

}
