
package org.onvif.ver10.recording.wsdl;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per TrackOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrackOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="SpareTotal" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpareVideo" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpareAudio" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="SpareMetadata" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackOptions")
public class TrackOptions {

    @XmlAttribute(name = "SpareTotal")
    protected Integer spareTotal;
    @XmlAttribute(name = "SpareVideo")
    protected Integer spareVideo;
    @XmlAttribute(name = "SpareAudio")
    protected Integer spareAudio;
    @XmlAttribute(name = "SpareMetadata")
    protected Integer spareMetadata;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà spareTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareTotal() {
        return spareTotal;
    }

    /**
     * Imposta il valore della proprietà spareTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareTotal(Integer value) {
        this.spareTotal = value;
    }

    /**
     * Recupera il valore della proprietà spareVideo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareVideo() {
        return spareVideo;
    }

    /**
     * Imposta il valore della proprietà spareVideo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareVideo(Integer value) {
        this.spareVideo = value;
    }

    /**
     * Recupera il valore della proprietà spareAudio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareAudio() {
        return spareAudio;
    }

    /**
     * Imposta il valore della proprietà spareAudio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareAudio(Integer value) {
        this.spareAudio = value;
    }

    /**
     * Recupera il valore della proprietà spareMetadata.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpareMetadata() {
        return spareMetadata;
    }

    /**
     * Imposta il valore della proprietà spareMetadata.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpareMetadata(Integer value) {
        this.spareMetadata = value;
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
