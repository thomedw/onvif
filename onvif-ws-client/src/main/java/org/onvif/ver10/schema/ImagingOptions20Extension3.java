
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ImagingOptions20Extension3 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions20Extension3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToneCompensationOptions" type="{http://www.onvif.org/ver10/schema}ToneCompensationOptions" minOccurs="0"/&gt;
 *         &lt;element name="DefoggingOptions" type="{http://www.onvif.org/ver10/schema}DefoggingOptions" minOccurs="0"/&gt;
 *         &lt;element name="NoiseReductionOptions" type="{http://www.onvif.org/ver10/schema}NoiseReductionOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension3", propOrder = {
    "toneCompensationOptions",
    "defoggingOptions",
    "noiseReductionOptions",
    "extension"
})
public class ImagingOptions20Extension3 {

    @XmlElement(name = "ToneCompensationOptions")
    protected ToneCompensationOptions toneCompensationOptions;
    @XmlElement(name = "DefoggingOptions")
    protected DefoggingOptions defoggingOptions;
    @XmlElement(name = "NoiseReductionOptions")
    protected NoiseReductionOptions noiseReductionOptions;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension4 extension;

    /**
     * Recupera il valore della proprietà toneCompensationOptions.
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensationOptions }
     *     
     */
    public ToneCompensationOptions getToneCompensationOptions() {
        return toneCompensationOptions;
    }

    /**
     * Imposta il valore della proprietà toneCompensationOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensationOptions }
     *     
     */
    public void setToneCompensationOptions(ToneCompensationOptions value) {
        this.toneCompensationOptions = value;
    }

    /**
     * Recupera il valore della proprietà defoggingOptions.
     * 
     * @return
     *     possible object is
     *     {@link DefoggingOptions }
     *     
     */
    public DefoggingOptions getDefoggingOptions() {
        return defoggingOptions;
    }

    /**
     * Imposta il valore della proprietà defoggingOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link DefoggingOptions }
     *     
     */
    public void setDefoggingOptions(DefoggingOptions value) {
        this.defoggingOptions = value;
    }

    /**
     * Recupera il valore della proprietà noiseReductionOptions.
     * 
     * @return
     *     possible object is
     *     {@link NoiseReductionOptions }
     *     
     */
    public NoiseReductionOptions getNoiseReductionOptions() {
        return noiseReductionOptions;
    }

    /**
     * Imposta il valore della proprietà noiseReductionOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReductionOptions }
     *     
     */
    public void setNoiseReductionOptions(NoiseReductionOptions value) {
        this.noiseReductionOptions = value;
    }

    /**
     * Recupera il valore della proprietà extension.
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension4 }
     *     
     */
    public ImagingOptions20Extension4 getExtension() {
        return extension;
    }

    /**
     * Imposta il valore della proprietà extension.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension4 }
     *     
     */
    public void setExtension(ImagingOptions20Extension4 value) {
        this.extension = value;
    }

}
