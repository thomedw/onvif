
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java per OSDConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OSDConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoSourceConfigurationToken" type="{http://www.onvif.org/ver10/schema}OSDReference"/&gt;
 *         &lt;element name="Type" type="{http://www.onvif.org/ver10/schema}OSDType"/&gt;
 *         &lt;element name="Position" type="{http://www.onvif.org/ver10/schema}OSDPosConfiguration"/&gt;
 *         &lt;element name="TextString" type="{http://www.onvif.org/ver10/schema}OSDTextConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.onvif.org/ver10/schema}OSDImgConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDConfigurationExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDConfiguration", propOrder = {
    "videoSourceConfigurationToken",
    "type",
    "position",
    "textString",
    "image",
    "extension"
})
public class OSDConfiguration
    extends DeviceEntity
{

    @XmlElement(name = "VideoSourceConfigurationToken", required = true)
    protected OSDReference videoSourceConfigurationToken;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OSDType type;
    @XmlElement(name = "Position", required = true)
    protected OSDPosConfiguration position;
    @XmlElement(name = "TextString")
    protected OSDTextConfiguration textString;
    @XmlElement(name = "Image")
    protected OSDImgConfiguration image;
    @XmlElement(name = "Extension")
    protected OSDConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà videoSourceConfigurationToken.
     * 
     * @return
     *     possible object is
     *     {@link OSDReference }
     *     
     */
    public OSDReference getVideoSourceConfigurationToken() {
        return videoSourceConfigurationToken;
    }

    /**
     * Imposta il valore della proprietà videoSourceConfigurationToken.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDReference }
     *     
     */
    public void setVideoSourceConfigurationToken(OSDReference value) {
        this.videoSourceConfigurationToken = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link OSDType }
     *     
     */
    public OSDType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDType }
     *     
     */
    public void setType(OSDType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà position.
     * 
     * @return
     *     possible object is
     *     {@link OSDPosConfiguration }
     *     
     */
    public OSDPosConfiguration getPosition() {
        return position;
    }

    /**
     * Imposta il valore della proprietà position.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDPosConfiguration }
     *     
     */
    public void setPosition(OSDPosConfiguration value) {
        this.position = value;
    }

    /**
     * Recupera il valore della proprietà textString.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextConfiguration }
     *     
     */
    public OSDTextConfiguration getTextString() {
        return textString;
    }

    /**
     * Imposta il valore della proprietà textString.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextConfiguration }
     *     
     */
    public void setTextString(OSDTextConfiguration value) {
        this.textString = value;
    }

    /**
     * Recupera il valore della proprietà image.
     * 
     * @return
     *     possible object is
     *     {@link OSDImgConfiguration }
     *     
     */
    public OSDImgConfiguration getImage() {
        return image;
    }

    /**
     * Imposta il valore della proprietà image.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDImgConfiguration }
     *     
     */
    public void setImage(OSDImgConfiguration value) {
        this.image = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationExtension }
     *     
     */
    public OSDConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationExtension }
     *     
     */
    public void setExtension(OSDConfigurationExtension value) {
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
