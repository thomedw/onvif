
package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.Certificate;


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
 *         &lt;element name="NvtCertificate" type="{http://www.onvif.org/ver10/schema}Certificate"/&gt;
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
    "nvtCertificate"
})
@XmlRootElement(name = "CreateCertificateResponse")
public class CreateCertificateResponse {

    @XmlElement(name = "NvtCertificate", required = true)
    protected Certificate nvtCertificate;

    /**
     * Recupera il valore della proprietà nvtCertificate.
     * 
     * @return
     *     possible object is
     *     {@link Certificate }
     *     
     */
    public Certificate getNvtCertificate() {
        return nvtCertificate;
    }

    /**
     * Imposta il valore della proprietà nvtCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link Certificate }
     *     
     */
    public void setNvtCertificate(Certificate value) {
        this.nvtCertificate = value;
    }

}
