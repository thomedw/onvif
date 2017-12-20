
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Range of a rectangle. The rectangle itself is defined by lower left corner position and size. Units are pixel.
 * 
 * <p>Classe Java per IntRectangleRange complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IntRectangleRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="YRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="WidthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="HeightRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangleRange", propOrder = {
    "xRange",
    "yRange",
    "widthRange",
    "heightRange"
})
public class IntRectangleRange {

    @XmlElement(name = "XRange", required = true)
    protected IntRange xRange;
    @XmlElement(name = "YRange", required = true)
    protected IntRange yRange;
    @XmlElement(name = "WidthRange", required = true)
    protected IntRange widthRange;
    @XmlElement(name = "HeightRange", required = true)
    protected IntRange heightRange;

    /**
     * Recupera il valore della proprietà xRange.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getXRange() {
        return xRange;
    }

    /**
     * Imposta il valore della proprietà xRange.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setXRange(IntRange value) {
        this.xRange = value;
    }

    /**
     * Recupera il valore della proprietà yRange.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getYRange() {
        return yRange;
    }

    /**
     * Imposta il valore della proprietà yRange.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setYRange(IntRange value) {
        this.yRange = value;
    }

    /**
     * Recupera il valore della proprietà widthRange.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getWidthRange() {
        return widthRange;
    }

    /**
     * Imposta il valore della proprietà widthRange.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setWidthRange(IntRange value) {
        this.widthRange = value;
    }

    /**
     * Recupera il valore della proprietà heightRange.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getHeightRange() {
        return heightRange;
    }

    /**
     * Imposta il valore della proprietà heightRange.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setHeightRange(IntRange value) {
        this.heightRange = value;
    }

}
