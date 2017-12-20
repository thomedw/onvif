
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per Capabilities complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}ProfileCapabilities"/&gt;
 *         &lt;element name="StreamingCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}StreamingCapabilities"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SnapshotUri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="VideoSourceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OSD" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EXICompression" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "profileCapabilities",
    "streamingCapabilities",
    "any"
})
public class Capabilities {

    @XmlElement(name = "ProfileCapabilities", required = true)
    protected ProfileCapabilities profileCapabilities;
    @XmlElement(name = "StreamingCapabilities", required = true)
    protected StreamingCapabilities streamingCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "SnapshotUri")
    protected Boolean snapshotUri;
    @XmlAttribute(name = "Rotation")
    protected Boolean rotation;
    @XmlAttribute(name = "VideoSourceMode")
    protected Boolean videoSourceMode;
    @XmlAttribute(name = "OSD")
    protected Boolean osd;
    @XmlAttribute(name = "EXICompression")
    protected Boolean exiCompression;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà profileCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCapabilities }
     *     
     */
    public ProfileCapabilities getProfileCapabilities() {
        return profileCapabilities;
    }

    /**
     * Imposta il valore della proprietà profileCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCapabilities }
     *     
     */
    public void setProfileCapabilities(ProfileCapabilities value) {
        this.profileCapabilities = value;
    }

    /**
     * Recupera il valore della proprietà streamingCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link StreamingCapabilities }
     *     
     */
    public StreamingCapabilities getStreamingCapabilities() {
        return streamingCapabilities;
    }

    /**
     * Imposta il valore della proprietà streamingCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamingCapabilities }
     *     
     */
    public void setStreamingCapabilities(StreamingCapabilities value) {
        this.streamingCapabilities = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà snapshotUri.
     * This getter has been renamed from isSnapshotUri() to getSnapshotUri() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSnapshotUri() {
        return snapshotUri;
    }

    /**
     * Imposta il valore della proprietà snapshotUri.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotUri(Boolean value) {
        this.snapshotUri = value;
    }

    /**
     * Recupera il valore della proprietà rotation.
     * This getter has been renamed from isRotation() to getRotation() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRotation() {
        return rotation;
    }

    /**
     * Imposta il valore della proprietà rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotation(Boolean value) {
        this.rotation = value;
    }

    /**
     * Recupera il valore della proprietà videoSourceMode.
     * This getter has been renamed from isVideoSourceMode() to getVideoSourceMode() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVideoSourceMode() {
        return videoSourceMode;
    }

    /**
     * Imposta il valore della proprietà videoSourceMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVideoSourceMode(Boolean value) {
        this.videoSourceMode = value;
    }

    /**
     * Recupera il valore della proprietà osd.
     * This getter has been renamed from isOSD() to getOSD() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOSD() {
        return osd;
    }

    /**
     * Imposta il valore della proprietà osd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOSD(Boolean value) {
        this.osd = value;
    }

    /**
     * Recupera il valore della proprietà exiCompression.
     * This getter has been renamed from isEXICompression() to getEXICompression() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEXICompression() {
        return exiCompression;
    }

    /**
     * Imposta il valore della proprietà exiCompression.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXICompression(Boolean value) {
        this.exiCompression = value;
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
