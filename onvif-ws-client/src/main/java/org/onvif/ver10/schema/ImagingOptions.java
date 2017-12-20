
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Classe Java per ImagingOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensationOptions"/&gt;
 *         &lt;element name="Brightness" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="ColorSaturation" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Contrast" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Exposure" type="{http://www.onvif.org/ver10/schema}ExposureOptions"/&gt;
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusOptions"/&gt;
 *         &lt;element name="IrCutFilterModes" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Sharpness" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRangeOptions"/&gt;
 *         &lt;element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalanceOptions"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ImagingOptions", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilterModes",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "any"
})
public class ImagingOptions {

    @XmlElement(name = "BacklightCompensation", required = true)
    protected BacklightCompensationOptions backlightCompensation;
    @XmlElement(name = "Brightness", required = true)
    protected FloatRange brightness;
    @XmlElement(name = "ColorSaturation", required = true)
    protected FloatRange colorSaturation;
    @XmlElement(name = "Contrast", required = true)
    protected FloatRange contrast;
    @XmlElement(name = "Exposure", required = true)
    protected ExposureOptions exposure;
    @XmlElement(name = "Focus", required = true)
    protected FocusOptions focus;
    @XmlElement(name = "IrCutFilterModes", required = true)
    @XmlSchemaType(name = "string")
    protected List<IrCutFilterMode> irCutFilterModes;
    @XmlElement(name = "Sharpness", required = true)
    protected FloatRange sharpness;
    @XmlElement(name = "WideDynamicRange", required = true)
    protected WideDynamicRangeOptions wideDynamicRange;
    @XmlElement(name = "WhiteBalance", required = true)
    protected WhiteBalanceOptions whiteBalance;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Recupera il valore della proprietà backlightCompensation.
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationOptions }
     *     
     */
    public BacklightCompensationOptions getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * Imposta il valore della proprietà backlightCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationOptions }
     *     
     */
    public void setBacklightCompensation(BacklightCompensationOptions value) {
        this.backlightCompensation = value;
    }

    /**
     * Recupera il valore della proprietà brightness.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getBrightness() {
        return brightness;
    }

    /**
     * Imposta il valore della proprietà brightness.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setBrightness(FloatRange value) {
        this.brightness = value;
    }

    /**
     * Recupera il valore della proprietà colorSaturation.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getColorSaturation() {
        return colorSaturation;
    }

    /**
     * Imposta il valore della proprietà colorSaturation.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setColorSaturation(FloatRange value) {
        this.colorSaturation = value;
    }

    /**
     * Recupera il valore della proprietà contrast.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getContrast() {
        return contrast;
    }

    /**
     * Imposta il valore della proprietà contrast.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setContrast(FloatRange value) {
        this.contrast = value;
    }

    /**
     * Recupera il valore della proprietà exposure.
     * 
     * @return
     *     possible object is
     *     {@link ExposureOptions }
     *     
     */
    public ExposureOptions getExposure() {
        return exposure;
    }

    /**
     * Imposta il valore della proprietà exposure.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureOptions }
     *     
     */
    public void setExposure(ExposureOptions value) {
        this.exposure = value;
    }

    /**
     * Recupera il valore della proprietà focus.
     * 
     * @return
     *     possible object is
     *     {@link FocusOptions }
     *     
     */
    public FocusOptions getFocus() {
        return focus;
    }

    /**
     * Imposta il valore della proprietà focus.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOptions }
     *     
     */
    public void setFocus(FocusOptions value) {
        this.focus = value;
    }

    /**
     * Gets the value of the irCutFilterModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irCutFilterModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrCutFilterModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrCutFilterMode }
     * 
     * 
     */
    public List<IrCutFilterMode> getIrCutFilterModes() {
        if (irCutFilterModes == null) {
            irCutFilterModes = new ArrayList<IrCutFilterMode>();
        }
        return this.irCutFilterModes;
    }

    /**
     * Recupera il valore della proprietà sharpness.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getSharpness() {
        return sharpness;
    }

    /**
     * Imposta il valore della proprietà sharpness.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setSharpness(FloatRange value) {
        this.sharpness = value;
    }

    /**
     * Recupera il valore della proprietà wideDynamicRange.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRangeOptions }
     *     
     */
    public WideDynamicRangeOptions getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * Imposta il valore della proprietà wideDynamicRange.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRangeOptions }
     *     
     */
    public void setWideDynamicRange(WideDynamicRangeOptions value) {
        this.wideDynamicRange = value;
    }

    /**
     * Recupera il valore della proprietà whiteBalance.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceOptions }
     *     
     */
    public WhiteBalanceOptions getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * Imposta il valore della proprietà whiteBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceOptions }
     *     
     */
    public void setWhiteBalance(WhiteBalanceOptions value) {
        this.whiteBalance = value;
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
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
