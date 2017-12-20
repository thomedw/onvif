
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
 * <p>Classe Java per OSDTextConfiguration complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OSDTextConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColor" minOccurs="0"/&gt;
 *         &lt;element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColor" minOccurs="0"/&gt;
 *         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "OSDTextConfiguration", propOrder = {
    "type",
    "dateFormat",
    "timeFormat",
    "fontSize",
    "fontColor",
    "backgroundColor",
    "plainText",
    "extension"
})
public class OSDTextConfiguration {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "DateFormat")
    protected String dateFormat;
    @XmlElement(name = "TimeFormat")
    protected String timeFormat;
    @XmlElement(name = "FontSize")
    protected Integer fontSize;
    @XmlElement(name = "FontColor")
    protected OSDColor fontColor;
    @XmlElement(name = "BackgroundColor")
    protected OSDColor backgroundColor;
    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "Extension")
    protected OSDTextConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà dateFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Imposta il valore della proprietà dateFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Recupera il valore della proprietà timeFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Imposta il valore della proprietà timeFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Recupera il valore della proprietà fontSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Imposta il valore della proprietà fontSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    /**
     * Recupera il valore della proprietà fontColor.
     * 
     * @return
     *     possible object is
     *     {@link OSDColor }
     *     
     */
    public OSDColor getFontColor() {
        return fontColor;
    }

    /**
     * Imposta il valore della proprietà fontColor.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColor }
     *     
     */
    public void setFontColor(OSDColor value) {
        this.fontColor = value;
    }

    /**
     * Recupera il valore della proprietà backgroundColor.
     * 
     * @return
     *     possible object is
     *     {@link OSDColor }
     *     
     */
    public OSDColor getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Imposta il valore della proprietà backgroundColor.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColor }
     *     
     */
    public void setBackgroundColor(OSDColor value) {
        this.backgroundColor = value;
    }

    /**
     * Recupera il valore della proprietà plainText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * Imposta il valore della proprietà plainText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextConfigurationExtension }
     *     
     */
    public OSDTextConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextConfigurationExtension }
     *     
     */
    public void setExtension(OSDTextConfigurationExtension value) {
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
