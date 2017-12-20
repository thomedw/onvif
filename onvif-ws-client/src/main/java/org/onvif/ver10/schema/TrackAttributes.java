
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
 * <p>Classe Java per TrackAttributes complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TrackAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackInformation" type="{http://www.onvif.org/ver10/schema}TrackInformation"/&gt;
 *         &lt;element name="VideoAttributes" type="{http://www.onvif.org/ver10/schema}VideoAttributes" minOccurs="0"/&gt;
 *         &lt;element name="AudioAttributes" type="{http://www.onvif.org/ver10/schema}AudioAttributes" minOccurs="0"/&gt;
 *         &lt;element name="MetadataAttributes" type="{http://www.onvif.org/ver10/schema}MetadataAttributes" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}TrackAttributesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "TrackAttributes", propOrder = {
    "trackInformation",
    "videoAttributes",
    "audioAttributes",
    "metadataAttributes",
    "extension"
})
public class TrackAttributes {

    @XmlElement(name = "TrackInformation", required = true)
    protected TrackInformation trackInformation;
    @XmlElement(name = "VideoAttributes")
    protected VideoAttributes videoAttributes;
    @XmlElement(name = "AudioAttributes")
    protected AudioAttributes audioAttributes;
    @XmlElement(name = "MetadataAttributes")
    protected MetadataAttributes metadataAttributes;
    @XmlElement(name = "Extension")
    protected TrackAttributesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà trackInformation.
     * 
     * @return
     *     possible object is
     *     {@link TrackInformation }
     *     
     */
    public TrackInformation getTrackInformation() {
        return trackInformation;
    }

    /**
     * Imposta il valore della proprietà trackInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackInformation }
     *     
     */
    public void setTrackInformation(TrackInformation value) {
        this.trackInformation = value;
    }

    /**
     * Recupera il valore della proprietà videoAttributes.
     * 
     * @return
     *     possible object is
     *     {@link VideoAttributes }
     *     
     */
    public VideoAttributes getVideoAttributes() {
        return videoAttributes;
    }

    /**
     * Imposta il valore della proprietà videoAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAttributes }
     *     
     */
    public void setVideoAttributes(VideoAttributes value) {
        this.videoAttributes = value;
    }

    /**
     * Recupera il valore della proprietà audioAttributes.
     * 
     * @return
     *     possible object is
     *     {@link AudioAttributes }
     *     
     */
    public AudioAttributes getAudioAttributes() {
        return audioAttributes;
    }

    /**
     * Imposta il valore della proprietà audioAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioAttributes }
     *     
     */
    public void setAudioAttributes(AudioAttributes value) {
        this.audioAttributes = value;
    }

    /**
     * Recupera il valore della proprietà metadataAttributes.
     * 
     * @return
     *     possible object is
     *     {@link MetadataAttributes }
     *     
     */
    public MetadataAttributes getMetadataAttributes() {
        return metadataAttributes;
    }

    /**
     * Imposta il valore della proprietà metadataAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataAttributes }
     *     
     */
    public void setMetadataAttributes(MetadataAttributes value) {
        this.metadataAttributes = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link TrackAttributesExtension }
     *     
     */
    public TrackAttributesExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAttributesExtension }
     *     
     */
    public void setExtension(TrackAttributesExtension value) {
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
