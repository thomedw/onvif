
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
 * Type describing the ImagingSettings of a VideoSource. The supported options and ranges can be obtained via the GetOptions command.
 * 
 * <p>Classe Java per ImagingSettings20 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ImagingSettings20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensation20" minOccurs="0"/&gt;
 *         &lt;element name="Brightness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ColorSaturation" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Contrast" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Exposure" type="{http://www.onvif.org/ver10/schema}Exposure20" minOccurs="0"/&gt;
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20" minOccurs="0"/&gt;
 *         &lt;element name="IrCutFilter" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" minOccurs="0"/&gt;
 *         &lt;element name="Sharpness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRange20" minOccurs="0"/&gt;
 *         &lt;element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalance20" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension20" minOccurs="0"/&gt;
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
@XmlType(name = "ImagingSettings20", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilter",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "extension"
})
public class ImagingSettings20 {

    @XmlElement(name = "BacklightCompensation")
    protected BacklightCompensation20 backlightCompensation;
    @XmlElement(name = "Brightness")
    protected Float brightness;
    @XmlElement(name = "ColorSaturation")
    protected Float colorSaturation;
    @XmlElement(name = "Contrast")
    protected Float contrast;
    @XmlElement(name = "Exposure")
    protected Exposure20 exposure;
    @XmlElement(name = "Focus")
    protected FocusConfiguration20 focus;
    @XmlElement(name = "IrCutFilter")
    @XmlSchemaType(name = "string")
    protected IrCutFilterMode irCutFilter;
    @XmlElement(name = "Sharpness")
    protected Float sharpness;
    @XmlElement(name = "WideDynamicRange")
    protected WideDynamicRange20 wideDynamicRange;
    @XmlElement(name = "WhiteBalance")
    protected WhiteBalance20 whiteBalance;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension20 extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà backlightCompensation.
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensation20 }
     *     
     */
    public BacklightCompensation20 getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * Imposta il valore della proprietà backlightCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensation20 }
     *     
     */
    public void setBacklightCompensation(BacklightCompensation20 value) {
        this.backlightCompensation = value;
    }

    /**
     * Recupera il valore della proprietà brightness.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * Imposta il valore della proprietà brightness.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBrightness(Float value) {
        this.brightness = value;
    }

    /**
     * Recupera il valore della proprietà colorSaturation.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getColorSaturation() {
        return colorSaturation;
    }

    /**
     * Imposta il valore della proprietà colorSaturation.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setColorSaturation(Float value) {
        this.colorSaturation = value;
    }

    /**
     * Recupera il valore della proprietà contrast.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getContrast() {
        return contrast;
    }

    /**
     * Imposta il valore della proprietà contrast.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setContrast(Float value) {
        this.contrast = value;
    }

    /**
     * Recupera il valore della proprietà exposure.
     * 
     * @return
     *     possible object is
     *     {@link Exposure20 }
     *     
     */
    public Exposure20 getExposure() {
        return exposure;
    }

    /**
     * Imposta il valore della proprietà exposure.
     * 
     * @param value
     *     allowed object is
     *     {@link Exposure20 }
     *     
     */
    public void setExposure(Exposure20 value) {
        this.exposure = value;
    }

    /**
     * Recupera il valore della proprietà focus.
     * 
     * @return
     *     possible object is
     *     {@link FocusConfiguration20 }
     *     
     */
    public FocusConfiguration20 getFocus() {
        return focus;
    }

    /**
     * Imposta il valore della proprietà focus.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusConfiguration20 }
     *     
     */
    public void setFocus(FocusConfiguration20 value) {
        this.focus = value;
    }

    /**
     * Recupera il valore della proprietà irCutFilter.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterMode }
     *     
     */
    public IrCutFilterMode getIrCutFilter() {
        return irCutFilter;
    }

    /**
     * Imposta il valore della proprietà irCutFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterMode }
     *     
     */
    public void setIrCutFilter(IrCutFilterMode value) {
        this.irCutFilter = value;
    }

    /**
     * Recupera il valore della proprietà sharpness.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSharpness() {
        return sharpness;
    }

    /**
     * Imposta il valore della proprietà sharpness.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSharpness(Float value) {
        this.sharpness = value;
    }

    /**
     * Recupera il valore della proprietà wideDynamicRange.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRange20 }
     *     
     */
    public WideDynamicRange20 getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * Imposta il valore della proprietà wideDynamicRange.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRange20 }
     *     
     */
    public void setWideDynamicRange(WideDynamicRange20 value) {
        this.wideDynamicRange = value;
    }

    /**
     * Recupera il valore della proprietà whiteBalance.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalance20 }
     *     
     */
    public WhiteBalance20 getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * Imposta il valore della proprietà whiteBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalance20 }
     *     
     */
    public void setWhiteBalance(WhiteBalance20 value) {
        this.whiteBalance = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension20 }
     *     
     */
    public ImagingSettingsExtension20 getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension20 }
     *     
     */
    public void setExtension(ImagingSettingsExtension20 value) {
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
