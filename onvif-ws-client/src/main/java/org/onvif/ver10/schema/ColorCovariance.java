
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ColorCovariance complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ColorCovariance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="XX" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="YY" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="ZZ" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="XY" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="XZ" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="YZ" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorCovariance")
public class ColorCovariance {

    @XmlAttribute(name = "XX", required = true)
    protected float xx;
    @XmlAttribute(name = "YY", required = true)
    protected float yy;
    @XmlAttribute(name = "ZZ", required = true)
    protected float zz;
    @XmlAttribute(name = "XY")
    protected Float xy;
    @XmlAttribute(name = "XZ")
    protected Float xz;
    @XmlAttribute(name = "YZ")
    protected Float yz;
    @XmlAttribute(name = "Colorspace")
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;

    /**
     * Recupera il valore della proprietà xx.
     * 
     */
    public float getXX() {
        return xx;
    }

    /**
     * Imposta il valore della proprietà xx.
     * 
     */
    public void setXX(float value) {
        this.xx = value;
    }

    /**
     * Recupera il valore della proprietà yy.
     * 
     */
    public float getYY() {
        return yy;
    }

    /**
     * Imposta il valore della proprietà yy.
     * 
     */
    public void setYY(float value) {
        this.yy = value;
    }

    /**
     * Recupera il valore della proprietà zz.
     * 
     */
    public float getZZ() {
        return zz;
    }

    /**
     * Imposta il valore della proprietà zz.
     * 
     */
    public void setZZ(float value) {
        this.zz = value;
    }

    /**
     * Recupera il valore della proprietà xy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXY() {
        return xy;
    }

    /**
     * Imposta il valore della proprietà xy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXY(Float value) {
        this.xy = value;
    }

    /**
     * Recupera il valore della proprietà xz.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXZ() {
        return xz;
    }

    /**
     * Imposta il valore della proprietà xz.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXZ(Float value) {
        this.xz = value;
    }

    /**
     * Recupera il valore della proprietà yz.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYZ() {
        return yz;
    }

    /**
     * Imposta il valore della proprietà yz.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYZ(Float value) {
        this.yz = value;
    }

    /**
     * Recupera il valore della proprietà colorspace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorspace() {
        return colorspace;
    }

    /**
     * Imposta il valore della proprietà colorspace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorspace(String value) {
        this.colorspace = value;
    }

}
