
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per VideoEncoderConfigurationOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoEncoderConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualityRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "VideoEncoderConfigurationOptions", propOrder = {
    "qualityRange",
    "jpeg",
    "mpeg4",
    "h264",
    "extension"
})
public class VideoEncoderConfigurationOptions {

    @XmlElement(name = "QualityRange", required = true)
    protected IntRange qualityRange;
    @XmlElement(name = "JPEG")
    protected JpegOptions jpeg;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Options mpeg4;
    @XmlElement(name = "H264")
    protected H264Options h264;
    @XmlElement(name = "Extension")
    protected VideoEncoderOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà qualityRange.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getQualityRange() {
        return qualityRange;
    }

    /**
     * Imposta il valore della proprietà qualityRange.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setQualityRange(IntRange value) {
        this.qualityRange = value;
    }

    /**
     * Recupera il valore della proprietà jpeg.
     * 
     * @return
     *     possible object is
     *     {@link JpegOptions }
     *     
     */
    public JpegOptions getJPEG() {
        return jpeg;
    }

    /**
     * Imposta il valore della proprietà jpeg.
     * 
     * @param value
     *     allowed object is
     *     {@link JpegOptions }
     *     
     */
    public void setJPEG(JpegOptions value) {
        this.jpeg = value;
    }

    /**
     * Recupera il valore della proprietà mpeg4.
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Options }
     *     
     */
    public Mpeg4Options getMPEG4() {
        return mpeg4;
    }

    /**
     * Imposta il valore della proprietà mpeg4.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Options }
     *     
     */
    public void setMPEG4(Mpeg4Options value) {
        this.mpeg4 = value;
    }

    /**
     * Recupera il valore della proprietà h264.
     * 
     * @return
     *     possible object is
     *     {@link H264Options }
     *     
     */
    public H264Options getH264() {
        return h264;
    }

    /**
     * Imposta il valore della proprietà h264.
     * 
     * @param value
     *     allowed object is
     *     {@link H264Options }
     *     
     */
    public void setH264(H264Options value) {
        this.h264 = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderOptionsExtension }
     *     
     */
    public VideoEncoderOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderOptionsExtension }
     *     
     */
    public void setExtension(VideoEncoderOptionsExtension value) {
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
