
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ExposureOptions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExposureOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MinExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="MaxExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="MinGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="MaxGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="MinIris" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="MaxIris" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="ExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Gain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Iris" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureOptions", propOrder = {
    "mode",
    "priority",
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
public class ExposureOptions {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExposureMode> mode;
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExposurePriority> priority;
    @XmlElement(name = "MinExposureTime", required = true)
    protected FloatRange minExposureTime;
    @XmlElement(name = "MaxExposureTime", required = true)
    protected FloatRange maxExposureTime;
    @XmlElement(name = "MinGain", required = true)
    protected FloatRange minGain;
    @XmlElement(name = "MaxGain", required = true)
    protected FloatRange maxGain;
    @XmlElement(name = "MinIris", required = true)
    protected FloatRange minIris;
    @XmlElement(name = "MaxIris", required = true)
    protected FloatRange maxIris;
    @XmlElement(name = "ExposureTime", required = true)
    protected FloatRange exposureTime;
    @XmlElement(name = "Gain", required = true)
    protected FloatRange gain;
    @XmlElement(name = "Iris", required = true)
    protected FloatRange iris;

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureMode }
     * 
     * 
     */
    public List<ExposureMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<ExposureMode>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the priority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposurePriority }
     * 
     * 
     */
    public List<ExposurePriority> getPriority() {
        if (priority == null) {
            priority = new ArrayList<ExposurePriority>();
        }
        return this.priority;
    }

    /**
     * Recupera il valore della proprietà minExposureTime.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Imposta il valore della proprietà minExposureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinExposureTime(FloatRange value) {
        this.minExposureTime = value;
    }

    /**
     * Recupera il valore della proprietà maxExposureTime.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Imposta il valore della proprietà maxExposureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxExposureTime(FloatRange value) {
        this.maxExposureTime = value;
    }

    /**
     * Recupera il valore della proprietà minGain.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinGain() {
        return minGain;
    }

    /**
     * Imposta il valore della proprietà minGain.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinGain(FloatRange value) {
        this.minGain = value;
    }

    /**
     * Recupera il valore della proprietà maxGain.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxGain() {
        return maxGain;
    }

    /**
     * Imposta il valore della proprietà maxGain.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxGain(FloatRange value) {
        this.maxGain = value;
    }

    /**
     * Recupera il valore della proprietà minIris.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinIris() {
        return minIris;
    }

    /**
     * Imposta il valore della proprietà minIris.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinIris(FloatRange value) {
        this.minIris = value;
    }

    /**
     * Recupera il valore della proprietà maxIris.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxIris() {
        return maxIris;
    }

    /**
     * Imposta il valore della proprietà maxIris.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxIris(FloatRange value) {
        this.maxIris = value;
    }

    /**
     * Recupera il valore della proprietà exposureTime.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getExposureTime() {
        return exposureTime;
    }

    /**
     * Imposta il valore della proprietà exposureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setExposureTime(FloatRange value) {
        this.exposureTime = value;
    }

    /**
     * Recupera il valore della proprietà gain.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getGain() {
        return gain;
    }

    /**
     * Imposta il valore della proprietà gain.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setGain(FloatRange value) {
        this.gain = value;
    }

    /**
     * Recupera il valore della proprietà iris.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getIris() {
        return iris;
    }

    /**
     * Imposta il valore della proprietà iris.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setIris(FloatRange value) {
        this.iris = value;
    }

}
