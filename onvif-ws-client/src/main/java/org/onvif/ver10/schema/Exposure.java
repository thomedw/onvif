
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Exposure complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Exposure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/&gt;
 *         &lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority"/&gt;
 *         &lt;element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle"/&gt;
 *         &lt;element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure", propOrder = {
    "mode",
    "priority",
    "window",
    "minExposureTime",
    "maxExposureTime",
    "minGain",
    "maxGain",
    "minIris",
    "maxIris",
    "exposureTime",
    "gain",
    "iris"
})
public class Exposure {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureMode mode;
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected ExposurePriority priority;
    @XmlElement(name = "Window", required = true)
    protected Rectangle window;
    @XmlElement(name = "MinExposureTime")
    protected float minExposureTime;
    @XmlElement(name = "MaxExposureTime")
    protected float maxExposureTime;
    @XmlElement(name = "MinGain")
    protected float minGain;
    @XmlElement(name = "MaxGain")
    protected float maxGain;
    @XmlElement(name = "MinIris")
    protected float minIris;
    @XmlElement(name = "MaxIris")
    protected float maxIris;
    @XmlElement(name = "ExposureTime")
    protected float exposureTime;
    @XmlElement(name = "Gain")
    protected float gain;
    @XmlElement(name = "Iris")
    protected float iris;

    /**
     * Recupera il valore della proprietà mode.
     * 
     * @return
     *     possible object is
     *     {@link ExposureMode }
     *     
     */
    public ExposureMode getMode() {
        return mode;
    }

    /**
     * Imposta il valore della proprietà mode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMode }
     *     
     */
    public void setMode(ExposureMode value) {
        this.mode = value;
    }

    /**
     * Recupera il valore della proprietà priority.
     * 
     * @return
     *     possible object is
     *     {@link ExposurePriority }
     *     
     */
    public ExposurePriority getPriority() {
        return priority;
    }

    /**
     * Imposta il valore della proprietà priority.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposurePriority }
     *     
     */
    public void setPriority(ExposurePriority value) {
        this.priority = value;
    }

    /**
     * Recupera il valore della proprietà window.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getWindow() {
        return window;
    }

    /**
     * Imposta il valore della proprietà window.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setWindow(Rectangle value) {
        this.window = value;
    }

    /**
     * Recupera il valore della proprietà minExposureTime.
     * 
     */
    public float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Imposta il valore della proprietà minExposureTime.
     * 
     */
    public void setMinExposureTime(float value) {
        this.minExposureTime = value;
    }

    /**
     * Recupera il valore della proprietà maxExposureTime.
     * 
     */
    public float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Imposta il valore della proprietà maxExposureTime.
     * 
     */
    public void setMaxExposureTime(float value) {
        this.maxExposureTime = value;
    }

    /**
     * Recupera il valore della proprietà minGain.
     * 
     */
    public float getMinGain() {
        return minGain;
    }

    /**
     * Imposta il valore della proprietà minGain.
     * 
     */
    public void setMinGain(float value) {
        this.minGain = value;
    }

    /**
     * Recupera il valore della proprietà maxGain.
     * 
     */
    public float getMaxGain() {
        return maxGain;
    }

    /**
     * Imposta il valore della proprietà maxGain.
     * 
     */
    public void setMaxGain(float value) {
        this.maxGain = value;
    }

    /**
     * Recupera il valore della proprietà minIris.
     * 
     */
    public float getMinIris() {
        return minIris;
    }

    /**
     * Imposta il valore della proprietà minIris.
     * 
     */
    public void setMinIris(float value) {
        this.minIris = value;
    }

    /**
     * Recupera il valore della proprietà maxIris.
     * 
     */
    public float getMaxIris() {
        return maxIris;
    }

    /**
     * Imposta il valore della proprietà maxIris.
     * 
     */
    public void setMaxIris(float value) {
        this.maxIris = value;
    }

    /**
     * Recupera il valore della proprietà exposureTime.
     * 
     */
    public float getExposureTime() {
        return exposureTime;
    }

    /**
     * Imposta il valore della proprietà exposureTime.
     * 
     */
    public void setExposureTime(float value) {
        this.exposureTime = value;
    }

    /**
     * Recupera il valore della proprietà gain.
     * 
     */
    public float getGain() {
        return gain;
    }

    /**
     * Imposta il valore della proprietà gain.
     * 
     */
    public void setGain(float value) {
        this.gain = value;
    }

    /**
     * Recupera il valore della proprietà iris.
     * 
     */
    public float getIris() {
        return iris;
    }

    /**
     * Imposta il valore della proprietà iris.
     * 
     */
    public void setIris(float value) {
        this.iris = value;
    }

}
