
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ImagingSettingsExtension203 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ImagingSettingsExtension203"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToneCompensation" type="{http://www.onvif.org/ver10/schema}ToneCompensation" minOccurs="0"/&gt;
 *         &lt;element name="Defogging" type="{http://www.onvif.org/ver10/schema}Defogging" minOccurs="0"/&gt;
 *         &lt;element name="NoiseReduction" type="{http://www.onvif.org/ver10/schema}NoiseReduction" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension204" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingSettingsExtension203", propOrder = {
    "toneCompensation",
    "defogging",
    "noiseReduction",
    "extension"
})
public class ImagingSettingsExtension203 {

    @XmlElement(name = "ToneCompensation")
    protected ToneCompensation toneCompensation;
    @XmlElement(name = "Defogging")
    protected Defogging defogging;
    @XmlElement(name = "NoiseReduction")
    protected NoiseReduction noiseReduction;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension204 extension;

    /**
     * Recupera il valore della proprietà toneCompensation.
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensation }
     *     
     */
    public ToneCompensation getToneCompensation() {
        return toneCompensation;
    }

    /**
     * Imposta il valore della proprietà toneCompensation.
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensation }
     *     
     */
    public void setToneCompensation(ToneCompensation value) {
        this.toneCompensation = value;
    }

    /**
     * Recupera il valore della proprietà defogging.
     * 
     * @return
     *     possible object is
     *     {@link Defogging }
     *     
     */
    public Defogging getDefogging() {
        return defogging;
    }

    /**
     * Imposta il valore della proprietà defogging.
     * 
     * @param value
     *     allowed object is
     *     {@link Defogging }
     *     
     */
    public void setDefogging(Defogging value) {
        this.defogging = value;
    }

    /**
     * Recupera il valore della proprietà noiseReduction.
     * 
     * @return
     *     possible object is
     *     {@link NoiseReduction }
     *     
     */
    public NoiseReduction getNoiseReduction() {
        return noiseReduction;
    }

    /**
     * Imposta il valore della proprietà noiseReduction.
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReduction }
     *     
     */
    public void setNoiseReduction(NoiseReduction value) {
        this.noiseReduction = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public ImagingSettingsExtension204 getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public void setExtension(ImagingSettingsExtension204 value) {
        this.extension = value;
    }

}
