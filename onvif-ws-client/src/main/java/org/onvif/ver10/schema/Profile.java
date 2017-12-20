
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * 			A media profile consists of a set of media configurations. Media profiles are used by a client
 * 			to configure properties of a media stream from an NVT.
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			An NVT shall provide at least one media profile at boot. An NVT should provide “ready to use”
 * 			profiles for the most common media configurations that the device offers.
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			A profile consists of a set of interconnected configuration entities. Configurations are provided
 * 			by the NVT and can be either static or created dynamically by the NVT. For example, the
 * 			dynamic configurations can be created by the NVT depending on current available encoding
 * 			resources.
 * 		
 * 
 * <p>Classe Java per Profile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/&gt;
 *         &lt;element name="VideoSourceConfiguration" type="{http://www.onvif.org/ver10/schema}VideoSourceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="AudioSourceConfiguration" type="{http://www.onvif.org/ver10/schema}AudioSourceConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="VideoEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}VideoEncoderConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="AudioEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioEncoderConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="VideoAnalyticsConfiguration" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="PTZConfiguration" type="{http://www.onvif.org/ver10/schema}PTZConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="MetadataConfiguration" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ProfileExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "name",
    "videoSourceConfiguration",
    "audioSourceConfiguration",
    "videoEncoderConfiguration",
    "audioEncoderConfiguration",
    "videoAnalyticsConfiguration",
    "ptzConfiguration",
    "metadataConfiguration",
    "extension"
})
public class Profile {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "VideoSourceConfiguration")
    protected VideoSourceConfiguration videoSourceConfiguration;
    @XmlElement(name = "AudioSourceConfiguration")
    protected AudioSourceConfiguration audioSourceConfiguration;
    @XmlElement(name = "VideoEncoderConfiguration")
    protected VideoEncoderConfiguration videoEncoderConfiguration;
    @XmlElement(name = "AudioEncoderConfiguration")
    protected AudioEncoderConfiguration audioEncoderConfiguration;
    @XmlElement(name = "VideoAnalyticsConfiguration")
    protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;
    @XmlElement(name = "PTZConfiguration")
    protected PTZConfiguration ptzConfiguration;
    @XmlElement(name = "MetadataConfiguration")
    protected MetadataConfiguration metadataConfiguration;
    @XmlElement(name = "Extension")
    protected ProfileExtension extension;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAttribute(name = "fixed")
    protected Boolean fixed;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà videoSourceConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceConfiguration }
     *     
     */
    public VideoSourceConfiguration getVideoSourceConfiguration() {
        return videoSourceConfiguration;
    }

    /**
     * Imposta il valore della proprietà videoSourceConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceConfiguration }
     *     
     */
    public void setVideoSourceConfiguration(VideoSourceConfiguration value) {
        this.videoSourceConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà audioSourceConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link AudioSourceConfiguration }
     *     
     */
    public AudioSourceConfiguration getAudioSourceConfiguration() {
        return audioSourceConfiguration;
    }

    /**
     * Imposta il valore della proprietà audioSourceConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSourceConfiguration }
     *     
     */
    public void setAudioSourceConfiguration(AudioSourceConfiguration value) {
        this.audioSourceConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà videoEncoderConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderConfiguration }
     *     
     */
    public VideoEncoderConfiguration getVideoEncoderConfiguration() {
        return videoEncoderConfiguration;
    }

    /**
     * Imposta il valore della proprietà videoEncoderConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderConfiguration }
     *     
     */
    public void setVideoEncoderConfiguration(VideoEncoderConfiguration value) {
        this.videoEncoderConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà audioEncoderConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public AudioEncoderConfiguration getAudioEncoderConfiguration() {
        return audioEncoderConfiguration;
    }

    /**
     * Imposta il valore della proprietà audioEncoderConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        this.audioEncoderConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà videoAnalyticsConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link VideoAnalyticsConfiguration }
     *     
     */
    public VideoAnalyticsConfiguration getVideoAnalyticsConfiguration() {
        return videoAnalyticsConfiguration;
    }

    /**
     * Imposta il valore della proprietà videoAnalyticsConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAnalyticsConfiguration }
     *     
     */
    public void setVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
        this.videoAnalyticsConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà ptzConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfiguration }
     *     
     */
    public PTZConfiguration getPTZConfiguration() {
        return ptzConfiguration;
    }

    /**
     * Imposta il valore della proprietà ptzConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfiguration }
     *     
     */
    public void setPTZConfiguration(PTZConfiguration value) {
        this.ptzConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà metadataConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfiguration }
     *     
     */
    public MetadataConfiguration getMetadataConfiguration() {
        return metadataConfiguration;
    }

    /**
     * Imposta il valore della proprietà metadataConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfiguration }
     *     
     */
    public void setMetadataConfiguration(MetadataConfiguration value) {
        this.metadataConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link ProfileExtension }
     *     
     */
    public ProfileExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExtension }
     *     
     */
    public void setExtension(ProfileExtension value) {
        this.extension = value;
    }

    /**
     * Recupera il valore della proprietà token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Imposta il valore della proprietà token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Recupera il valore della proprietà fixed.
     * This getter has been renamed from isFixed() to getFixed() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFixed() {
        return fixed;
    }

    /**
     * Imposta il valore della proprietà fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
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
