
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.onvif.ver10.schema.VideoResolution;


/**
 * <p>Classe Java per VideoSourceMode complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VideoSourceMode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxFramerate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxResolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/&gt;
 *         &lt;element name="Encodings" type="{http://www.onvif.org/ver10/media/wsdl}EncodingTypes"/&gt;
 *         &lt;element name="Reboot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Description" type="{http://www.onvif.org/ver10/schema}Description" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/media/wsdl}VideoSourceModeExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *       &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSourceMode", propOrder = {
    "maxFramerate",
    "maxResolution",
    "encodings",
    "reboot",
    "description",
    "extension"
})
public class VideoSourceMode {

    @XmlElement(name = "MaxFramerate")
    protected float maxFramerate;
    @XmlElement(name = "MaxResolution", required = true)
    protected VideoResolution maxResolution;
    @XmlList
    @XmlElement(name = "Encodings", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> encodings;
    @XmlElement(name = "Reboot")
    protected boolean reboot;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Extension")
    protected VideoSourceModeExtension extension;
    @XmlAttribute(name = "token", required = true)
    protected String token;
    @XmlAttribute(name = "Enabled")
    protected Boolean enabled;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà maxFramerate.
     * 
     */
    public float getMaxFramerate() {
        return maxFramerate;
    }

    /**
     * Imposta il valore della proprietà maxFramerate.
     * 
     */
    public void setMaxFramerate(float value) {
        this.maxFramerate = value;
    }

    /**
     * Recupera il valore della proprietà maxResolution.
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *     
     */
    public VideoResolution getMaxResolution() {
        return maxResolution;
    }

    /**
     * Imposta il valore della proprietà maxResolution.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *     
     */
    public void setMaxResolution(VideoResolution value) {
        this.maxResolution = value;
    }

    /**
     * Gets the value of the encodings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encodings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncodings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEncodings() {
        if (encodings == null) {
            encodings = new ArrayList<String>();
        }
        return this.encodings;
    }

    /**
     * Recupera il valore della proprietà reboot.
     * This getter has been renamed from isReboot() to getReboot() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getReboot() {
        return reboot;
    }

    /**
     * Imposta il valore della proprietà reboot.
     * 
     */
    public void setReboot(boolean value) {
        this.reboot = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceModeExtension }
     *     
     */
    public VideoSourceModeExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceModeExtension }
     *     
     */
    public void setExtension(VideoSourceModeExtension value) {
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
     * Recupera il valore della proprietà enabled.
     * This getter has been renamed from isEnabled() to getEnabled() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietà enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
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
