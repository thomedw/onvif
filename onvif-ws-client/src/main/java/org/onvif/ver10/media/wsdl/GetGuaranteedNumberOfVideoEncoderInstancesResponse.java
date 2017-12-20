
package org.onvif.ver10.media.wsdl;

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
 *         &lt;element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="JPEG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "totalNumber",
    "jpeg",
    "h264",
    "mpeg4"
})
@XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
public class GetGuaranteedNumberOfVideoEncoderInstancesResponse {

    @XmlElement(name = "TotalNumber")
    protected int totalNumber;
    @XmlElement(name = "JPEG")
    protected Integer jpeg;
    @XmlElement(name = "H264")
    protected Integer h264;
    @XmlElement(name = "MPEG4")
    protected Integer mpeg4;

    /**
     * Recupera il valore della proprietà totalNumber.
     * 
     */
    public int getTotalNumber() {
        return totalNumber;
    }

    /**
     * Imposta il valore della proprietà totalNumber.
     * 
     */
    public void setTotalNumber(int value) {
        this.totalNumber = value;
    }

    /**
     * Recupera il valore della proprietà jpeg.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJPEG() {
        return jpeg;
    }

    /**
     * Imposta il valore della proprietà jpeg.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJPEG(Integer value) {
        this.jpeg = value;
    }

    /**
     * Recupera il valore della proprietà h264.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH264() {
        return h264;
    }

    /**
     * Imposta il valore della proprietà h264.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH264(Integer value) {
        this.h264 = value;
    }

    /**
     * Recupera il valore della proprietà mpeg4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPEG4() {
        return mpeg4;
    }

    /**
     * Imposta il valore della proprietà mpeg4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPEG4(Integer value) {
        this.mpeg4 = value;
    }

}
